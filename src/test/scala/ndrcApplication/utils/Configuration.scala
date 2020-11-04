/*
 * Copyright 2020 HM Revenue & Customs
 *
 */

package ndrcApplication.utils

import java.time.LocalDate

import scala.util.Try

case class Configuration(baseUrl: String, authLogin:String, ndrcApplicationFileUploadLandingUrl:String, timeout: Int)

object Configuration {

val local_date: LocalDate = Try(LocalDate.parse(System.getProperty("local-date", ""))).getOrElse(LocalDate.now)

  val environment: Environment.Name = {
    val environmentProperty = System.getProperty("environment", "local").toLowerCase
    environmentProperty match {
      case "local" => Environment.local
      case "dev" => Environment.dev
      case "qa" => Environment.qa
      case "staging" => Environment.staging
      case _ => throw new IllegalArgumentException(s"Environment '$environmentProperty' not known")
    }
  }

  lazy val settings: Configuration = create()
  def create(): Configuration = {
    environment match {
      case Environment.dev =>
        new Configuration(
          baseUrl = "www.development.tax.service.gov.uk",
          authLogin = "https://www.development.tax.service.gov.uk/auth-login-stub/gg-sign-in",
          timeout = 10
        )
      case Environment.local =>
        new Configuration(
        baseUrl = "",
         authLogin = "",
          timeout = 10
        )
      case Environment.qa =>
        new Configuration(
          baseUrl = "https://www.qa.tax.service.gov.uk",
          authLogin = "https://www.qa.tax.service.gov.uk/auth-login-stub/gg-sign-in",
          timeout = 10
        )
      case Environment.staging =>
        new Configuration(
          baseUrl = "https://www.staging.tax.service.gov.uk",
          authLogin = "https://www.staging.tax.service.gov.uk/auth-login-stub/gg-sign-in",
          timeout = 10
        )
      case _ => throw new IllegalArgumentException(s"Environment '$environment' not known")
    }
  }
  object Environment extends Enumeration {
    type Name = Value
    val local, dev, qa, staging = Value
  }
}

