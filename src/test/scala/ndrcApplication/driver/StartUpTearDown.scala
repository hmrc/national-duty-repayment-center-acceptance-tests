/*
 * Copyright 2023 HM Revenue & Customs
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

import com.github.tomakehurst.wiremock.WireMockServer
import com.github.tomakehurst.wiremock.client.WireMock._
import com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig
import io.cucumber.scala.ScalaDsl
import org.openqa.selenium.WebDriver

trait StartUpTearDown extends ScalaDsl {

  def isJsDisabled: Boolean = false

  def driver: WebDriver = Driver.webDriver

  implicit lazy val webDriver: WebDriver = driver

  val server: WireMockServer = new WireMockServer(wireMockConfig().port(6001))

  private val journeyId: String           = "Test-id"
  private val alfStubbedUrl: String       = "http://localhost:9028/lookup-address/Test-id/confirm"
  private val ndrcBaseUrl: String         = "http://localhost:8450/apply-for-repayment-of-import-duty-and-import-vat"
  private val callBackUrl: String         = s"$ndrcBaseUrl/select-importer-address/update?id=$journeyId"
  private val callBackUrlAgent: String    = s"$ndrcBaseUrl/your-business-address/update?id=$journeyId"
  private val expectedAlfResponse: String =
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

    server.stubFor(
      post(urlEqualTo("/api/init"))
        .withRequestBody(
          matchingJsonPath(
            "$.options.continueUrl",
            containing(s"$ndrcBaseUrl/select-importer-address/update")
          )
        )
        .willReturn(
          aResponse
            .withStatus(202)
            .withHeader("Location", callBackUrl)
        )
    )

    server.stubFor(
      post(urlEqualTo("/api/init"))
        .withRequestBody(
          matchingJsonPath(
            "$.options.continueUrl",
            containing(s"$ndrcBaseUrl/your-business-address/update")
          )
        )
        .willReturn(
          aResponse
            .withStatus(202)
            .withHeader("Location", callBackUrlAgent)
        )
    )

    server.stubFor(
      get(urlEqualTo(s"/api/confirmed?id=$journeyId"))
        .willReturn(
          aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(expectedAlfResponse)
        )
    )

    server.stubFor(
      get(urlEqualTo(alfStubbedUrl))
        .willReturn(
          aResponse
            .withStatus(303)
            .withHeader("Location", callBackUrl)
        )
    )

    server.start()
  }

  After {
    server.stop()
  }
}
