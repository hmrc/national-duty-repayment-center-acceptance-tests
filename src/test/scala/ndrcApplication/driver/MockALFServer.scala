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

import org.mockserver.integration.ClientAndServer
import org.mockserver.model.{HttpRequest, HttpResponse}

import java.util.UUID

object MockALFServer {
  val mockServer: ClientAndServer = ClientAndServer.startClientAndServer(6001)
  val journeyId: String = UUID.randomUUID().toString
  val alfStubbedUrl: String = s"http://localhost:9028/lookup-address/$journeyId/lookup"
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

  mockServer.when {
    HttpRequest
      .request()
      .withMethod("POST")
      .withPath("/api/init")
  } respond {
    HttpResponse
      .response()
      .withHeader("Location", callBackUrl)
      .withStatusCode(202)
  }

  mockServer.when {
    HttpRequest
      .request()
      .withMethod("GET")
      .withPath("/api/confirmed")
      .withQueryStringParameter("id", journeyId)
  } respond {
    HttpResponse
      .response()
      .withHeader("Content-Type", "application/json")
      .withBody(expectedAlfResponse)
      .withStatusCode(200)
  }

  mockServer.when {
    HttpRequest
      .request()
      .withMethod("GET")
      .withPath(alfStubbedUrl)
  } respond {
    HttpResponse
      .response()
      .withHeader("Location", callBackUrl)
      .withStatusCode(303)
  }
}

//2nd return url http://localhost:8450/apply-for-repayment-of-import-duty-and-import-vat/contact
