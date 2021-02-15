/*
 * Copyright 2021 HM Revenue & Customs
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

import cucumber.api.Scenario
import cucumber.api.java.{After, Before}
import org.openqa.selenium._

class Hooks extends WebDriverInstance {

  @Before
  def initialize() {
    driver.manage().deleteAllCookies()
  }

  @After
  def tearDown(result: Scenario) {
    if (result.isFailed) {
      driver match {
        case screenshot1: TakesScreenshot =>
          try {
            val screenshot = screenshot1.getScreenshotAs(OutputType.BYTES)
            result.embed(screenshot, "image/png")
          } catch {
            case somePlatformsDontSupportScreenshots: WebDriverException => System.err.println(somePlatformsDontSupportScreenshots.getMessage)
          }
        case _ =>
      }

    }
  }

}
