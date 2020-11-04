/*
 * Copyright 2020 HM Revenue & Customs
 *
 */

package ndrcApplication.driver

import org.junit.Before

trait StartUpTearDown {

  def isJsDisabled: Boolean = false

  def driver = Driver.webDriver

  implicit lazy val webDriver = driver

  @Before
  def initialize() {
    driver.manage().deleteAllCookies()
  }
}
