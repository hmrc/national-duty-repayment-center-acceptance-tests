error id: 0480E0613B8DEE9CC3B8C4C0B876774A
file://<WORKSPACE>/src/test/scala/ndrcApplication/specs/RestrictedCMASpec.scala
### scala.reflect.internal.FatalError: no context found for source-file://<WORKSPACE>/src/test/scala/ndrcApplication/specs/RestrictedCMASpec.scala,line-10,offset=304

occurred in the presentation compiler.



action parameters:
offset: 304
uri: file://<WORKSPACE>/src/test/scala/ndrcApplication/specs/RestrictedCMASpec.scala
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
 * Unless required by app@@licable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ndrcApplication.specs
import ndrcApplication.specs.BaseSpec
import ndrcApplication.specsteps.StepDefsSteps._

class RestrictedCMASpec extends BaseSpec {

  Feature("Restricted CMA") {

    Scenario("User is not presented with CMA repayment option for claims less than £250 [YorNvat=Yes, fName=Test, lName=Importer, YorNgoodsOwner=Yes, phoneNo=09876543212, emailAddress=test@mail.com, YorNDeclarantRefNO=Yes, declarantRefNo=1234abcxyz, aName=Megacorp, sCode=207106, accNo=86563611]") {
      Given("I am on the start page for trader service and select Apply Now")
        givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow()  // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Amend Now
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Importer claimant type")
        andIChooseImporterClaimantType()  // auto-chosen (score=1.00, ImporterorRepStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseAnArticleType() [0.56] (ArticleStepsSteps.scala) pattern: I choose an article Type
        // andIChooseRepresentativeClaimantType() [0.56] (ImporterorRepStepsSteps.scala) pattern: I choose Representative claimant type
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose one entry")
        andIChooseOneEntry()  // auto-chosen (score=1.00, EntriesStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseMultiEntry() [0.52] (EntriesStepsSteps.scala) pattern: I choose multi entry
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.47] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
        andIEnterDeclarationDetails("345", "123456t")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterDeclarationDetails() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter declaration details- EPU: "([^"]*)" and Entry No: "([^"]*)"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter an entry date that was 7 days ago")
        andIEnterAnEntryDateThatWasXDaysAgo("7")  // auto-chosen (score=1.00, EntryDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAnEntryDateThatWasXDaysAgo() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter an entry date that was ([^"]*) days ago
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

      Then("I am on Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose a regulation repayment Type")
        andIChooseARegulationRepaymentType()  // auto-chosen (score=1.00, RegulationsStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose an application Reason")
        andIChooseAnApplicationReason()  // auto-chosen (score=1.00, AppReasonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter goods details- Details: Shoes Jeans Jackets")
        andIEnterGoodsDetails("Shoes Jeans Jackets")  // auto-chosen (score=1.00, AboutGoodsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterGoodsDetails() [0.70] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterFurtherGoodsDetails() [0.58] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
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

      Then("I am on What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose the Customs Duty option")
        andIChooseTheCustomsDutyOption()  // auto-chosen (score=1.00, ReclaimStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter customs Duty paid- CustomDuty: 1000.00")
        andIEnterCustomsDutyPaid("1000.00")  // auto-chosen (score=1.00, CustomsDutyStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyPaid() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterCustomsDutyPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 751.00")
        andIEnterCustomsDutyShouldHavePaidToHMRC("751.00")  // auto-chosen (score=1.00, CustomsDutyStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // andIEnterCustomsDutyPaid() [0.58] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIEnterOtherCustomDutyBeenPaidToHMRC() [0.56] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIClearAmountAndEnterCustomsDutyShouldHavePaid() [0.51] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatBeenPaidToHMRC() [0.47] (VatStepsSteps.scala) pattern: I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

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

      Then("I am on Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Yes option")
        andIChooseOption("Yes")  // auto-chosen (score=0.70, VatRegStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What is your name? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What is your name? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter first Test and last Importer")
        andIEnterFirstAndLastName("Test", "Importer")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterFirstAndLastName() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter first \"([^\"]*)\" and last \"([^\"]*)\"
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

      Then("I am on Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I choose Yes option to confirm owner of the goods")
        andIChooseOptionToConfirmOwnerOfTheGoods("Yes")  // auto-chosen (score=0.70, GoodsOwnerStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseTheCustomsDutyOption() [0.47] (ReclaimStepsSteps.scala) pattern: I choose the Customs Duty option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I select email option")
        andISelectEmailOption()  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter test@mail.com")
        andIEnterEmail("test@mail.com")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I select phone no option")
        andISelectPhoneNoOption()  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andISelectEmailOption() [0.52] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select email option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter 09876543212 importers")
        andIEnterPhoneNo("09876543212")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterPhoneNo() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Yes options")
        andIChooseOptions("Yes")  // auto-chosen (score=0.70, DeclarantRefNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I enter to create 1234abcxyz")
        andIEnterToCreate("1234abcxyz")  // auto-chosen (score=1.00, DeclarantRefNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterEmail() [1.00] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\"
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

      Then("I am on Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // andIEnterYourNameAndBusinessName() [0.56] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter your \"([^\"]*)\" and business \"([^\"]*)\"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatPaid() [0.47] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"

      And("I enter account Megacorp and sortcode 207106 and account number 86563611")
        andIEnterAccountAndSortcodeAndAccountNumber("Megacorp", "207106", "86563611") // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAccountAndSortcodeAndAccountNumber() [0.70] (selectRepayMethodStepsSteps.scala) pattern: I enter account \"([^\"]*)\" and sortcode \"([^\"]*)\" and account number \"([^\"]*)\"
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

      Then("I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on change option on the review page for total return amount")
        whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.58] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for reference no
        // whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for response type
        // whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for documents uploaded
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I click on change option on customs duty should have paid")
        andIClickOnChangeOptionOnCustomsDutyShouldHavePaid()  // auto-chosen (score=1.00, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeOptionOnOtherDutyShouldHavePaid() [0.64] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty should have paid
        // andIClickOnChangeOptionOnCustomsDutyWasPaid() [0.63] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty was paid
        // andIClickOnChangeOptionOnImportVatShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat should have paid
        // andIClickOnChangeOptionOnOtherDutyWasPaid() [0.56] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty was paid
        // andIClickOnChangeOptionOnImportVatWasPaid() [0.49] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat was paid
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.49] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // andIChooseTheCustomsDutyOption() [0.47] (ReclaimStepsSteps.scala) pattern: I choose the Customs Duty option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIEnterCustomsDutyPaid() [0.47] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: 750.00")
        andIClearAmountAndEnterCustomsDutyShouldHavePaid("750.00")   // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIClearAmountAndEnterCustomsDutyShouldHavePaid() [0.70] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.63] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // andIClearAmountAndEnterCustomsDutyPaid() [0.62] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"
        // andIEnterCustomsDutyPaid() [0.58] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIClearAmountAndEnterOtherDutyShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty should have paid- OtherDutyBeenPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterOtherDutyPaid() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterOtherCustomDutyBeenPaidToHMRC() [0.49] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterImportVatPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterImportVatBeenPaidToHMRC() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I choose Bank transfer (Bacs) repayment option")
        andIChooseRepaymentOption("Bank transfer (Bacs)")  // auto-chosen (score=0.70, selectRepayMethodStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Application complete - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Application complete - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }

    Scenario("Representative is not presented with CMA repayment option for claims less than £250 [YorNeori=Yes, eoriNo=GB123456789123, YorNvat=Yes, impName=test importer, declarantName=test declarant, businessName=test agent, phoneNo=09876543212, emailAddress=test@gmail.com, YorNDeclarantRefNO=Yes, declarantRefNo=123abcxyz, yOrNoIndirectRep=No, aName=Megacorp, sCode=207106, accNo=86563611]") {
      Given("I am on the start page for trader service and select Apply Now")
        givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow()  // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Amend Now
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Representative claimant type")
        andIChooseRepresentativeClaimantType()  // auto-chosen (score=1.00, ImporterorRepStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseAnArticleType() [0.56] (ArticleStepsSteps.scala) pattern: I choose an article Type
        // andIChooseImporterClaimantType() [0.56] (ImporterorRepStepsSteps.scala) pattern: I choose Importer claimant type
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose one entry")
        andIChooseOneEntry()  // auto-chosen (score=1.00, EntriesStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseMultiEntry() [0.52] (EntriesStepsSteps.scala) pattern: I choose multi entry
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.47] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
        andIEnterDeclarationDetails("345", "123456t")  // auto-chosen (score=1.00, EntryDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterDeclarationDetails() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter declaration details- EPU: "([^"]*)" and Entry No: "([^"]*)"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter an entry date that was 7 days ago")
        andIEnterAnEntryDateThatWasXDaysAgo("7")  // auto-chosen (score=0.70, EntryDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAnEntryDateThatWasXDaysAgo() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter an entry date that was ([^"]*) days ago
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

      Then("I am on Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose a regulation repayment Type")
        andIChooseARegulationRepaymentType()  // auto-chosen (score=1.00, RegulationsStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose an application Reason")
        andIChooseAnApplicationReason()  // auto-chosen (score=1.00, AppReasonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter goods details- Details: Shoes Jeans Jackets")
        andIEnterGoodsDetails("Shoes Jeans Jackets")   // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterGoodsDetails() [0.70] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterFurtherGoodsDetails() [0.58] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
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

      Then("I am on What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose the Customs Duty option")
        andIChooseTheCustomsDutyOption()  // auto-chosen (score=1.00, ReclaimStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter customs Duty paid- CustomDuty: 300.00")
        andIEnterCustomsDutyPaid("300.00")  // auto-chosen (score=1.00, CustomsDutyStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyPaid() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterCustomsDutyPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 100.00")
        andIEnterCustomsDutyShouldHavePaidToHMRC("100.00")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // andIEnterCustomsDutyPaid() [0.58] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIEnterOtherCustomDutyBeenPaidToHMRC() [0.56] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIClearAmountAndEnterCustomsDutyShouldHavePaid() [0.51] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatBeenPaidToHMRC() [0.47] (VatStepsSteps.scala) pattern: I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

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

      Then("I am on Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose eori Yes option")
        andIChooseEori("Yes")  // auto-chosen (score=0.70, EoriNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter GB123456789123 in correct format GB")
        andIEnterXInCorrectFormatGB("GB123456789123")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterXInCorrectFormatGB() [0.70] (EoriNoStepsSteps.scala) pattern: I enter \"([^\"]*)\" in correct format GB
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

      Then("I am on Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Yes option")
        andIChooseOption("Yes")  // auto-chosen (score=0.70, VatRegStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter test importer name in rep journey")
        andIEnterImpNameInRepJourney("Test Importer")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterImpNameInRepJourney() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" name in rep journey
        // andIEnterName() [0.70] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Your details - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Your details - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter your test declarant and business test agent")
        andIEnterYourNameAndBusinessName("Test Declarant", "Test Agent")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterYourNameAndBusinessName() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter your \"([^\"]*)\" and business \"([^\"]*)\"
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

      Then("I am on How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I select email option")
        andISelectEmailOption()  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter test@gmail.com")
        andIEnterEmail("test@gmail.com")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I select phone no option")
        andISelectPhoneNoOption()  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andISelectEmailOption() [0.52] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select email option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter 09876543212 importers")
        andIEnterPhoneNo("09876543212")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterPhoneNo() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Yes options")
        andIChooseOption("Yes")  // auto-chosen (score=0.70, DeclarantRefNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I enter to create 123abcxyz")
        andIEnterToCreate("123abcxyz")  // auto-chosen (score=1.00, DeclarantRefNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterEmail() [1.00] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\"
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

      Then("I am on Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Representative option")
        andIChooseRepresentativeOption()  // auto-chosen (score=1.00, whoToBoRepaidStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseXIndirectRepresentativeOption() [0.56] (whoToBoRepaidStepsSteps.scala) pattern: I choose \"([^\"]*)\" indirect representative option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose No indirect representative option")
        andIChooseXIndirectRepresentativeOption("No")  // auto-chosen (score=0.70, whoToBoRepaidStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXIndirectRepresentativeOption() [0.70] (whoToBoRepaidStepsSteps.scala) pattern: I choose \"([^\"]*)\" indirect representative option
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the next file")
        whenIClickOnChooseFileButtonAndAddTheXFile("next")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.70] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // andIClickTheXLink() [0.56] (CommonStepsSteps.scala) pattern: I click the (.*) link
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the file upload continue button")
        whenIClickOnTheFileUploadContinueButton()  // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.70] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButton() [0.70] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.49] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file

      Then("I am on Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK") // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // andIEnterYourNameAndBusinessName() [0.56] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter your \"([^\"]*)\" and business \"([^\"]*)\"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatPaid() [0.47] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"

      And("I enter account Megacorp and sortcode 207106 and account number 86563611")
        andIEnterAccountAndSortcodeAndAccountNumber("Megacorp", "207106", "86563611")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAccountAndSortcodeAndAccountNumber() [0.70] (selectRepayMethodStepsSteps.scala) pattern: I enter account \"([^\"]*)\" and sortcode \"([^\"]*)\" and account number \"([^\"]*)\"
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

      Then("I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on change option on the review page for total return amount")
        whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.58] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for reference no
        // whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for response type
        // whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for documents uploaded
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I click on change option on customs duty should have paid")
        andIClickOnChangeOptionOnCustomsDutyShouldHavePaid()  // auto-chosen (score=1.00, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeOptionOnOtherDutyShouldHavePaid() [0.64] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty should have paid
        // andIClickOnChangeOptionOnCustomsDutyWasPaid() [0.63] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty was paid
        // andIClickOnChangeOptionOnImportVatShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat should have paid
        // andIClickOnChangeOptionOnOtherDutyWasPaid() [0.56] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty was paid
        // andIClickOnChangeOptionOnImportVatWasPaid() [0.49] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat was paid
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.49] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // andIChooseTheCustomsDutyOption() [0.47] (ReclaimStepsSteps.scala) pattern: I choose the Customs Duty option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIEnterCustomsDutyPaid() [0.47] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: 50.00")
        andIClearAmountAndEnterCustomsDutyShouldHavePaid("50.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClearAmountAndEnterCustomsDutyShouldHavePaid() [0.70] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.63] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // andIClearAmountAndEnterCustomsDutyPaid() [0.62] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"
        // andIEnterCustomsDutyPaid() [0.58] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIClearAmountAndEnterOtherDutyShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty should have paid- OtherDutyBeenPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterOtherDutyPaid() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterOtherCustomDutyBeenPaidToHMRC() [0.49] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterImportVatPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterImportVatBeenPaidToHMRC() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I choose Bank transfer (Bacs) repayment option")
        andIChooseRepaymentOption("Bank transfer (Bacs)")  // auto-chosen (score=0.70, selectRepayMethodStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Application complete - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Application complete - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }

    Scenario("User is not presented with CMA repayment option for claims more than 42 days ago [YorNvat=Yes, fName=Test, lName=Importer, YorNgoodsOwner=Yes, phoneNo=09876543212, emailAddress=test@mail.com, YorNDeclarantRefNO=Yes, declarantRefNo=1234abcxyz, aName=Megacorp, sCode=207106, accNo=86563611]") {
      Given("I am on the start page for trader service and select Apply Now")
        givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow()  // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Amend Now
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Importer claimant type")
        andIChooseImporterClaimantType()  // auto-chosen (score=1.00, ImporterorRepStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseAnArticleType() [0.56] (ArticleStepsSteps.scala) pattern: I choose an article Type
        // andIChooseRepresentativeClaimantType() [0.56] (ImporterorRepStepsSteps.scala) pattern: I choose Representative claimant type
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose one entry")
        andIChooseOneEntry()  // auto-chosen (score=1.00, EntriesStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseMultiEntry() [0.52] (EntriesStepsSteps.scala) pattern: I choose multi entry
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.47] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterDeclarationDetails() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter declaration details- EPU: "([^"]*)" and Entry No: "([^"]*)"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter an entry date that was 43 days ago")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAnEntryDateThatWasXDaysAgo() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter an entry date that was ([^"]*) days ago
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

      Then("I am on Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose a regulation repayment Type")
        andIChooseARegulationRepaymentType()  // auto-chosen (score=1.00, RegulationsStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose an application Reason")
        andIChooseAnApplicationReason()  // auto-chosen (score=1.00, AppReasonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter goods details- Details: Shoes Jeans Jackets")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterGoodsDetails() [0.70] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterFurtherGoodsDetails() [0.58] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
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

      Then("I am on What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose the Customs Duty option")
        andIChooseTheCustomsDutyOption()  // auto-chosen (score=1.00, ReclaimStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter customs Duty paid- CustomDuty: 1000.00")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyPaid() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterCustomsDutyPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 500.00")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // andIEnterCustomsDutyPaid() [0.58] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIEnterOtherCustomDutyBeenPaidToHMRC() [0.56] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIClearAmountAndEnterCustomsDutyShouldHavePaid() [0.51] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatBeenPaidToHMRC() [0.47] (VatStepsSteps.scala) pattern: I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK page")
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

      Then("I am on Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Yes option")
        andIChooseOption("")  // auto-chosen (score=0.70, VatRegStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What is your name? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter first Test and last Importer")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterFirstAndLastName() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter first \"([^\"]*)\" and last \"([^\"]*)\"
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

      Then("I am on Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I choose Yes option to confirm owner of the goods")
        andIChooseOptionToConfirmOwnerOfTheGoods("")  // auto-chosen (score=0.70, GoodsOwnerStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseTheCustomsDutyOption() [0.47] (ReclaimStepsSteps.scala) pattern: I choose the Customs Duty option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I select email option")
        andISelectEmailOption()  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter test@mail.com")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I select phone no option")
        andISelectPhoneNoOption()  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andISelectEmailOption() [0.52] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select email option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter 09876543212 importers")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterPhoneNo() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Yes options")
        andIChooseOptions("")  // auto-chosen (score=0.70, DeclarantRefNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I enter to create 1234abcxyz")
        andIEnterToCreate("")  // auto-chosen (score=1.00, DeclarantRefNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterEmail() [1.00] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\"
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

      Then("I am on Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK page")
        andIEnterEmail("")  // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // andIEnterYourNameAndBusinessName() [0.56] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter your \"([^\"]*)\" and business \"([^\"]*)\"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatPaid() [0.47] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"

      And("I enter account Megacorp and sortcode 207106 and account number 86563611")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAccountAndSortcodeAndAccountNumber() [0.70] (selectRepayMethodStepsSteps.scala) pattern: I enter account \"([^\"]*)\" and sortcode \"([^\"]*)\" and account number \"([^\"]*)\"
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

      Then("I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on change option on the review page for entry details")
        whenIClickOnChangeOptionOnTheReviewPageForEntryDetails()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for reference no
        // whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for response type
        // whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for documents uploaded
        // whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for total return amount
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.47] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details

      And("I enter an entry date that was 41 days ago")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAnEntryDateThatWasXDaysAgo() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter an entry date that was ([^"]*) days ago
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

      Then("I am on Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I choose Bank transfer (Bacs) repayment option")
        andIChooseRepaymentOption("")  // auto-chosen (score=0.70, selectRepayMethodStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Application complete - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }

    Scenario("Representative is not presented with CMA repayment option for claims more than 42 days ago [YorNeori=Yes, eoriNo=GB123456789123, YorNvat=Yes, impName=test importer, declarantName=test declarant, businessName=test agent, phoneNo=09876543212, emailAddress=test@gmail.com, YorNDeclarantRefNO=Yes, declarantRefNo=123abcxyz, yOrNoIndirectRep=No, aName=Megacorp, sCode=207106, accNo=86563611]") {
      Given("I am on the start page for trader service and select Apply Now")
        givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow()  // auto-chosen (score=1.00, LoginPageStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow() [0.65] (LoginPageStepsSteps.scala) pattern: I am on the start page for trader service and select Amend Now
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Representative claimant type")
        andIChooseRepresentativeClaimantType()  // auto-chosen (score=1.00, ImporterorRepStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseAnArticleType() [0.56] (ArticleStepsSteps.scala) pattern: I choose an article Type
        // andIChooseImporterClaimantType() [0.56] (ImporterorRepStepsSteps.scala) pattern: I choose Importer claimant type
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose one entry")
        andIChooseOneEntry()  // auto-chosen (score=1.00, EntriesStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseMultiEntry() [0.52] (EntriesStepsSteps.scala) pattern: I choose multi entry
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.47] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterDeclarationDetails() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter declaration details- EPU: "([^"]*)" and Entry No: "([^"]*)"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter an entry date that was 43 days ago")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAnEntryDateThatWasXDaysAgo() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter an entry date that was ([^"]*) days ago
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

      Then("I am on Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose a regulation repayment Type")
        andIChooseARegulationRepaymentType()  // auto-chosen (score=1.00, RegulationsStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose an application Reason")
        andIChooseAnApplicationReason()  // auto-chosen (score=1.00, AppReasonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter goods details- Details: Shoes Jeans Jackets")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterGoodsDetails() [0.70] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterFurtherGoodsDetails() [0.58] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
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

      Then("I am on What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXForYouAbleToDoWhatYouNeededToDoToday() [0.48] (FeedbackFormStepsSteps.scala) pattern: I choose \"([^\"]*)\" for you able to do what you needed to do today

      And("I choose the Customs Duty option")
        andIChooseTheCustomsDutyOption()  // auto-chosen (score=1.00, ReclaimStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter customs Duty paid- CustomDuty: 500.00")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyPaid() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterCustomsDutyPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 250.00")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // andIEnterCustomsDutyPaid() [0.58] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIEnterOtherCustomDutyBeenPaidToHMRC() [0.56] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIClearAmountAndEnterCustomsDutyShouldHavePaid() [0.51] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatBeenPaidToHMRC() [0.47] (VatStepsSteps.scala) pattern: I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK page")
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

      Then("I am on Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose eori Yes option")
        andIChooseEori("")  // auto-chosen (score=0.70, EoriNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter GB123456789123 in correct format GB")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterXInCorrectFormatGB() [0.70] (EoriNoStepsSteps.scala) pattern: I enter \"([^\"]*)\" in correct format GB
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

      Then("I am on Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Yes option")
        andIChooseOption("")  // auto-chosen (score=0.70, VatRegStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter test importer name in rep journey")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterImpNameInRepJourney() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" name in rep journey
        // andIEnterName() [0.70] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Your details - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter your test declarant and business test agent")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterYourNameAndBusinessName() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter your \"([^\"]*)\" and business \"([^\"]*)\"
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

      Then("I am on How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I select email option")
        andISelectEmailOption()  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter test@gmail.com")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I select phone no option")
        andISelectPhoneNoOption()  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andISelectEmailOption() [0.52] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select email option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter 09876543212 importers")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterPhoneNo() [0.70] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Yes options")
        andIChooseOptions("")  // auto-chosen (score=0.70, DeclarantRefNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I enter to create 123abcxyz")
        andIEnterToCreate("")  // auto-chosen (score=1.00, DeclarantRefNoStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterEmail() [1.00] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\"
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

      Then("I am on Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose Representative option")
        andIChooseRepresentativeOption()  // auto-chosen (score=1.00, whoToBoRepaidStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseXIndirectRepresentativeOption() [0.56] (whoToBoRepaidStepsSteps.scala) pattern: I choose \"([^\"]*)\" indirect representative option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I choose No indirect representative option")
        andIChooseRepresentativeOption()  // auto-chosen (score=0.70, whoToBoRepaidStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseXIndirectRepresentativeOption() [0.70] (whoToBoRepaidStepsSteps.scala) pattern: I choose \"([^\"]*)\" indirect representative option
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the next file")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.70] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // andIClickTheXLink() [0.56] (CommonStepsSteps.scala) pattern: I click the (.*) link
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the file upload continue button")
        whenIClickOnTheFileUploadContinueButton()  // auto-chosen (score=1.00, FileUploadedStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.70] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButton() [0.70] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.49] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file

      Then("I am on Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK page")
        andIEnterEmail("")  // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // andIEnterYourNameAndBusinessName() [0.56] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter your \"([^\"]*)\" and business \"([^\"]*)\"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatPaid() [0.47] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"

      And("I enter account Megacorp and sortcode 207106 and account number 86563611")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAccountAndSortcodeAndAccountNumber() [0.70] (selectRepayMethodStepsSteps.scala) pattern: I enter account \"([^\"]*)\" and sortcode \"([^\"]*)\" and account number \"([^\"]*)\"
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

      Then("I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on change option on the review page for entry details")
        whenIClickOnChangeOptionOnTheReviewPageForEntryDetails()  // auto-chosen (score=1.00, CheckYourAnswersStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for reference no
        // whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for response type
        // whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the amend review page for documents uploaded
        // whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount() [0.54] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for total return amount
        // thenIAmOnPage() [0.52] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.47] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details

      And("I enter an entry date that was 41 days ago")
        andIEnterEmail("")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAnEntryDateThatWasXDaysAgo() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter an entry date that was ([^"]*) days ago
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

      Then("I am on Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option

      And("I choose Bank transfer (Bacs) repayment option")
        andIChooseRepaymentOption("")  // auto-chosen (score=0.70, selectRepayMethodStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Application complete - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

    }
  }
}

