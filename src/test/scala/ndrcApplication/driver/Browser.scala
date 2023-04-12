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

import com.github.tomakehurst.wiremock.core.WireMockConfiguration.options

import java.util.Properties
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import uk.gov.hmrc.webdriver.SingletonDriver

object Browser {

  lazy val systemProperties: Properties = System.getProperties

  def javascriptDisabled: Boolean = Option(systemProperties.getProperty("disable.javascript")).exists(_.toBoolean)

  def createRemoteDriver(): WebDriver       =
    SingletonDriver.getInstance()
  def createRemoteChromeDriver(): WebDriver = {
    val options = new ChromeOptions()
    options.addArguments("--remote-allow-origins=*")
    options.addArguments("test-type")
    options.addArguments("--disable-gpu")
    options.addArguments("start-maximized")

    sys.addShutdownHook(SingletonDriver.closeInstance())

    SingletonDriver.getInstance(Some(options))
  }
}
