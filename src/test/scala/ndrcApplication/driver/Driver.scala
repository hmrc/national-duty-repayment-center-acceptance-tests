/*
 * Copyright 2020 HM Revenue & Customs
 *
 */

package ndrcApplication.driver


import org.openqa.selenium.WebDriver

import scala.util.Try

object Driver extends Driver

class Driver {

  val targetBrowser: String = Option(systemProperties.getProperty("browser")).map(_.toLowerCase).getOrElse("chrome")
//  private val pwd: String = System.getProperty("user.dir")
//  System.setProperty("webdriver.chrome.driver", pwd + "/drivers/chromedriver")

  val webDriver: WebDriver = {

    var selectedDriver: WebDriver = null
    sys addShutdownHook {
      Try(webDriver.quit())
    }
      targetBrowser match {
        case "chrome" | "firefox" | "zap-firefox" | "zap-chrome" | "remote-chrome" | "remote-firefox" => selectedDriver = createRemoteDriver()
        case _ => throw new IllegalArgumentException(s"target browser $targetBrowser not recognised")
      }

    selectedDriver.getWindowHandle
    selectedDriver
  }
}
