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
import ndrcApplication.pages.uploadFilePage
import ndrcApplication.pages.uploadFilePage._
import org.scalatest.matchers.must.Matchers.{convertToAnyMustWrapper, include}

object UploadFileStepsSteps {

  // ^I click on Choose file button and add the "([^"]*)" file$
  def whenIClickOnChooseFileButtonAndAddTheXFile(fileSeq: String): Unit =
    uploadFilePage.uploadFile(fileSeq)

  // ^I see an error message \"([^\"]*)\"$
  def thenISeeAnErrorMessageX(errorMsg: String): Unit = {
    findElementByCss("ul.govuk-error-summary__list").isDisplayed mustBe true
    findElementByCss("ul.govuk-error-summary__list").getText must include(errorMsg)
  }

}
