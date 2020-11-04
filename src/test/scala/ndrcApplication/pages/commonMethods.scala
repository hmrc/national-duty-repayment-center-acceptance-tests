/*
 * Copyright 2020 HM Revenue & Customs
 *
 */

package ndrcApplication.pages

import java.util.concurrent.TimeUnit

import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait, Select, Wait}
import org.openqa.selenium.{By, NoSuchElementException, WebDriver}
import org.scalatest.MustMatchers
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium._

import org.openqa.selenium.remote.{LocalFileDetector, RemoteWebDriver}

abstract class commonMethods extends WebBrowser with Eventually with MustMatchers with WebDriverInstance {

  var fluentWait: Wait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(30, TimeUnit.SECONDS)
    .pollingEvery(100, TimeUnit.MILLISECONDS)

  val usrDir = System.getProperty("user.dir") + "/src/test/resources/filestoupload/"
  var filePath = ""

  def navigateToPage(url: String) {
    driver.navigate().to(url)
  }

  def selectDropdown(affinityGroup: By, level: String) = {
    val dropdown = new Select(driver.findElement(affinityGroup))
    dropdown.selectByVisibleText(level)
  }

  def isPageTitleDisplayed(pageTitle: String): Boolean = {
    try {
      fluentWait.until(ExpectedConditions.titleIs(pageTitle))
      true
    } catch {
      case _  : NoSuchElementException => false
    }
  }

  def clickOnButton(identifier: By): Unit = {
    fluentWait.until(ExpectedConditions.elementToBeClickable(identifier))
    driver.findElement(identifier).click()
  }

  def enterValInTextField (identifier: By, value: String): Unit = {
    fluentWait.until(ExpectedConditions.visibilityOfElementLocated(identifier))
    driver.findElement(identifier).sendKeys(value)
  }

  if(Driver.targetBrowser.startsWith("remote")) {
      Driver.webDriver.asInstanceOf[RemoteWebDriver].setFileDetector(new LocalFileDetector)
    }
    driver.findElement(By.id(elementID)).sendKeys(filePath)
  }
}