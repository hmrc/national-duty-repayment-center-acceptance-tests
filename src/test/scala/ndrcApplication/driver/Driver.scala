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

import ndrcApplication.driver.Browser._
import org.openqa.selenium.WebDriver

object Driver extends Driver

class Driver {

  val targetBrowser: String = Option(systemProperties.getProperty("browser")).map(_.toLowerCase).getOrElse("chrome")

  val webDriver: WebDriver = {

    var selectedDriver: WebDriver = null
    sys.addShutdownHook(createRemoteDriver().quit())

    targetBrowser match {
      case "firefox" | "zap-firefox" | "remote-firefox"                  =>
        selectedDriver = createRemoteDriver()
      case "chrome" | "headless-chrome" | "zap-chrome" | "remote-chrome" =>
        selectedDriver = createRemoteChromeDriver()
      case _                                                             => throw new IllegalArgumentException(s"target browser $targetBrowser not recognised")
    }

    selectedDriver.getWindowHandle
    selectedDriver
  }
}
