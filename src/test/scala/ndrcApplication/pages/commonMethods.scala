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

package ndrcApplication.pages

import ndrcApplication.driver.Driver
import org.openqa.selenium.support.ui.{FluentWait, Select}
import org.openqa.selenium.{By, NoSuchElementException, WebDriver, WebElement}
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.must.Matchers.{convertToAnyMustWrapper, message}

import java.time.Duration

abstract class commonMethods extends Eventually {

  implicit val webDriver: WebDriver = Driver.webDriver

  implicit val waitFor: FluentWait[WebDriver] =
    new FluentWait[WebDriver](webDriver)
      .withTimeout(Duration.ofSeconds(30))
      .pollingEvery(Duration.ofMillis(500))

  val usrDir: String = System.getProperty("user.dir") + "/src/test/resources/filestoupload/"
  var filePath       = ""

  def navigateToPage(url: String): Unit =
    webDriver.navigate().to(url)

  def isPageTitleDisplayed(pageTitle: String): Boolean =
    try
      waitFor.until(_.getTitle == pageTitle)
    catch {
      case _: NoSuchElementException => false
    }

  def clickOnButton(identifier: By): Unit = {
    waitFor.until(_.findElement(identifier).isDisplayed)
    webDriver.findElement(identifier).click()
  }

  def selectDropdown(affinityGroup: By, level: String): Unit = {
    val dropdown = new Select(webDriver.findElement(affinityGroup))
    dropdown.selectByVisibleText(level)
  }

  def enterValInTextField(identifier: By, value: String): Unit = {
    waitFor.until(_.findElement(identifier).isDisplayed)
    webDriver.findElement(identifier).clear()
    webDriver.findElement(identifier).sendKeys(value)
  }

  def assertElementText(content: String, element: WebElement): Unit =
    assert(element.getText.equals(content), message(s"Element displayed is: ${element.getText} Expecting: $content"))

  def optionSelected(css: String): Unit = webDriver.findElement(By.cssSelector(css)).isSelected mustBe true

  def optionNoSelected(css: String): Unit = webDriver.findElement(By.cssSelector(css)).isSelected mustBe false

  def isElementVisible(css: String): Boolean = webDriver.findElement(By.cssSelector(css)).isDisplayed

  def findByXpath(xpath: String): WebElement = webDriver.findElement(By.xpath(xpath))

  def findElementByCss(css: String): WebElement = {
    waitFor.until(_.findElement(By.cssSelector(css)))
    webDriver.findElement(By.cssSelector(css))
  }

  def verifyHeading(text: String): Unit = findElementByCss("h2").getText mustBe text

  def clickHref(href: String): Unit = webDriver.findElement(By.cssSelector(href)).click()

  def clickByCSS(css: String): Unit = webDriver.findElement(By.cssSelector(css)).click()

  def uploadFilesToBrowser(fileSeq: String, elementID: String): Unit = {
    fileSeq match {
      case "first"  => filePath = usrDir + "JPEGImage.jpg"
      case "second" => filePath = usrDir + "VA Plan v0.3.xlsx"
      case "next"   => filePath = usrDir + "JPEGImage.jpg"
      case "last"   => filePath = usrDir + "PDF.pdf"
    }

    webDriver.findElement(By.id(elementID)).sendKeys(filePath)
    eventually(waitFor.until(_.findElement(By.id("ndrc-fileupload-continue")).isEnabled))
  }

}
