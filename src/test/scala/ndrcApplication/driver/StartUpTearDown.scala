/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ndrcApplication.driver

import io.cucumber.scala.ScalaDsl
import org.mockserver.integration.ClientAndServer
import org.mockserver.matchers.{TimeToLive, Times}
import org.mockserver.mock.Expectation
import org.mockserver.model.{HttpRequest, HttpResponse}
import org.openqa.selenium.WebDriver

import java.util.concurrent.TimeUnit

trait StartUpTearDown extends ScalaDsl {

  def isJsDisabled: Boolean = false

  def driver: WebDriver = Driver.webDriver

  implicit lazy val webDriver: WebDriver = driver

  val mockServer: ClientAndServer = ClientAndServer.startClientAndServer(6001)
  val journeyId: String = "Test-id"
  val alfStubbedUrl: String = s"http://localhost:9028/lookup-address/$journeyId/confirm"
  val ndrcBaseUrl: String = "http://localhost:8450/apply-for-repayment-of-import-duty-and-import-vat"
  val callBackUrl: String = s"$ndrcBaseUrl/select-importer-address/update?id=$journeyId"
  val callBackUrlAgent: String = s"$ndrcBaseUrl/your-business-address/update?id=$journeyId"
  val expectedAlfResponse: String =
    """{
      | "auditRef" : "some-ref",
      | "id" : "123456789",
      | "address" : {
      |   "organisation" : "organisation",
      |   "lines" :[
      |     "1 test Street",
      |     "Test borough",
      |     "Test town",
      |     "Test city"
      |   ],
      |   "postcode" : "TE5 5TD",
      |   "country"  :{
      |     "code" : "GB",
      |     "name" : "United Kingdom"
      |   }
      | }
      |}""".stripMargin

  Before {

    def apiInit(callBackUrl: String): Array[Expectation] =
      mockServer.when(
        HttpRequest
          .request()
          .withPath("/api/init"),
        Times.exactly(1),
        TimeToLive.exactly(TimeUnit.SECONDS, 60L),
        0
      ) respond {
        HttpResponse
          .response()
          .withHeader("Location", callBackUrl)
          .withStatusCode(202)
      }

    def apiConfirmed: Array[Expectation] =
      mockServer.when(
        HttpRequest
          .request()
          .withPath("/api/confirmed")
          .withQueryStringParameter("id", journeyId),
        Times.exactly(1),
        TimeToLive.exactly(TimeUnit.SECONDS, 60L),
        0
      ) respond {
        HttpResponse
          .response()
          .withHeader("Content-Type", "application/json")
          .withBody(expectedAlfResponse)
          .withStatusCode(200)
      }

    def alfStubbed: Array[Expectation] =
      mockServer.when(
        HttpRequest
          .request()
          .withPath(alfStubbedUrl),
        Times.exactly(1),
        TimeToLive.exactly(TimeUnit.SECONDS, 60L),
        0
      ) respond {
        HttpResponse
          .response()
          .withHeader("Location", callBackUrl)
          .withStatusCode(303)
      }

    apiInit(callBackUrl) ++
      alfStubbed ++
      apiConfirmed ++
      apiInit(callBackUrlAgent) ++
      alfStubbed ++
      apiConfirmed

    ()
  }

  After {
    mockServer.stop()
  }
}
