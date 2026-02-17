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

import org.openqa.selenium.{By, NoSuchElementException}
import org.scalatest.matchers.must.Matchers.mustBe
import uk.gov.hmrc.selenium.webdriver.Driver
import ndrcApplication.specpage.commonMethods

object FileUploadedStepsSteps extends commonMethods {

  // ^I click the file continue button$
  def whenIClickTheFileContinueButton(): Unit =
    Driver.instance.findElement(By.id("ndrc-fileupload-continue")).click()

  // ^I click on the file upload continue button$
  def whenIClickOnTheFileUploadContinueButton(): Unit = {
    waitForVisible(By.id("ndrc-fileupload-continue"))
    Driver.instance.findElement(By.id("ndrc-fileupload-continue")).click()
  }

  // ^I wait for the file to be uploaded
  def andIWaitForTheFileToBeUploaded(): Unit =
    waitForFileToBeUploaded

  // ^I should see first uploaded doc "([^"]*)" on upload review page$
  def thenIShouldSeeFirstUploadedDocOnUploadReviewPage(fileName: String): Unit =
    findElementByCss("div.govuk-summary-list__row:nth-child(1) > dd:nth-child(1)").isDisplayed

  // ^I should see ([^"]*) uploaded doc "([^"]*)" on upload page$
  def thenIShouldSeeUploadedDocOnUploadPage(sequence: String, fileName: String): Unit = {
    val index = sequence match {
      case "first"  => "1"
      case "second" => "2"
    }
    findElementByCss(s"div.govuk-summary-list__row:nth-child($index)").isDisplayed
    findElementByCss(s"div.govuk-summary-list__row:nth-child($index) > dt").getText mustBe fileName
  }

  // ^I select "([^"]*)" to uploading another file$
  def thenISelectXToUploadingAnotherFile(yORNoUploadFile: String): Unit =
    yORNoUploadFile match {
      case "Yes" => clickByCSS("#uploadAnotherFile")
      case "No"  => clickByCSS("#uploadAnotherFile-2")

    }

  // ^I should see second uploaded doc "([^"]*)" on upload review page$
  def thenIShouldSeeSecondUploadedDocOnUploadReviewPage(secondFileName: String): Unit =
    findElementByCss("div.govuk-summary-list__row:nth-child(2) > dd:nth-child(1)").isDisplayed

  def waitForFileToBeUploaded: Boolean =
    try {
      waitForVisible(By.id("ndrc-fileupload-continue"))
      true
    } catch {
      case _: NoSuchElementException => false
    }

}
