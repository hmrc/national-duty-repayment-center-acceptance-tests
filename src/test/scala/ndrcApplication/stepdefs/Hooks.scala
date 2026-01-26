/*
 * Copyright 2026 HM Revenue & Customs
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

package ndrcApplication.stepdefs

import io.cucumber.scala.{ScalaDsl, Scenario}
import org.openqa.selenium.{OutputType, TakesScreenshot}
import ndrcApplication.pages.commonMethods
import org.apache.commons.io.FileUtils
import uk.gov.hmrc.selenium.webdriver.Browser

import java.io.File

class Hooks extends commonMethods with ScalaDsl with Browser {

  Before {
    startBrowser()
    driver.manage().deleteAllCookies()
  }

  After { scenario: Scenario =>
    if (scenario.isFailed) {
      val screenshotName = scenario.getName.replaceAll(" ", "_")
      val screenshot = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.BYTES)
      val screenshotFile = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
      val screenshotDestination: String = "./target/screenshots/" + screenshotName + ".png"

      FileUtils.copyFile(screenshotFile, new File(screenshotDestination))
      scenario.attach(screenshot, "image/png", screenshotName)
    }
    quitBrowser()
  }

}
