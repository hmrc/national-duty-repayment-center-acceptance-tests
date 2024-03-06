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

import ndrcApplication.driver.BrowserDriver
import org.openqa.selenium.remote.LocalFileDetector
import org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable
import org.openqa.selenium.support.ui.{ExpectedCondition, Select, WebDriverWait}
import org.openqa.selenium.{By, WebElement}
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.must.Matchers.{convertToAnyMustWrapper, message}
import org.scalatestplus.selenium.WebBrowser

import java.time.Duration

abstract class commonMethods extends Eventually with BrowserDriver with WebBrowser {

  def waitFor[T](condition: ExpectedCondition[T]): T = {
    val wait = new WebDriverWait(driver, Duration.ofSeconds(10))
    wait.until(condition)
  }
  def waitForVisible(by: By): Unit = waitFor(elementToBeClickable(by))

  val usrDir: String = System.getProperty("user.dir") + "/src/test/resources/filestoupload/"
  var filePath       = ""

  def navigateToPage(url: String): Unit =
    driver.navigate().to(url)

  def isPageTitleDisplayed(pageTitle: String): Boolean =
      driver.getTitle == pageTitle

  def clickOnButton(identifier: By): Unit = {
    driver.findElement(identifier).click()
  }

  def selectDropdown(affinityGroup: By, level: String): Unit = {
    val dropdown = new Select(driver.findElement(affinityGroup))
    dropdown.selectByVisibleText(level)
  }

  def enterValInTextField(identifier: By, value: String): Unit = {
    driver.findElement(identifier).clear()
    driver.findElement(identifier).sendKeys(value)
  }

  def assertElementText(content: String, element: WebElement): Unit =
    assert(element.getText.equals(content), message(s"Element displayed is: ${element.getText} Expecting: $content"))

  def optionSelected(css: String): Unit = driver.findElement(By.cssSelector(css)).isSelected mustBe true

  def optionNoSelected(css: String): Unit = driver.findElement(By.cssSelector(css)).isSelected mustBe false

  def isElementVisible(css: String): Boolean = driver.findElement(By.cssSelector(css)).isDisplayed

  def findByXpath(xpath: String): WebElement = driver.findElement(By.xpath(xpath))

  def findElementByCss(css: String): WebElement = {
    driver.findElement(By.cssSelector(css))
  }

  def verifyHeading(text: String): Unit = findElementByCss("h2").getText mustBe text

  def clickHref(href: String): Unit = driver.findElement(By.cssSelector(href)).click()

  def clickByCSS(css: String): Unit = driver.findElement(By.cssSelector(css)).click()

  def uploadFilesToBrowser(fileSeq: String, elementID: String): Unit = {
    fileSeq match {
      case "first"  => filePath = usrDir + "JPEGImage.jpg"
      case "second" => filePath = usrDir + "VA Plan v0.3.xlsx"
      case "next"   => filePath = usrDir + "JPEGImage.jpg"
      case "last"   => filePath = usrDir + "PDF.pdf"
    }

    driver.setFileDetector(new LocalFileDetector())
    driver.findElement(By.id(elementID)).sendKeys(filePath)
    driver.findElement(By.id("ndrc-fileupload-continue")).isEnabled
  }

}
