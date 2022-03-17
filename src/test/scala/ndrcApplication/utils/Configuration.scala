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

import ndrcApplication.utils.Configuration.Urls._

import java.time.LocalDate
import scala.util.Try

case class Configuration(
  authLogin: String,
  ndrcBaseUrl: String,
  ndrcApplicationLandingUrl: String,
  timeout: Int
)

object Configuration {

  val local_date: LocalDate = Try(LocalDate.parse(System.getProperty("local-date", ""))).getOrElse(LocalDate.now)

  val environment: Environment.Name = {
    val environmentProperty = System.getProperty("environment", "local").toLowerCase
    environmentProperty match {
      case "local" => Environment.local
      case "qa" => Environment.qa
      case "staging" => Environment.staging
      case _ => throw new IllegalArgumentException(s"Environment '$environmentProperty' not known")
    }
  }

  lazy val settings: Configuration = create()

  def create(): Configuration = {
    environment match {
      case Environment.local =>
        new Configuration(
          authLogin = "http://localhost:9949/auth-login-stub/gg-sign-in",
          ndrcBaseUrl = s"$localhost$ndrcBaseUrl",
          ndrcApplicationLandingUrl = s"$localhost$ndrcBaseUrl/what-do-you-want-to-do",
          timeout = 10
        )
      case Environment.qa =>
        new Configuration(
          authLogin = s"$qaUrl/auth-login-stub/gg-sign-in",
          ndrcBaseUrl = s"$qaUrl$ndrcBaseUrl",
          ndrcApplicationLandingUrl = s"$ndrcBaseUrl/what-do-you-want-to-do",
          timeout = 10
        )
      case Environment.staging =>
        new Configuration(
          authLogin = s"$stagingUrl/auth-login-stub/gg-sign-in",
          ndrcBaseUrl = s"$stagingUrl$ndrcBaseUrl",
          ndrcApplicationLandingUrl = s"$ndrcBaseUrl/what-do-you-want-to-do",
          timeout = 10
        )
      case _ => throw new IllegalArgumentException(s"Environment '$environment' not known")
    }
  }

  object Environment extends Enumeration {
    type Name = Value
    val local, qa, staging = Value
  }

  object Urls {
    val localhost = "http://localhost:8450"
    val qaUrl = "https://www.qa.tax.service.gov.uk"
    val stagingUrl = "https://www.staging.tax.service.gov.uk"
    val ndrcBaseUrl = "/apply-for-repayment-of-import-duty-and-import-vat"
  }
}

