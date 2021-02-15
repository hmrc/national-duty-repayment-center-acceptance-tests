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

package ndrcApplication.pages

import java.util.concurrent.TimeUnit

import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait, Select, Wait}
import org.openqa.selenium.{By, NoSuchElementException, WebDriver}
import org.scalatest.MustMatchers
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium._
import ndrcApplication.driver.Driver
import ndrcApplication.stepdefs.WebDriverInstance
import org.openqa.selenium.remote.{LocalFileDetector, RemoteWebDriver}


abstract class commonMethods extends WebBrowser with Eventually with MustMatchers with WebDriverInstance {

  var fluentWait: Wait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(30, TimeUnit.SECONDS)
    .pollingEvery(100, TimeUnit.MILLISECONDS)

  def navigateToPage(url: String) {
    driver.navigate().to(url)
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

  def optionSelected(css: String): Unit = driver.findElement(By.cssSelector(css)).isSelected mustBe(true)

  def optionNoSelected(css: String): Unit = driver.findElement(By.cssSelector(css)).isSelected mustBe(false)

  def isElementVisible(css: String): Boolean = driver.findElement(By.cssSelector(css)).isDisplayed

}