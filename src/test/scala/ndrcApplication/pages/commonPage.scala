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

package ndrcApplication.pages

import ndrcApplication.utils.Configuration
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.{By, JavascriptExecutor, NoSuchElementException, WebElement}

object commonPage extends commonMethods {

  private val redirectUrl = By.name("redirectionUrl")
  private val enrolment = By.name("enrolment[0].name")
  private val enrolmentIdentifierName = By.name("enrolment[0].taxIdentifier[0].name")
  private val enrolmentIdentifierValue = By.name("enrolment[0].taxIdentifier[0].value")
  private val submitButtonOnAuthLoginPage = By.id("submit")
  private val continueBtnOnAllPages = By.xpath("//*[contains(@class, 'govuk-button')]")
  private val acceptCookiesOnAllPages = By.xpath("/html/body/div[1]/div/div[2]/button[1]")
  private val hideCookieMessage = By.xpath("/html/body/div[1]/div/div[2]/button")

  def loginNDRCViaAuthStub(): Unit = {
    navigateToPage(s"${Configuration.settings.authLoginUrl}")
    authLogin()
  }

  def authLogin(): Unit = {
    enterValInTextField(redirectUrl, s"${Configuration.settings.ndrcApplicationLandingUrl}")
    enterValInTextField(enrolment, "HMRC-CTS-ORG")
    enterValInTextField(enrolmentIdentifierName, "EORINumber")
    enterValInTextField(enrolmentIdentifierValue, "GB123456789000")

    clickOnButton(submitButtonOnAuthLoginPage)
  }

  def scrollToElement(element: WebElement): AnyRef = {
    val jse2: JavascriptExecutor = webDriver.asInstanceOf[JavascriptExecutor]
    jse2.executeScript("arguments[0].scrollIntoView()", element)
  }

  def click(by: By): Unit = {
    val element = webDriver.findElement(by)
    scrollToElement(element)
    element.click()
  }

  def clickGenericButton(): Unit = {
    waitFor.until(ExpectedConditions.elementToBeClickable(By.className("govuk-button")))
    click(By.className("govuk-button"))
  }

  def deleteBrowserCookies(): Unit = webDriver.manage().deleteAllCookies()

  def findElement(identifier: By): Boolean = {
    try {
      webDriver.findElement(identifier)
      true
    } catch {
      case _: NoSuchElementException => false
    }
  }

  def acceptCookies(): Unit =
    if (findElement(acceptCookiesOnAllPages)) clickOnButton(acceptCookiesOnAllPages)

  def hideCookiesMsg() : Unit =
    if (findElement(hideCookieMessage)) clickOnButton(hideCookieMessage)

  def clickOnContinueBtn(): Unit = clickOnButton(continueBtnOnAllPages)

  def click(button: String): Unit = {
    val element = s"//*[contains(text(), '$button')]"
    clickOnButton(By.xpath(element))
  }
}
