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

import ndrcApplication.utils.Configuration

import org.openqa.selenium.By
import ndrcApplication.stepdefs.WebDriverInstance

object commonPage extends commonMethods with WebDriverInstance {

  private val redirectUrl = By.name("redirectionUrl")
  private val submitButtonOnAuthLoginPage = By.cssSelector("Input[value='Submit']")
  private val continueBtnOnAllPages = By.xpath("//*[contains(@class, 'govuk-button')]")
  private val acceptCookiesOnAllPages = By.xpath("/html/body/div[1]/div/div[2]/button[1]")
  private val hideCookieMessage = By.xpath("/html/body/div[1]/div/div[2]/button")



  def loginNDRCViaAuthStub(): Unit = {
    navigateToPage(s"${Configuration.settings.authLogin}")
    authLogin()
  }

  def authLogin(): Unit = {
    enterValInTextField(redirectUrl, s"${Configuration.settings.ndrcApplicationLandingUrl}")
    clickOnButton(submitButtonOnAuthLoginPage)
  }

  def deleteBrowserCookies(): Unit = driver.manage().deleteAllCookies()

  def acceptCookies(): Unit = clickOnButton(acceptCookiesOnAllPages)

  def hideCookiesMsg() : Unit = clickOnButton(hideCookieMessage)

  def clickOnContinueBtn(): Unit = clickOnButton(continueBtnOnAllPages)

}
