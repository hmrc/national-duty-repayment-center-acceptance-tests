/*
 * Copyright 2020 HM Revenue & Customs
 *
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