```


presentation compiler configuration:
Scala version: 2.13.16
Classpath:
<WORKSPACE>/.bloop/testSuite/bloop-bsp-clients-classes/test-classes-Metals-MlKibcADSZWpylJPeUerpA== [exists ], <HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.11.2/semanticdb-javac-0.11.2.jar [exists ], <WORKSPACE>/.bloop/testSuite/bloop-bsp-clients-classes/classes-Metals-MlKibcADSZWpylJPeUerpA== [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.17/scala-library-2.13.17.jar [exists ], <HOME>/.cache/coursier/v1/https/artefacts.tax.service.gov.uk/artifactory/hmrc-releases/uk/gov/hmrc/ui-test-runner_2.13/0.50.0/ui-test-runner_2.13-0.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatestplus/selenium-4-12_2.13/3.2.17.0/selenium-4-12_2.13-3.2.17.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/cucumber-scala_2.13/8.35.0/cucumber-scala_2.13-8.35.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/cucumber-junit/7.30.0/cucumber-junit-7.30.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/novocode/junit-interface/0.11/junit-interface-0.11.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.5.18/logback-classic-1.5.18.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.3/config-1.4.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/typesafe/scala-logging/scala-logging_2.13/3.9.5/scala-logging_2.13-3.9.5.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-all/0.64.8/flexmark-all-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest_2.13/3.2.19/scalatest_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-java/4.33.0/selenium-java-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-core_2.13/3.2.19/scalatest-core_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/htmlunit-driver/4.12.0/htmlunit-driver-4.12.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/cucumber-core/7.30.0/cucumber-core-7.30.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/test-interface/1.0/test-interface-1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-core/1.5.18/logback-core-1.5.18.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.17/slf4j-api-2.0.17.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.17/scala-reflect-2.13.17.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark/0.64.8/flexmark-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-abbreviation/0.64.8/flexmark-ext-abbreviation-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-admonition/0.64.8/flexmark-ext-admonition-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-anchorlink/0.64.8/flexmark-ext-anchorlink-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-aside/0.64.8/flexmark-ext-aside-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-attributes/0.64.8/flexmark-ext-attributes-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-autolink/0.64.8/flexmark-ext-autolink-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-definition/0.64.8/flexmark-ext-definition-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-emoji/0.64.8/flexmark-ext-emoji-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-enumerated-reference/0.64.8/flexmark-ext-enumerated-reference-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-escaped-character/0.64.8/flexmark-ext-escaped-character-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-footnotes/0.64.8/flexmark-ext-footnotes-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-gfm-issues/0.64.8/flexmark-ext-gfm-issues-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-gfm-strikethrough/0.64.8/flexmark-ext-gfm-strikethrough-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-gfm-tasklist/0.64.8/flexmark-ext-gfm-tasklist-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-gfm-users/0.64.8/flexmark-ext-gfm-users-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-gitlab/0.64.8/flexmark-ext-gitlab-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-jekyll-front-matter/0.64.8/flexmark-ext-jekyll-front-matter-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-jekyll-tag/0.64.8/flexmark-ext-jekyll-tag-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-media-tags/0.64.8/flexmark-ext-media-tags-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-resizable-image/0.64.8/flexmark-ext-resizable-image-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-macros/0.64.8/flexmark-ext-macros-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-ins/0.64.8/flexmark-ext-ins-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-xwiki-macros/0.64.8/flexmark-ext-xwiki-macros-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-superscript/0.64.8/flexmark-ext-superscript-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-tables/0.64.8/flexmark-ext-tables-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-toc/0.64.8/flexmark-ext-toc-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-typographic/0.64.8/flexmark-ext-typographic-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-wikilink/0.64.8/flexmark-ext-wikilink-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-yaml-front-matter/0.64.8/flexmark-ext-yaml-front-matter-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-ext-youtube-embedded/0.64.8/flexmark-ext-youtube-embedded-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-html2md-converter/0.64.8/flexmark-html2md-converter-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-jira-converter/0.64.8/flexmark-jira-converter-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-pdf-converter/0.64.8/flexmark-pdf-converter-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-profile-pegdown/0.64.8/flexmark-profile-pegdown-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-ast/0.64.8/flexmark-util-ast-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-builder/0.64.8/flexmark-util-builder-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-collection/0.64.8/flexmark-util-collection-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-data/0.64.8/flexmark-util-data-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-dependency/0.64.8/flexmark-util-dependency-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-format/0.64.8/flexmark-util-format-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-html/0.64.8/flexmark-util-html-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-misc/0.64.8/flexmark-util-misc-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-options/0.64.8/flexmark-util-options-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-sequence/0.64.8/flexmark-util-sequence-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util-visitor/0.64.8/flexmark-util-visitor-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-youtrack-converter/0.64.8/flexmark-youtrack-converter-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-featurespec_2.13/3.2.19/scalatest-featurespec_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-flatspec_2.13/3.2.19/scalatest-flatspec_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-freespec_2.13/3.2.19/scalatest-freespec_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-funsuite_2.13/3.2.19/scalatest-funsuite_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-funspec_2.13/3.2.19/scalatest-funspec_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-propspec_2.13/3.2.19/scalatest-propspec_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-refspec_2.13/3.2.19/scalatest-refspec_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-wordspec_2.13/3.2.19/scalatest-wordspec_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-diagrams_2.13/3.2.19/scalatest-diagrams_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-matchers-core_2.13/3.2.19/scalatest-matchers-core_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-shouldmatchers_2.13/3.2.19/scalatest-shouldmatchers_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-mustmatchers_2.13/3.2.19/scalatest-mustmatchers_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-api/4.33.0/selenium-api-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-chrome-driver/4.33.0/selenium-chrome-driver-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-devtools-v135/4.33.0/selenium-devtools-v135-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-devtools-v136/4.33.0/selenium-devtools-v136-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-devtools-v137/4.33.0/selenium-devtools-v137-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-edge-driver/4.33.0/selenium-edge-driver-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-firefox-driver/4.33.0/selenium-firefox-driver-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-ie-driver/4.33.0/selenium-ie-driver-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-remote-driver/4.33.0/selenium-remote-driver-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-safari-driver/4.33.0/selenium-safari-driver-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-support/4.33.0/selenium-support-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalatest/scalatest-compatible/3.2.19/scalatest-compatible-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scalactic/scalactic_2.13/3.2.19/scalactic_2.13-3.2.19.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.13/2.1.0/scala-xml_2.13-2.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/sourceforge/htmlunit/htmlunit/2.70.0/htmlunit-2.70.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/cucumber-gherkin/7.30.0/cucumber-gherkin-7.30.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/cucumber-gherkin-messages/7.30.0/cucumber-gherkin-messages-7.30.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/messages/29.0.1/messages-29.0.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/pretty-formatter/2.3.0/pretty-formatter-2.3.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/teamcity-formatter/0.1.1/teamcity-formatter-0.1.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/testng-xml-formatter/0.6.0/testng-xml-formatter-0.6.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/tag-expressions/6.1.2/tag-expressions-6.1.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/cucumber-expressions/18.0.1/cucumber-expressions-18.0.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/cucumber-json-formatter/0.2.1/cucumber-json-formatter-0.2.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/datatable/7.30.0/datatable-7.30.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/cucumber-plugin/7.30.0/cucumber-plugin-7.30.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/docstring/7.30.0/docstring-7.30.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/html-formatter/21.15.1/html-formatter-21.15.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/junit-xml-formatter/0.9.0/junit-xml-formatter-0.9.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/ci-environment/10.0.1/ci-environment-10.0.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/vladsch/flexmark/flexmark-util/0.64.8/flexmark-util-0.64.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/nibor/autolink/autolink/0.6.0/autolink-0.6.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jsoup/jsoup/1.15.4/jsoup-1.15.4.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/ibm/icu/icu4j/72.1/icu4j-72.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/openhtmltopdf/openhtmltopdf-core/1.0.10/openhtmltopdf-core-1.0.10.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/openhtmltopdf/openhtmltopdf-pdfbox/1.0.10/openhtmltopdf-pdfbox-1.0.10.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/openhtmltopdf/openhtmltopdf-rtl-support/1.0.10/openhtmltopdf-rtl-support-1.0.10.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jetbrains/annotations/24.0.1/annotations-24.0.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jspecify/jspecify/1.0.0/jspecify-1.0.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/auto/service/auto-service-annotations/1.1.1/auto-service-annotations-1.1.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-chromium-driver/4.33.0/selenium-chromium-driver-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-json/4.33.0/selenium-json-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-manager/4.33.0/selenium-manager-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-http/4.33.0/selenium-http-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/guava/guava/33.4.8-jre/guava-33.4.8-jre.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-api/1.50.0/opentelemetry-api-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-context/1.50.0/opentelemetry-context-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-exporter-logging/1.50.0/opentelemetry-exporter-logging-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-sdk-common/1.50.0/opentelemetry-sdk-common-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-sdk-extension-autoconfigure-spi/1.50.0/opentelemetry-sdk-extension-autoconfigure-spi-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-sdk-extension-autoconfigure/1.50.0/opentelemetry-sdk-extension-autoconfigure-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-sdk-trace/1.50.0/opentelemetry-sdk-trace-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-sdk/1.50.0/opentelemetry-sdk-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/bytebuddy/byte-buddy/1.17.7/byte-buddy-1.17.7.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/seleniumhq/selenium/selenium-os/4.33.0/selenium-os-4.33.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/httpcomponents/httpmime/4.5.14/httpmime-4.5.14.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/sourceforge/htmlunit/htmlunit-core-js/2.70.0/htmlunit-core-js-2.70.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/sourceforge/htmlunit/neko-htmlunit/2.70.0/neko-htmlunit-2.70.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/sourceforge/htmlunit/htmlunit-cssparser/1.14.0/htmlunit-cssparser-1.14.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/sourceforge/htmlunit/htmlunit-xpath/2.70.0/htmlunit-xpath-2.70.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-text/1.10.0/commons-text-1.10.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/commons-io/commons-io/2.10.0/commons-io-2.10.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/commons-net/commons-net/3.9.0/commons-net-3.9.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/commons-codec/commons-codec/1.15/commons-codec-1.15.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/brotli/dec/0.1.2/dec-0.1.2.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/shapesecurity/salvation2/3.0.1/salvation2-3.0.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/eclipse/jetty/websocket/websocket-client/9.4.50.v20221201/websocket-client-9.4.50.v20221201.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/gherkin/35.1.0/gherkin-35.1.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/cucumber/query/14.7.0/query-14.7.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/pdfbox/pdfbox/2.0.24/pdfbox-2.0.24.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/pdfbox/xmpbox/2.0.24/xmpbox-2.0.24.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/de/rototor/pdfbox/graphics2d/0.32/graphics2d-0.32.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/guava/failureaccess/1.0.3/failureaccess-1.0.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.36.0/error_prone_annotations-2.36.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/j2objc/j2objc-annotations/3.0.0/j2objc-annotations-3.0.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-sdk-metrics/1.50.0/opentelemetry-sdk-metrics-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/opentelemetry/opentelemetry-sdk-logs/1.50.0/opentelemetry-sdk-logs-1.50.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-exec/1.4.0/commons-exec-1.4.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/httpcomponents/httpclient/4.5.14/httpclient-4.5.14.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/eclipse/jetty/jetty-client/9.4.50.v20221201/jetty-client-9.4.50.v20221201.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/eclipse/jetty/jetty-util/9.4.50.v20221201/jetty-util-9.4.50.v20221201.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/eclipse/jetty/jetty-io/9.4.50.v20221201/jetty-io-9.4.50.v20221201.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/eclipse/jetty/websocket/websocket-common/9.4.50.v20221201/websocket-common-9.4.50.v20221201.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/assertj/assertj-core/3.27.5/assertj-core-3.27.5.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/pdfbox/fontbox/2.0.24/fontbox-2.0.24.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/httpcomponents/httpcore/4.4.16/httpcore-4.4.16.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/eclipse/jetty/jetty-http/9.4.50.v20221201/jetty-http-9.4.50.v20221201.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/eclipse/jetty/websocket/websocket-api/9.4.50.v20221201/websocket-api-9.4.50.v20221201.jar [exists ]
Options:
-unchecked -deprecation -encoding UTF-8 -Xlint -Ywarn-macros:after -release 11 -feature -Yrangepos -Xplugin-require:semanticdb




#### Error stacktrace:

```
scala.tools.nsc.interactive.CompilerControl.$anonfun$doLocateContext$1(CompilerControl.scala:100)
	scala.tools.nsc.interactive.CompilerControl.doLocateContext(CompilerControl.scala:100)
	scala.tools.nsc.interactive.CompilerControl.doLocateContext$(CompilerControl.scala:99)
	scala.tools.nsc.interactive.Global.doLocateContext(Global.scala:115)
	scala.meta.internal.pc.PcDefinitionProvider.definitionTypedTreeAt(PcDefinitionProvider.scala:181)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:69)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:17)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$definition$1(ScalaPresentationCompiler.scala:490)
	scala.meta.internal.pc.CompilerAccess.retryWithCleanCompiler(CompilerAccess.scala:182)
	scala.meta.internal.pc.CompilerAccess.$anonfun$withSharedCompiler$1(CompilerAccess.scala:155)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.pc.CompilerAccess.withSharedCompiler(CompilerAccess.scala:154)
	scala.meta.internal.pc.CompilerAccess.$anonfun$withNonInterruptableCompiler$1(CompilerAccess.scala:132)
	scala.meta.internal.pc.CompilerAccess.$anonfun$onCompilerJobQueue$1(CompilerAccess.scala:209)
	scala.meta.internal.pc.CompilerJobQueue$Job.run(CompilerJobQueue.scala:152)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:840)
```
#### Short summary: 

scala.reflect.internal.FatalError: no context found for source-file://<WORKSPACE>/src/test/scala/ndrcApplication/specs/RestrictedCMASpec.scala,line-10,offset=304