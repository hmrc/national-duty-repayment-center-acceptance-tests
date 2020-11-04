/*
 * Copyright 2020 HM Revenue & Customs
 *
 */

package ndrcApplication.driver

import java.util.Properties

import org.apache.commons.lang3.StringUtils
import org.openqa.selenium.WebDriver
import uk.gov.hmrc.webdriver.SingletonDriver

object Browser {

  lazy val systemProperties: Properties = System.getProperties

  def javascriptEnabled: Boolean = {
    if (StringUtils.isEmpty(systemProperties.getProperty("javascriptEnabled"))) true
    else false
  }

  def createRemoteDriver(): WebDriver = {
    SingletonDriver.getInstance()
  }
}
