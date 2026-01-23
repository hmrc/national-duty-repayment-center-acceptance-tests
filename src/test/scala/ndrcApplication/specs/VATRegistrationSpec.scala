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

class VATRegistrationSpec extends BaseSpec {

  Feature("Importers Journey") {

    Scenario("VAT Registration") {
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
        andIEnterDeclarationDetails("345", "123456t") // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterDeclarationDetails() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter declaration details- EPU: "([^"]*)" and Entry No: "([^"]*)"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter an entry date of 12/12/2020")
        andIEnterAnEntryDateOfX("12", "12", "2020")  // auto-chosen (score=1.00, EntryDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAnEntryDateOfX() [1.00] (EntryDetailsStepsSteps.scala) pattern: I enter an entry date of (.*)/(.*)/(.*)
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

      And("I choose an article Type")
        andIChooseAnArticleType()  // auto-chosen (score=1.00, ArticleStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type
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
        andIEnterCustomsDutyPaid("1000.00")  // auto-chosen (score=0.70, CustomsDutyStepsSteps.scala)
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
        andIEnterCustomsDutyShouldHavePaidToHMRC("750.00")  // auto-chosen (score=0.70, CustomsDutyStepsSteps.scala)
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
        andIEnterImportVatPaid("1500.00")  // auto-chosen (score=0.70, VatStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterImportVatPaid() [0.70] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // andIClearAmountAndEnterImportVatPaid() [0.47] (RepaymentAmountSummaryStepsSteps.scala) pattern: I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"

      And("I enter import vat been Paid to HMRC- VatBeenPaid: 500.00")
        andIEnterImportVatBeenPaidToHMRC("500.00")  // auto-chosen (score=0.70, VatStepsSteps.scala)
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
        andIEnterOtherCustomDutyPaid("1250.00")  // auto-chosen (score=0.70, OtherCustDutyStepsSteps.scala)
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
        andIEnterOtherCustomDutyBeenPaidToHMRC("200.00")  // auto-chosen (score=0.70, OtherCustDutyStepsSteps.scala)
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

    }

    Scenario("VAT Registration Importers multi-entry journey [noOfEntries=8]") {
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

      And("I choose multi entry")
        andIChooseMultiEntry()  // auto-chosen (score=1.00, EntriesStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOneEntry() [0.52] (EntriesStepsSteps.scala) pattern: I choose one entry
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      And("I enter 8 value")
        andIEnterValue("8")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterValue() [0.70] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Enter the details of the oldest entry - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Enter the details of the oldest entry - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, ImporterPersonalDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // thenIAmOnPage() [0.70] (CommonStepsSteps.scala) pattern: I am on "([^"]*)" page
        // andIEnterXOfTheService() [0.56] (FeedbackFormStepsSteps.scala) pattern: I enter \"([^\"]*)\" of the service
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name
        // whenIClickOnChangeOptionOnTheReviewPageForEntryDetails() [0.47] (CheckYourAnswersStepsSteps.scala) pattern: I click on change option on the review page for entry details
        // andIEnterImportVatPaid() [0.47] (VatStepsSteps.scala) pattern: I enter import vat paid- VatPaid: "([^"]*)"

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
        andIEnterDeclarationDetails("345", "123456t")  // auto-chosen (score=0.70, EntryDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterDeclarationDetails() [0.70] (EntryDetailsStepsSteps.scala) pattern: I enter declaration details- EPU: "([^"]*)" and Entry No: "([^"]*)"
        // andIEnterGoodsDetails() [0.56] (AboutGoodsStepsSteps.scala) pattern: I enter goods details- Details: "([^"]*)"
        // andIEnterCountry() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter country \"([^\"]*)\"
        // andIEnterPhoneNo() [0.47] (ImporterPersonalDetailsStepsSteps.scala) pattern: I enter \"([^\"]*)\" importers
        // andIEnterValue() [0.47] (EntriesStepsSteps.scala) pattern: I enter \"([^\"]*)\" value
        // andIEnterFurtherGoodsDetails() [0.47] (AmendCaseFurtherInfoStepsSteps.scala) pattern: I enter further goods details- Details: \"([^\"]*)\"
        // andIEnterName() [0.47] (GoodsOwnerStepsSteps.scala) pattern: I enter \"([^\"]*)\" name

      And("I enter an entry date of 12/12/2020")
        andIEnterAnEntryDateOfX("12", "12", "2020")  // auto-chosen (score=1.00, EntryDetailsStepsSteps.scala)
        // --- Other possible matches ---
        // andIEnterAnEntryDateOfX() [1.00] (EntryDetailsStepsSteps.scala) pattern: I enter an entry date of (.*)/(.*)/(.*)
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

      And("I choose an article Type")
        andIChooseAnArticleType()  // auto-chosen (score=1.00, ArticleStepsSteps.scala)
        // --- Other possible matches ---
        // andIChooseOptions() [0.47] (DeclarantRefNoStepsSteps.scala) pattern: I choose \"([^\"]*)\" options
        // andIChooseARegulationRepaymentType() [0.47] (RegulationsStepsSteps.scala) pattern: I choose a regulation repayment Type
        // andIChooseOption() [0.47] (VatRegStepsSteps.scala) pattern: I choose "([^"]*)" option

      When("I click on the Continue button")
        whenIClickOnTheXButton("")  // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
        // whenIClickOnTheXButtonOnFeedbackForm() [0.52] (FeedbackFormStepsSteps.scala) pattern: I click on the \"([^\"]*)\" button on feedback form
        // whenIClickOnTheFileUploadContinueButton() [0.52] (FileUploadedStepsSteps.scala) pattern: I click on the file upload continue button

      Then("I am on Upload your document with multiple entries - Apply for repayment of import duty and import VAT - GOV.UK page")
        thenIAmOnPage("Upload your document with multiple entries - Apply for repayment of import duty and import VAT - GOV.UK")  // auto-chosen (score=0.70, CommonStepsSteps.scala)

      When("I click on Choose file button and add the second file")
        whenIClickOnChooseFileButtonAndAddTheXFile("second") // auto-chosen (score=0.70, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // whenIClickOnChooseFileButtonAndAddTheXFile() [0.70] (UploadFileStepsSteps.scala) pattern: I click on Choose file button and add the "([^"]*)" file
        // whenIClickTheFileContinueButton() [0.58] (FileUploadedStepsSteps.scala) pattern: I click the file continue button
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
        andIEnterCustomsDutyPaid("1000.00") // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
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
        andIEnterCustomsDutyShouldHavePaidToHMRC("750.00")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
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
        andIEnterImportVatPaid("1500.00") // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
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
        andIEnterOtherCustomDutyPaid("1250.00")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
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
        andIEnterOtherCustomDutyBeenPaidToHMRC("200.00")  // auto-chosen (score=1.00, ImporterPersonalDetailsStepsSteps.scala)
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
        whenIClickOnChooseFileButtonAndAddTheXFile("first")   // auto-chosen (score=0.70, CommonStepsSteps.scala)
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

      And("I click on Help VAT registration link")
        andIClickOnHelpVATRegistrationLink()  // auto-chosen (score=1.00, VatRegStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickTheXLink() [0.57] (CommonStepsSteps.scala) pattern: I click the (.*) link
        // andIConfirmVATRegistrationIsDisplayed() [0.47] (VatRegStepsSteps.scala) pattern: I confirm VAT registration is displayed: \"([^\"]*)\"

      And("I confirm VAT registration is displayed: Help with VAT registration You must register your business for VAT with HMRC if its VAT taxable turnover is over the current VAT registration threshold. You can register voluntarily if your turnover is under the threshold, unless everything you sell is exempt.")
        andIConfirmVATRegistrationIsDisplayed("Help with VAT registration You must register your business for VAT with HMRC if its VAT taxable turnover is over the current VAT registration threshold. You can register voluntarily if your turnover is under the threshold, unless everything you sell is exempt.")  // auto-chosen (score=1.00, VatRegStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickOnHelpVATRegistrationLink() [0.50] (VatRegStepsSteps.scala) pattern: I click on Help VAT registration link

    }
  }
}
