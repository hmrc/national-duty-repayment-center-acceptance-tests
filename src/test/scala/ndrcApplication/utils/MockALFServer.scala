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

package ndrcApplication.utils

import address.v2.Country
import com.typesafe.scalalogging.Logger
import controllers.api.{ConfirmedResponseAddress, ConfirmedResponseAddressDetails}
import org.mockserver.integration.ClientAndServer
import org.mockserver.model.{HttpRequest, HttpResponse}
import play.api.libs.json.{JsValue, Json}

import java.util.UUID

object MockALFServer {
  val mockServer: ClientAndServer = ClientAndServer.startClientAndServer(6001)
  val journeyId: String = UUID.randomUUID().toString
  val alfStubbedUrl: String = s"http://localhost:9028/lookup-address/$journeyId/lookup"
  val urlAlfReturnsUserTo: String = "http://your.service/some/path"

  private val logger = Logger(this.getClass)

  logger.info(s"\n\n\n\nMockALFServer running\n\n\n")

  mockServer.when(
    HttpRequest.request()
      .withMethod("POST")
      .withPath("/api/init")
  ) respond {
    logger.info(s"\n\n\n\nPOST - /api/v2/init\n\n\n")
    HttpResponse
      .response()
      .withHeader("Location", "alfStubbedUrl")
      .withStatusCode(200)
  }

  mockServer.when(
    HttpRequest.request()
      .withMethod("GET")
      .withPath(alfStubbedUrl)
  ) respond {
    logger.info(s"\n\n\n\nGET - $alfStubbedUrl\n\n\n")
    HttpResponse
      .response()
      .withHeader("Location", urlAlfReturnsUserTo)
      .withStatusCode(303)
  }

  val expectedAlfResponse: JsValue = Json.toJson(
    ConfirmedResponseAddress(
      auditRef = "some-ref",
      id       = Some("123456789"),
      address  = ConfirmedResponseAddressDetails(
        organisation = Some("organisation"),
        lines        = Some(List("1 test Street")),
        postcode     = Some("TE5 5TD"),
        country      = Some(Country("UK", "United Kingdom")),
        poBox        = None
      )
    )
  )

  mockServer.when(
    HttpRequest
      .request()
      .withMethod("GET")
      .withPath(s"/api/confirmed?id=$journeyId")
  ) respond {
    logger.info(s"\n\n\n\nGET - /api/confirmed?id=$journeyId\n\n\n")
    HttpResponse.response()
      .withHeader("Content-Type", "application/json")
      .withBody(expectedAlfResponse.toString())
      .withStatusCode(200)
  }
}
