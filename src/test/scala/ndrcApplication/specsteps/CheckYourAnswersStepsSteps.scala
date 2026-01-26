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

import ndrcApplication.specpage.checkYourAnswersPage._
import ndrcApplication.specpage.checkYourAnswersPage

object CheckYourAnswersStepsSteps {

  // ^I verify correct data items is displayed$
  def thenIVerifyCorrectDataItemsIsDisplayed(): Unit = {
    checkYourAnswersPage.verifyRefNo(RefNo)
    checkYourAnswersPage.verifyResType(ResType)
    checkYourAnswersPage.verifyResToHMRC(ResToHMRC)
    checkYourAnswersPage.verifyDocs(Docs)
  }

  // ^I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$
  def thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(
    refNo: String,
    resType: String,
    resHMRC: String,
    docsCount: String
  ): Unit = {
    assertElementText(refNo, RefNoResponse)
    assertElementText(resType, ResTypeResponse)
    assertElementText(resHMRC, ResToHMRCResponse)
    assertElementText(docsCount, DocsResponse)
  }

  // ^I click on change option on the amend review page for reference no$
  def whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo(): Unit =
    checkYourAnswersPage.clickRefNOChangeOption()

  // ^I click on change option on the amend review page for response type$
  def whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType(): Unit =
    checkYourAnswersPage.clickResTypeChangeOption()

  // ^I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$
  def thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(
    refNo: String,
    resType: String,
    resHMRC: String
  ): Unit = {
    assertElementText(refNo, RefNoResponse)
    assertElementText(resType, ResTypeResponse)
    assertElementText(resHMRC, ResToHMRCResponse)
  }

  // ^I click on change option on the amend review page for documents uploaded$
  def whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded(): Unit =
    checkYourAnswersPage.clickDocsChangeOption()

  // ^I click on change option on the review page for total return amount$
  def whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount(): Unit =
    checkYourAnswersPage.clickTotalReturnAmountChangeOption()

  // ^I click on change option on the review page for entry details
  def whenIClickOnChangeOptionOnTheReviewPageForEntryDetails(): Unit =
    checkYourAnswersPage.clickEntryDetailsChangeOption()

}
