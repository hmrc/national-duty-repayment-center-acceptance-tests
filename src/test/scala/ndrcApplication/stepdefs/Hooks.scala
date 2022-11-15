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

package ndrcApplication.stepdefs

import org.junit.{After, Before}
import org.openqa.selenium._
import _root_.io.cucumber.scala.Scenario
import ndrcApplication.pages.commonMethods

class Hooks extends commonMethods {

  @Before
  def initialize(): Unit = {
    webDriver.manage().deleteAllCookies()
  }

  @After
  def tearDown(result: Scenario): Unit = {
    if (result.isFailed) {
      webDriver match {
        case screenshot1: TakesScreenshot =>
          try {
            val screenshot = screenshot1.getScreenshotAs(OutputType.BYTES)
            result.attach(
              data = screenshot,
              mediaType = "image/png",
              name = "screenshot"
            )
          } catch {
            case somePlatformsDontSupportScreenshots: WebDriverException =>
              System.err.println(somePlatformsDontSupportScreenshots.getMessage)
          }
        case _                            =>
      }

    }
  }

}
