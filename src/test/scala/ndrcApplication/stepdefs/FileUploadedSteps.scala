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

package ndrcApplication.stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import ndrcApplication.pages.fileUploadedPage
import org.openqa.selenium.{By, NoSuchElementException}

class FileUploadedSteps extends fileUploadedPage with ScalaDsl with EN {

  When("""^I click the file continue button$""") {
    driver.findElement(By.id("ndrc-fileupload-continue")).click()
  }

  And("""^I wait for the file to be uploaded""") { () =>
    waitForFileToBeUploaded
  }

  Then("""^I should see first uploaded doc "([^"]*)" on upload review page$""") { (fileName: String) =>
    findElementByCss("div.govuk-summary-list__row:nth-child(1) > dd:nth-child(1)").isDisplayed
    // findElementByCss("div.govuk-summary-list__row:nth-child(1) > dd:nth-child(2)").getText mustBe fileName

  }

  Then("""^I should see ([^"]*) uploaded doc "([^"]*)" on upload page$""") { (sequence: String, fileName: String) =>
    val index = sequence match {
      case "first" => "1"
      case "second" => "2"
    }
    findElementByCss(s"div.govuk-summary-list__row:nth-child($index)").isDisplayed
    findElementByCss(s"div.govuk-summary-list__row:nth-child($index) > dt").getText mustBe fileName
  }

  Then("""^I select "([^"]*)" to uploading another file$""") { (yORNoUploadFile: String) =>
    yORNoUploadFile match {
      case "Yes" => clickByCSS("#uploadAnotherFile")
      case "No" => clickByCSS("#uploadAnotherFile-2")

    }
  }

  Then("""^I should see second uploaded doc "([^"]*)" on upload review page$""") { (secondFileName: String) =>
    findElementByCss("div.govuk-summary-list__row:nth-child(2) > dd:nth-child(1)").isDisplayed
  }

  def waitForFileToBeUploaded: Boolean = {
    try {
      fluentWait.until(_.findElement(By.id("ndrc-fileupload-continue")).isEnabled)
      true
    } catch {
      case _: NoSuchElementException => false
    }
  }

}
