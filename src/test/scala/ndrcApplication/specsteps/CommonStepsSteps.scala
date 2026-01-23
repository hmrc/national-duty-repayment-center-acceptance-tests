/*
 * Copyright 2026 HM Revenue & Customs
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

import io.cucumber.scala.{EN, ScalaDsl}
import ndrcApplication.pages.{amendCaseRefNoPage, commonPage, customsDutyPage}
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper

object CommonStepsSteps {

  // ^I am on "([^"]*)" page$
  def thenIAmOnPage(pageTitle: String): Unit = {
    assert(commonPage.isPageTitleDisplayed(pageTitle))
  }

  // ^I click on the "([^"]*)" button$
  def whenIClickOnTheXButton(continue: String): Unit = {
    commonPage.clickGenericButton()
  }

  // ^I click the (.*) link$
  def andIClickTheXLink(): Unit = {
    link: String =>
        commonPage.click(link)
  }

  // ^An error message is displayed- Error: \"([^\"]*)\"$
  def thenAnErrorMessageIsDisplayed(errorMsg: String): Unit = {
    amendCaseRefNoPage.errMsg()
  }

  // ^I clear the reference no field$
  def thenIClearTheReferenceNoField(): Unit = {
    amendCaseRefNoPage.clearRefNo()
  }

  // ^Hint text is displayed \"([^\"]*)\"$
  def andHintTextIsDisplayed(hintText: String): Unit = {
    customsDutyPage.hintText mustBe hintText
  }

  // ^I Accept cookies and hide message$
  def thenIAcceptCookiesAndHideMessage(): Unit = {
    commonPage.acceptCookies()
        commonPage.hideCookiesMsg()
  }

}
