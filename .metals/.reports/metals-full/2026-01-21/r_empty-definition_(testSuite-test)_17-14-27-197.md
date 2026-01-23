file://<WORKSPACE>/src/test/scala/ndrcApplication/output/AmendCYAPageSpec.scala
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:
	 -_root_/LoginPageStepsSteps.
	 -scala/Predef._root_.LoginPageStepsSteps.
offset: 721
uri: file://<WORKSPACE>/src/test/scala/ndrcApplication/output/AmendCYAPageSpec.scala
text:
```scala
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

package ndrcApplication.specs
import ndrcApplication.specs.BaseSpec
import uk.gov.hmrc.test
import _root_.LoginPageS@@tepsSteps.*

class AmendCYAPageSpec extends BaseSpec {

  Feature("Amend case CYA Page") {

    Scenario("A user wants to change an answer via the CYA page - Amend case [referenceNo=NDRC2105261863OL4K3WXR2, responseType=Send additional Documents and Information, responseToHMRC=Shoes Jeans Jackets, docsUploaded=JPEGImage.jpg, referenceNoDoesNotExist=NDRC21052618646XZ66E666, changeResType=Send additional Information, changeRespType=Send additional Documents, changeDocsUploaded=JPEGImage.jpg\nVA Plan v0.3.xlsx]") {
      Given("I am on the start page for trader service and select Amend Now")
        givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow()  // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Apply Now
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      Then("I Accept cookies and hide message")
        thenIAcceptCookiesAndHideMessage()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter valid Application NDRC2105261863OL4K3WXR2")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterValidApplication() [1.00] (AmendCaseRefNoStepsSteps.scala) pattern: I enter valid Application \"([^\"]*)\"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose both send more supporting documents and give further information")
        andIChooseBothSendMoreSupportingDocumentsAndGiveFurtherInformation()  // auto-chosen (score=1.00, AmendCaseResponseTypeSteps.scala)
        // --- Other possible matches ---
        // andIChooseSendMoreSupportingDocuments() [0.70] (AmendCaseResponseTypeSteps.scala) pattern: I choose send more supporting documents
        // andIChooseToProvideGiveFurtherInformation() [0.50] (AmendCaseResponseTypeSteps.scala) pattern: I choose to provide give further information
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the first file")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.70] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I wait for the file to be uploaded")
        andIWaitForTheFileToBeUploaded()  // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)

      Then("I should see first uploaded doc JPEGImage.jpg on upload page")
        thenIShouldSeeUploadedDocOnUploadPage("", "")  // auto-chosen (score=0.70, FileUploadedStepsSteps.scala)
        // --- Other possible matches ---
        // thenIShouldSeeFirstUploadedDocOnUploadReviewPage() [0.63] (FileUploadedStepsSteps.scala) pattern: I should see first uploaded doc "([^"]*)" on upload review page
        // thenIShouldSeeSecondUploadedDocOnUploadReviewPage() [0.56] (FileUploadedStepsSteps.scala) pattern: I should see second uploaded doc "([^"]*)" on upload review page
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page

      When("I click the file continue button")
        whenIClickTheFileContinueButton()  // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnTheXButton() [0.70] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnTheFileUploadContinueButton() [0.61] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
        // andIClickTheXLink() [0.57] (CommonStepsSteps.scala) pattern: I click the (.*) link
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.49] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file

      Then("I am on Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter further goods details- Details: Shoes Jeans Jackets")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterFurtherGoodsDetails() [0.70] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterGoodsDetails() [0.70] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I verify correct data items is displayed")
        thenIVerifyCorrectDataItemsIsDisplayed()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed

      Then("I verify correct responses is displayed for Amend case journey NDRC2105261863OL4K3WXR2, Send additional Documents and Information, Shoes Jeans Jackets and JPEGImage.jpg")
        thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney("", "", "")  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney() [0.70] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // thenIVerifyCorrectDataItemsIsDisplayed() [0.50] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct data items is displayed
        // andIEnterXInCorrectFormatGB() [0.47] (EoriNoStepsSteps.scala) pattern: I enter \"([^\"]*)\" in correct format GB
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed

      When("I click on change option on the amend review page for reference no")
        whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType() [0.59] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for response type
        // whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded() [0.59] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for documents uploaded
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.58] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for total return amount
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // thenIClearTheReferenceNoField() [0.47] (CommonStepsSteps.scala) pattern: I clear the reference no field
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I clear the reference no field")
        thenIClearTheReferenceNoField()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I enter valid Application NDRC21052618646XZ66E666")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterValidApplication() [1.00] (AmendCaseRefNoStepsSteps.scala) pattern: I enter valid Application \"([^\"]*)\"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I verify correct responses is displayed for Amend case journey NDRC21052618646XZ66E666, Send additional Documents and Information, Shoes Jeans Jackets and JPEGImage.jpg")
        thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney("", "", "")  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney() [0.70] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // thenIVerifyCorrectDataItemsIsDisplayed() [0.50] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct data items is displayed
        // andIEnterXInCorrectFormatGB() [0.47] (EoriNoStepsSteps.scala) pattern: I enter \"([^\"]*)\" in correct format GB
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed

      When("I click on change option on the amend review page for response type")
        whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo() [0.59] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for reference no
        // whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded() [0.59] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for documents uploaded
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.58] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for total return amount
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose send more supporting documents")
        andIChooseSendMoreSupportingDocuments()  // auto-chosen (score=1.00, AmendCaseResponseTypeSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I verify correct responses is displayed for Amend case journey NDRC21052618646XZ66E666, Send additional Information, Shoes Jeans Jackets")
        thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney("", "", "")  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney() [0.64] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // thenIVerifyCorrectDataItemsIsDisplayed() [0.50] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct data items is displayed
        // andIEnterXInCorrectFormatGB() [0.47] (EoriNoStepsSteps.scala) pattern: I enter \"([^\"]*)\" in correct format GB
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed

      When("I click on change option on the amend review page for response type")
        whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo() [0.59] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for reference no
        // whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded() [0.59] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for documents uploaded
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.58] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for total return amount
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose both send more supporting documents and give further information")
        andIChooseBothSendMoreSupportingDocumentsAndGiveFurtherInformation()  // auto-chosen (score=1.00, AmendCaseResponseTypeSteps.scala)
        // --- Other possible matches ---
        // andIChooseSendMoreSupportingDocuments() [0.70] (AmendCaseResponseTypeSteps.scala) pattern: I choose send more supporting documents
        // andIChooseToProvideGiveFurtherInformation() [0.50] (AmendCaseResponseTypeSteps.scala) pattern: I choose to provide give further information
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the first file")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.70] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I wait for the file to be uploaded")
        andIWaitForTheFileToBeUploaded()  // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)

      Then("I should see first uploaded doc JPEGImage.jpg on upload page")
        thenIShouldSeeUploadedDocOnUploadPage("", "")  // auto-chosen (score=0.70, FileUploadedStepsSteps.scala)
        // --- Other possible matches ---
        // thenIShouldSeeFirstUploadedDocOnUploadReviewPage() [0.63] (FileUploadedStepsSteps.scala) pattern: I should see first uploaded doc "([^"]*)" on upload review page
        // thenIShouldSeeSecondUploadedDocOnUploadReviewPage() [0.56] (FileUploadedStepsSteps.scala) pattern: I should see second uploaded doc "([^"]*)" on upload review page
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page

      When("I click the file continue button")
        whenIClickTheFileContinueButton()  // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnTheXButton() [0.70] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnTheFileUploadContinueButton() [0.61] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
        // andIClickTheXLink() [0.57] (CommonStepsSteps.scala) pattern: I click the (.*) link
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.49] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file

      Then("I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I verify correct responses is displayed for Amend case journey NDRC21052618646XZ66E666, Send additional Documents, JPEGImage.jpg")
        thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney("", "", "")  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney() [0.64] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // thenIVerifyCorrectDataItemsIsDisplayed() [0.50] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct data items is displayed
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed

      When("I click on change option on the amend review page for documents uploaded")
        whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo() [0.59] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for reference no
        // whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType() [0.59] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for response type
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.58] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for total return amount
        // thenIShouldSeeUploadedDocOnUploadPage() [0.52] (FileUploadedStepsSteps.scala) pattern: I should see ([^"]*) uploaded doc "([^"]*)" on upload page
        // thenIShouldSeeFirstUploadedDocOnUploadReviewPage() [0.49] (FileUploadedStepsSteps.scala) pattern: I should see first uploaded doc "([^"]*)" on upload review page
        // thenIShouldSeeSecondUploadedDocOnUploadReviewPage() [0.49] (FileUploadedStepsSteps.scala) pattern: I should see second uploaded doc "([^"]*)" on upload review page
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the second file")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.70] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I wait for the file to be uploaded")
        andIWaitForTheFileToBeUploaded()  // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)

      Then("I should see second uploaded doc VA Plan v0.3.xlsx on upload page")
        thenIShouldSeeUploadedDocOnUploadPage("", "")  // auto-chosen (score=0.70, FileUploadedStepsSteps.scala)
        // --- Other possible matches ---
        // thenIShouldSeeSecondUploadedDocOnUploadReviewPage() [0.63] (FileUploadedStepsSteps.scala) pattern: I should see second uploaded doc "([^"]*)" on upload review page
        // thenIShouldSeeFirstUploadedDocOnUploadReviewPage() [0.56] (FileUploadedStepsSteps.scala) pattern: I should see first uploaded doc "([^"]*)" on upload review page
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page

      When("I click the file continue button")
        whenIClickTheFileContinueButton()  // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnTheXButton() [0.70] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnTheFileUploadContinueButton() [0.61] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
        // andIClickTheXLink() [0.57] (CommonStepsSteps.scala) pattern: I click the (.*) link
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.49] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file

      Then("I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I verify correct responses is displayed for Amend case journey NDRC21052618646XZ66E666, Send additional Documents, JPEGImage.jpgnVA Plan v0.3.xlsx")
        thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney("", "", "")  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney() [0.64] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // thenIVerifyCorrectDataItemsIsDisplayed() [0.50] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct data items is displayed
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Application not found - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on enter the application number again")
        whenIClickOnEnterTheApplicationNumberAgain()  // auto-chosen (score=1.00, ApplicationNotFoundStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterEmail() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\"
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // andIEnterValidApplication() [0.52] (AmendCaseRefNoStepsSteps.scala) pattern: I enter valid Application \"([^\"]*)\"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      Then("I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I clear the reference no field")
        thenIClearTheReferenceNoField()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I enter valid Application NDRC2105261863OL4K3WXR2")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterValidApplication() [1.00] (AmendCaseRefNoStepsSteps.scala) pattern: I enter valid Application \"([^\"]*)\"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I verify correct responses is displayed for Amend case journey NDRC2105261863OL4K3WXR2, Send additional Documents, JPEGImage.jpgnVA Plan v0.3.xlsx")
        thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney("", "", "")  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney() [0.64] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // thenIVerifyCorrectDataItemsIsDisplayed() [0.50] (CheckYourAnswersStepsSteps.scala) pattern: I verify correct data items is displayed
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 