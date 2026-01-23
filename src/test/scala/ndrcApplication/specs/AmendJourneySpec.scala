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

class AmendJourneySpec extends BaseSpec{

  Feature("Amend case Journey") {

    Scenario("A user wants to Amend a case [referenceNo=NDRC21052618650YFLZNMV2]") {
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
        thenIAmOnPage("What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter valid Application NDRC21052618650YFLZNMV2")
        andIEnterValidApplication("NDRC21052618650YFLZNMV2")  // auto-chosen (score=1.00, AmendCaseRefNoStepsSteps.scala)
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
        thenIAmOnPage("What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
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
        thenIAmOnPage("Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the first file")
        whenIClickOnChooseFileButtonAndAddTheXFile("first")  // auto-chosen (score=0.70, UploadFileStepsSteps.scala)
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
        thenIShouldSeeUploadedDocOnUploadPage("first", "JPEGImage.jpg")  // auto-chosen (score=0.70, FileUploadedStepsSteps.scala)
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
        thenIAmOnPage("Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter further goods details- Details: Shoes Jeans Jackets")
        andIEnterFurtherGoodsDetails("Shoes Jeans Jackets")  // auto-chosen (score=1.00, AmendCaseFurtherInfoStepsSteps.scala)
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
        thenIAmOnPage("Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Information sent - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }

    Scenario("A user wants to Amend a case to send more supporting documents [referenceNo=NDRC21052618646XZ66EBX6]") {
      Given("I am on the start page for trader service and select Amend Now")
        givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow()  // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Apply Now
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter valid Application NDRC21052618646XZ66EBX6")
        andIEnterValidApplication("NDRC21052618646XZ66EBX6")  // auto-chosen (score=1.00, AmendCaseRefNoStepsSteps.scala)
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
        thenIAmOnPage("What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
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

      Then("I am on Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the first file")
        whenIClickOnChooseFileButtonAndAddTheXFile("first")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
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
        thenIShouldSeeUploadedDocOnUploadPage("first", "JPEGImage.jpg")  // auto-chosen (score=0.70, FileUploadedStepsSteps.scala)
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
        thenIAmOnPage("Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Information sent - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }

    Scenario("A user wants to Amend a case to give further information [referenceNo=NDRC2105261863OL4K3WXR2]") {
      Given("I am on the start page for trader service and select Amend Now")
        givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow()  // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Apply Now
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter valid Application NDRC2105261863OL4K3WXR2")
        andIEnterValidApplication("NDRC2105261863OL4K3WXR2")  // auto-chosen (score=1.00, AmendCaseRefNoStepsSteps.scala)
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
        thenIAmOnPage("What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose to provide give further information")
        andIChooseToProvideGiveFurtherInformation()  // auto-chosen (score=1.00, AmendCaseResponseTypeSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter further goods details- Details: Shoes Jeans Jackets")
        andIEnterFurtherGoodsDetails("Shoes Jeans Jackets")  // auto-chosen (score=1.00, AmendCaseFurtherInfoStepsSteps.scala)
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
        thenIAmOnPage("Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Information sent - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }

    Scenario("A user tries to Amend a closed case [closedCaseReferenceNo=NDRC2107162273ZJ5CBE667]") {
      Given("I am on the start page for trader service and select Amend Now")
        givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow()  // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Apply Now
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter valid Application NDRC2107162273ZJ5CBE667")
        andIEnterValidApplication("NDRC2107162273ZJ5CBE667")  // auto-chosen (score=1.00, AmendCaseRefNoStepsSteps.scala)
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
        thenIAmOnPage("What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose to provide give further information")
        andIChooseToProvideGiveFurtherInformation()  // auto-chosen (score=1.00, AmendCaseResponseTypeSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter further goods details- Details: Shoes Jeans Jackets")
        andIEnterFurtherGoodsDetails("Shoes Jeans Jackets")  // auto-chosen (score=1.00, AmendCaseFurtherInfoStepsSteps.scala)
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
        thenIAmOnPage("Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on This application is closed - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("This application is closed - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }
  }
}
