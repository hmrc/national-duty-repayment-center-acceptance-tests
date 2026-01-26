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
import ndrcApplication.specsteps.StepDefsSteps._

class ErrorMessagesAmendSpec extends BaseSpec {

  Feature("Error Scenarios Amend case Journey") {

    Scenario(
      "Error messages for Amend case journey scenarios [referenceNo=NDRC2105261863OL4K3WXR2, splCharacterRefNo=NDRC2103151135EE6L6YKH3&*, wrongFormatRefNo=103151135EE6L6YKH, invalidLenRefNo=NDRC2103151135EE6L6]"
    ) {
      Given("I am on the start page for trader service and select Amend Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow() // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
      // --- Other possible matches ---
      // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
      // givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Apply Now
      // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
      whenIClickOnTheXButton("") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then(
        "I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
      whenIClickOnTheXButton("") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("An error message is displayed- Error: Enter the reference number")
      thenAnErrorMessageIsDisplayed(
        "Enter the reference number"
      ) // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
      // --- Other possible matches ---
      // thenAnErrorMessageIsDisplayed() [0.70] (CommonStepsSteps.scala) pattern: An error message is displayed- Error: \"([^\"]*)\"
      // thenISeeAnErrorMessageX() [0.56] (UploadFileStepsSteps.scala) pattern: I see an error message \"([^\"]*)\"
      // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
      // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
      // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
      // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter Application NDRC2103151135EE6L6YKH3&* reference no with a special character")
      andIEnterApplicationReferenceNoWithASpecialCharacter(
        "NDRC2103151135EE6L6YKH3&*"
      ) // auto-chosen (score=0.70, AmendCaseRefNoStepsSteps.scala)
      // --- Other possible matches ---
      // andIEnterApplicationReferenceNoWithASpecialCharacter() [0.70] (AmendCaseRefNoStepsSteps.scala) pattern: I enter Application \"([^\"]*)\" reference no with a special character
      // andIEnterValidApplication() [0.52] (AmendCaseRefNoStepsSteps.scala) pattern: I enter valid Application \"([^\"]*)\"
      // thenIEnterWrongFormatApplicationReferenceNo() [0.50] (AmendCaseRefNoStepsSteps.scala) pattern: I enter wrong format Application \"([^\"]*)\" reference No
      // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
      // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
      // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
      // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      Then(
        "An error message is displayed- Error: The reference number must only include letters a to z and numbers 0 to 9"
      )
      thenAnErrorMessageIsDisplayed(
        "The reference number must only include letters a to z and numbers 0 to 9"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // thenISeeAnErrorMessageX() [0.56] (UploadFileStepsSteps.scala) pattern: I see an error message \"([^\"]*)\"

      Then("I clear the reference no field")
      thenIClearTheReferenceNoField() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I enter wrong format Application 103151135EE6L6YKH reference No")
      thenIEnterWrongFormatApplicationReferenceNo(
        "103151135EE6L6YKH"
      ) // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
      // --- Other possible matches ---
      // thenIEnterWrongFormatApplicationReferenceNo() [0.70] (AmendCaseRefNoStepsSteps.scala) pattern: I enter wrong format Application \"([^\"]*)\" reference No
      // andIEnterValidApplication() [0.52] (AmendCaseRefNoStepsSteps.scala) pattern: I enter valid Application \"([^\"]*)\"
      // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
      // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
      // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
      // andIEnterApplicationReferenceNoWithASpecialCharacter() [0.47] (AmendCaseRefNoStepsSteps.scala) pattern: I enter Application \"([^\"]*)\" reference no with a special character
      // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      Then("An error message is displayed- Error: Enter the reference number in the right format")
      thenAnErrorMessageIsDisplayed(
        "Enter the reference number in the right format"
      ) // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
      // --- Other possible matches ---
      // thenAnErrorMessageIsDisplayed() [0.70] (CommonStepsSteps.scala) pattern: An error message is displayed- Error: \"([^\"]*)\"
      // thenISeeAnErrorMessageX() [0.56] (UploadFileStepsSteps.scala) pattern: I see an error message \"([^\"]*)\"
      // andIEnterXInCorrectFormatGB() [0.47] (EoriNoStepsSteps.scala) pattern: I enter \"([^\"]*)\" in correct format GB
      // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
      // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
      // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
      // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      Then("I clear the reference no field")
      thenIClearTheReferenceNoField() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I enter invalid length Application NDRC2103151135EE6L6 reference number")
      thenIEnterInvalidLengthApplicationReferenceNumber(
        "NDRC2103151135EE6L6"
      ) // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
      // --- Other possible matches ---
      // andIEnterValidApplication() [0.70] (AmendCaseRefNoStepsSteps.scala) pattern: I enter valid Application \"([^\"]*)\"
      // thenIEnterInvalidLengthApplicationReferenceNumber() [0.70] (AmendCaseRefNoStepsSteps.scala) pattern: I enter invalid length Application \"([^\"]*)\" reference number
      // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
      // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
      // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
      // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      Then("An error message is displayed- Error: The reference number must be 23 characters long")
      thenAnErrorMessageIsDisplayed(
        "The reference number must be 23 characters long"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // thenISeeAnErrorMessageX() [0.56] (UploadFileStepsSteps.scala) pattern: I see an error message \"([^\"]*)\"

      Then("I clear the reference no field")
      thenIClearTheReferenceNoField() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I enter valid Application NDRC2105261863OL4K3WXR2")
      andIEnterValidApplication("NDRC2105261863OL4K3WXR2") // auto-chosen (score=1.00, AmendCaseRefNoStepsSteps.scala)
      // --- Other possible matches ---
      // andIEnterValidApplication() [1.00] (AmendCaseRefNoStepsSteps.scala) pattern: I enter valid Application \"([^\"]*)\"
      // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
      // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
      // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
      // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
      whenIClickOnTheXButton("") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      When("I click on the Continue button")
      whenIClickOnTheXButton("") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then(
        "An error message is displayed- Error: Select if you want to send more supporting documents, or give us further information in writing"
      )
      thenAnErrorMessageIsDisplayed(
        "Select if you want to send more supporting documents, or give us further information in writing"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // andIChooseSendMoreSupportingDocuments() [0.58] (AmendCaseResponseTypeSteps.scala) pattern: I choose send more supporting documents
      // thenISeeAnErrorMessageX() [0.56] (UploadFileStepsSteps.scala) pattern: I see an error message \"([^\"]*)\"
      // andIChooseBothSendMoreSupportingDocumentsAndGiveFurtherInformation() [0.51] (AmendCaseResponseTypeSteps.scala) pattern: I choose both send more supporting documents and give further information
      // andIChooseToProvideGiveFurtherInformation() [0.50] (AmendCaseResponseTypeSteps.scala) pattern: I choose to provide give further information
      // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I choose both send more supporting documents and give further information")
      andIChooseBothSendMoreSupportingDocumentsAndGiveFurtherInformation() // auto-chosen (score=1.00, AmendCaseResponseTypeSteps.scala)
      // --- Other possible matches ---
      // andIChooseSendMoreSupportingDocuments() [0.70] (AmendCaseResponseTypeSteps.scala) pattern: I choose send more supporting documents
      // andIChooseToProvideGiveFurtherInformation() [0.50] (AmendCaseResponseTypeSteps.scala) pattern: I choose to provide give further information
      // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
      // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
      whenIClickOnTheXButton("") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the first file")
      whenIClickOnChooseFileButtonAndAddTheXFile("first") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickOnChooseFileButtonAndAddTheXFile() [0.70] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
      // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
      // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I wait for the file to be uploaded")
      andIWaitForTheFileToBeUploaded() // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)

      Then("I should see first uploaded doc JPEGImage.jpg on upload page")
      thenIShouldSeeUploadedDocOnUploadPage(
        "first",
        "JPEGImage.jpg"
      ) // auto-chosen (score=0.70, FileUploadedStepsSteps.scala)
      // --- Other possible matches ---
      // thenIShouldSeeFirstUploadedDocOnUploadReviewPage() [0.63] (FileUploadedStepsSteps.scala) pattern: I should see first uploaded doc "([^"]*)" on upload review page
      // thenIShouldSeeSecondUploadedDocOnUploadReviewPage() [0.56] (FileUploadedStepsSteps.scala) pattern: I should see second uploaded doc "([^"]*)" on upload review page
      // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page

      When("I click the file continue button")
      whenIClickTheFileContinueButton() // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickOnTheXButton() [0.70] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
      // whenIClickOnTheFileUploadContinueButton() [0.61] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
      // andIClickTheXLink() [0.57] (CommonStepsSteps.scala) pattern: I click the (.*) link
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnChooseFileButtonAndAddTheXFile() [0.49] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file

      Then(
        "I am on Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
      whenIClickOnTheXButton("") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("An error message is displayed- Error: Enter the further information")
      thenAnErrorMessageIsDisplayed(
        "Enter the further information"
      ) // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
      // --- Other possible matches ---
      // thenAnErrorMessageIsDisplayed() [0.70] (CommonStepsSteps.scala) pattern: An error message is displayed- Error: \"([^\"]*)\"
      // thenISeeAnErrorMessageX() [0.56] (UploadFileStepsSteps.scala) pattern: I see an error message \"([^\"]*)\"
      // andIEnterXInCorrectFormatGB() [0.47] (EoriNoStepsSteps.scala) pattern: I enter \"([^\"]*)\" in correct format GB
      // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
      // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
      // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
      // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter further goods details- Details: Shoes Jeans Jackets")
      andIEnterFurtherGoodsDetails(
        "Shoes Jeans Jackets"
      ) // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
      // --- Other possible matches ---
      // andIEnterFurtherGoodsDetails() [0.70] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
      // andIEnterGoodsDetails() [0.70] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
      // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
      // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
      // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
      // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
      whenIClickOnTheXButton("") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then(
        "I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
      whenIClickOnTheXButton("") // auto-chosen (score=0.70, CommonStepsSteps.scala)
      // --- Other possible matches ---
      // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
      // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
      // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Information sent - Apply for repayment of import duty and import VAT - GOV.UK"
      ) // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }
  }
}
