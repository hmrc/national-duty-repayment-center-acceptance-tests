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

class RepaymentAmountSummaryPageSpec extends BaseSpec {

  Feature("Repayment Amount Summary Page") {

    Scenario("A user wants to complete a New Importers journey") {
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
        andIEnterAnEntryDateThatWasXDaysAgo("7")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
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
        andIEnterGoodsDetails("Shoes Jeans Jackets")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
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

      And("I choose customsDuty importVAT anotherTypeofDuty options")
        andIChooseCustomsDutyImportVATAnotherTypeofDutyOptions()  // auto-chosen (score=1.00, ReclaimStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseTheCustomsDutyOption() [0.70] (ReclaimStepsSteps.scala) pattern: I choose the Customs Duty option
        // andIChooseOptions() [0.70] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.70] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIChooseAnArticleType() [0.56] (ArticleStepsSteps.scala) pattern: I choose an article Type
        // andIChooseEori() [0.52] (EoriNoStepsSteps.scala) pattern: I choose eori "([^"]*)" option
        // andIChooseRepresentativeOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Representative option
        // andIChooseImporterOption() [0.52] (whoToBoRepaidStepsSteps.scala) pattern: I choose Importer option
        // andIChooseRepaymentOption() [0.52] (selectRepayMethodStepsSteps.scala) pattern: I choose \"([^\"]*)\" repayment option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOptionToConfirmOwnerOfTheGoods() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I choose \"([^\"]*)\" option to confirm owner of the goods
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type

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

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 750.00")
        andIEnterCustomsDutyShouldHavePaidToHMRC("750.00")  // auto-chosen (score=1.00, CustomsDutyStepsSteps.scala)
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

      Then("I am on VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter import vat paid- VatPaid: 1500.00")
        andIEnterImportVatPaid("1500.00")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterImportVatPaid() [0.70] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterImportVatPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"

      And("I enter import vat been Paid to HMRC- VatBeenPaid: 500.00")
        andIEnterImportVatBeenPaidToHMRC("500.00")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterImportVatBeenPaidToHMRC() [0.70] (VatStepsSteps.scala) pattern: I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"
        // andIEnterImportVatPaid() [0.58] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIClearAmountAndEnterImportVatBeenPaidToHMRC() [0.52] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIVerifyChangedImportVatBeenPaidToHMRCIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\" is displayed

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I enter other custom Duty paid- OtherCustDutyPaid: 1250.00")
        andIEnterOtherCustomDutyPaid("1250.00")  // auto-chosen (score=1.00, OtherCustDutyStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterOtherCustomDutyPaid() [0.70] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterOtherCustomDutyBeenPaidToHMRC() [0.49] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterCustomsDutyPaid() [0.47] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"

      And("I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: 200.00")
        andIEnterOtherCustomDutyBeenPaidToHMRC("200.00")  // auto-chosen (score=1.00, OtherCustDutyStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterOtherCustomDutyBeenPaidToHMRC() [0.70] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"
        // andIEnterOtherCustomDutyPaid() [0.60] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIEnterImportVatBeenPaidToHMRC() [0.47] (VatStepsSteps.scala) pattern: I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"
        // andIEnterCustomsDutyPaid() [0.47] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      Then("I verify reclaim options is displayed")
        thenIVerifyReclaimOptionsIsDisplayed()  // auto-chosen (score=1.00, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I click on change option on customs duty was paid")
        andIClickOnChangeOptionOnCustomsDutyWasPaid()  // auto-chosen (score=1.00, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeOptionOnOtherDutyWasPaid() [0.63] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty was paid
        // andIClickOnChangeOptionOnCustomsDutyShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty should have paid
        // andIClickOnChangeOptionOnImportVatWasPaid() [0.56] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat was paid
        // andIClickOnChangeOptionOnOtherDutyShouldHavePaid() [0.51] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty should have paid
        // andIChooseTheCustomsDutyOption() [0.47] (ReclaimStepsSteps.scala) pattern: I choose the Customs Duty option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIEnterCustomsDutyPaid() [0.47] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I clear amount and enter customs Duty paid- CustomDuty: 7000.00")
        andIEnterCustomsDutyPaid("7000.00")  // auto-chosen (score=1.00, CustomsDutyStepsSteps.scala)
        // --- Other possible matches ---
        // andIClearAmountAndEnterCustomsDutyPaid() [0.70] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"
        // andIEnterCustomsDutyPaid() [0.70] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIClearAmountAndEnterOtherDutyPaid() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIClearAmountAndEnterCustomsDutyShouldHavePaid() [0.51] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterImportVatPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I verify changed customs duty paid- CustomDuty: £7000.00 is displayed")
        andIVerifyChangedCustomsDutyPaidIsDisplayed("£7000.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterCustomsDutyPaid() [0.58] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIVerifyChangedCustomsDutyShouldHavePaidIsDisplayed() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed customs duty should have paid- CustomDuty: \"([^\"]*)\" is displayed
        // andIVerifyChangedOtherDutyPaidIsDisplayed() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed other duty paid- OtherDutyPaid: \"([^\"]*)\" is displayed
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed
        // andIVerifyChangedImportVatPaidIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed import vat paid- VatPaid: \"([^\"]*)\" is displayed

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

      And("I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: 3300.00")
        andIClearAmountAndEnterCustomsDutyShouldHavePaid("3300.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
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

      And("I verify changed customs duty should have paid- CustomDuty: £3300.00 is displayed")
        andIVerifyChangedCustomsDutyPaidIsDisplayed("£3300.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIVerifyChangedCustomsDutyShouldHavePaidIsDisplayed() [0.70] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed customs duty should have paid- CustomDuty: \"([^\"]*)\" is displayed
        // andIEnterCustomsDutyPaid() [0.58] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"
        // andIVerifyChangedOtherDutyPaidIsDisplayed() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed other duty paid- OtherDutyPaid: \"([^\"]*)\" is displayed
        // andIEnterCustomsDutyShouldHavePaidToHMRC() [0.49] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed
        // andIVerifyChangedImportVatPaidIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed import vat paid- VatPaid: \"([^\"]*)\" is displayed

      And("I click on change option on import vat was paid")
        andIClickOnChangeOptionOnImportVatWasPaid()  // auto-chosen (score=1.00, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeOptionOnImportVatShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat should have paid
        // andIClickOnChangeOptionOnCustomsDutyWasPaid() [0.56] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty was paid
        // andIClickOnChangeOptionOnOtherDutyWasPaid() [0.56] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty was paid
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIEnterImportVatPaid() [0.47] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"

      Then("I am on VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I clear amount and enter import vat paid- VatPaid: 9000.00")
        andIClearAmountAndEnterImportVatPaid("9000.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClearAmountAndEnterImportVatPaid() [0.70] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"
        // andIEnterImportVatPaid() [0.70] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterCustomsDutyPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"
        // andIClearAmountAndEnterImportVatBeenPaidToHMRC() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterOtherDutyPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I verify changed import vat paid- VatPaid: £9000.00 is displayed")
        andIVerifyChangedImportVatPaidIsDisplayed("£9000.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterImportVatPaid() [0.58] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed
        // andIVerifyChangedCustomsDutyPaidIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed customs duty paid- CustomDuty: \"([^\"]*)\" is displayed
        // andIVerifyChangedImportVatBeenPaidToHMRCIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\" is displayed
        // andIVerifyChangedOtherDutyPaidIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed other duty paid- OtherDutyPaid: \"([^\"]*)\" is displayed
        // andIConfirmVATRegistrationIsDisplayed() [0.47] (VatRegStepsSteps.scala) pattern: I confirm VAT registration is displayed: \"([^\"]*)\"

      And("I click on change option on import vat should have paid")
        andIClickOnChangeOptionOnImportVatShouldHavePaid()  // auto-chosen (score=1.00, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeOptionOnImportVatWasPaid() [0.63] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat was paid
        // andIClickOnChangeOptionOnCustomsDutyShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty should have paid
        // andIClickOnChangeOptionOnOtherDutyShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty should have paid
        // andIClickOnChangeOptionOnCustomsDutyWasPaid() [0.49] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty was paid
        // andIClickOnChangeOptionOnOtherDutyWasPaid() [0.49] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty was paid
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option
        // andIEnterImportVatPaid() [0.47] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"

      Then("I am on VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: 4000.00")
        andIClearAmountAndEnterImportVatBeenPaidToHMRC("4000.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClearAmountAndEnterImportVatBeenPaidToHMRC() [0.70] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"
        // andIEnterImportVatBeenPaidToHMRC() [0.70] (VatStepsSteps.scala) pattern: I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"
        // andIClearAmountAndEnterImportVatPaid() [0.62] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"
        // andIEnterImportVatPaid() [0.58] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"
        // andIEnterToCreate() [0.52] (DeclarantRefNoStepsSteps.scala) pattern: I enter to create \"([^\"]*)\"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterCustomsDutyPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"
        // andIVerifyChangedImportVatBeenPaidToHMRCIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\" is displayed
        // andIClearAmountAndEnterOtherDutyPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I verify changed import vat been Paid to HMRC- VatBeenPaid: £4000.00 is displayed")
        andIVerifyChangedImportVatBeenPaidToHMRCIsDisplayed("£4000.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIVerifyChangedImportVatPaidIsDisplayed() [0.62] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed import vat paid- VatPaid: \"([^\"]*)\" is displayed
        // andIEnterImportVatBeenPaidToHMRC() [0.62] (VatStepsSteps.scala) pattern: I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed
        // andIVerifyChangedCustomsDutyPaidIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed customs duty paid- CustomDuty: \"([^\"]*)\" is displayed
        // andIClearAmountAndEnterImportVatBeenPaidToHMRC() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"
        // andIVerifyChangedOtherDutyPaidIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed other duty paid- OtherDutyPaid: \"([^\"]*)\" is displayed
        // andIConfirmVATRegistrationIsDisplayed() [0.47] (VatRegStepsSteps.scala) pattern: I confirm VAT registration is displayed: \"([^\"]*)\"
        // andIEnterImportVatPaid() [0.47] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"

      And("I click on change option on other duty was paid")
        andIClickOnChangeOptionOnOtherDutyWasPaid()  // auto-chosen (score=1.00, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeOptionOnCustomsDutyWasPaid() [0.63] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty was paid
        // andIClickOnChangeOptionOnOtherDutyShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty should have paid
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // andIClickOnChangeOptionOnImportVatWasPaid() [0.56] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat was paid
        // andIClickOnChangeOptionOnCustomsDutyShouldHavePaid() [0.51] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty should have paid
        // andIChooseTheCustomsDutyOption() [0.47] (ReclaimStepsSteps.scala) pattern: I choose the Customs Duty option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I clear amount and enter other duty paid- OtherDutyPaid: 100000.00")
        andIClearAmountAndEnterOtherDutyPaid("100000.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClearAmountAndEnterOtherDutyPaid() [0.70] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterCustomsDutyPaid() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"
        // andIClearAmountAndEnterOtherDutyShouldHavePaid() [0.51] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty should have paid- OtherDutyBeenPaid: \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterImportVatPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"
        // andIEnterCustomsDutyPaid() [0.47] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I verify changed other duty paid- OtherDutyPaid: £100000.00 is displayed")
        andIVerifyChangedOtherDutyPaidIsDisplayed("£100000.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIVerifyChangedCustomsDutyPaidIsDisplayed() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed customs duty paid- CustomDuty: \"([^\"]*)\" is displayed
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed
        // andIVerifyChangedImportVatPaidIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed import vat paid- VatPaid: \"([^\"]*)\" is displayed

      And("I click on change option on other duty should have paid")
        andIClickOnChangeOptionOnOtherDutyShouldHavePaid()  // auto-chosen (score=1.00, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeOptionOnCustomsDutyShouldHavePaid() [0.64] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty should have paid
        // andIClickOnChangeOptionOnOtherDutyWasPaid() [0.63] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on other duty was paid
        // andIClickOnChangeOptionOnImportVatShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat should have paid
        // whenIClickOnTheXButton() [0.56] (CommonStepsSteps.scala) pattern: I click on the "([^"]*)" button
        // andIClickOnChangeOptionOnCustomsDutyWasPaid() [0.56] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on customs duty was paid
        // andIClickOnChangeOptionOnImportVatWasPaid() [0.49] (RepaymentAmountSummaryStepsSteps.scala) pattern: I click on change option on import vat was paid
        // andIChooseTheCustomsDutyOption() [0.47] (ReclaimStepsSteps.scala) pattern: I choose the Customs Duty option
        // andISelectOption() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I select \"([^\"]*)\" option
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      Then("I am on Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I clear amount and enter other duty should have paid- OtherDutyBeenPaid: 2000.00")
        andIClearAmountAndEnterOtherDutyShouldHavePaid("2000.00")  // auto-chosen (score=0.70, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIClearAmountAndEnterOtherDutyShouldHavePaid() [0.70] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty should have paid- OtherDutyBeenPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterOtherDutyPaid() [0.62] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterCustomsDutyShouldHavePaid() [0.57] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"
        // andIClearAmountAndEnterCustomsDutyPaid() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"
        // andIEnterOtherCustomDutyPaid() [0.50] (OtherCustDutyStepsSteps.scala) pattern: I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterImportVatPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"
        // andIEnterCustomsDutyPaid() [0.47] (CustomsDutyStepsSteps.scala) pattern: I enter customs Duty paid- CustomDuty: "([^"]*)"

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      And("I verify changed other duty paid- OtherDutyBeenPaid: £2000.00 is displayed")
        andIVerifyChangedOtherDutyPaidIsDisplayed("£2000.00")  // auto-chosen (score=0.62, RepaymentAmountSummaryStepsSteps.scala)
        // --- Other possible matches ---
        // andIVerifyChangedCustomsDutyPaidIsDisplayed() [0.54] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed customs duty paid- CustomDuty: \"([^\"]*)\" is displayed
        // thenIVerifyReclaimOptionsIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify reclaim options is displayed
        // andIVerifyChangedImportVatPaidIsDisplayed() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I verify changed import vat paid- VatPaid: \"([^\"]*)\" is displayed

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

    }
  }
}
