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

class RestrictedCMASpec extends BaseSpec {

  Feature("Restricted CMA") {

    Scenario(
      "User is not presented with CMA repayment option for claims less than £250 [YorNvat=Yes, fName=Test, lName=Importer, YorNgoodsOwner=Yes, phoneNo=09876543212, emailAddress=test@mail.com, YorNDeclarantRefNO=Yes, declarantRefNo=1234abcxyz, aName=Megacorp, sCode=207106, accNo=86563611]"
    ) {
      Given("I am on the start page for trader service and select Apply Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Importer claimant type")
      andIChooseImporterClaimantType()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose one entry")
      andIChooseOneEntry()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
      andIEnterDeclarationDetails("345", "123456t")

      And("I enter an entry date that was 7 days ago")
      andIEnterAnEntryDateThatWasXDaysAgo("7")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose a regulation repayment Type")
      andIChooseARegulationRepaymentType()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose an application Reason")
      andIChooseAnApplicationReason()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter goods details- Details: Shoes Jeans Jackets")
      andIEnterGoodsDetails("Shoes Jeans Jackets")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose the Customs Duty option")
      andIChooseTheCustomsDutyOption()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter customs Duty paid- CustomDuty: 1000.00")
      andIEnterCustomsDutyPaid("1000.00")

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 751.00")
      andIEnterCustomsDutyShouldHavePaidToHMRC("751.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on Choose file button and add the first file")
      whenIClickOnChooseFileButtonAndAddTheXFile("first")

      And("I wait for the file to be uploaded")
      andIWaitForTheFileToBeUploaded()

      Then("I should see first uploaded doc JPEGImage.jpg on upload page")
      thenIShouldSeeUploadedDocOnUploadPage(
        "first",
        "JPEGImage.jpg"
      )

      When("I click the file continue button")
      whenIClickTheFileContinueButton()

      Then("I am on Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes option")
      andIChooseOption("Yes")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What is your name? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What is your name? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter first Test and last Importer")
      andIEnterFirstAndLastName("Test", "Importer")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes option to confirm owner of the goods")
      andIChooseOptionToConfirmOwnerOfTheGoods("Yes")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I select email option")
      andISelectEmailOption()

      And("I enter test@mail.com")
      andIEnterEmail("test@mail.com")

      And("I select phone no option")
      andISelectPhoneNoOption()

      And("I enter 09876543212 importers")
      andIEnterPhoneNo("09876543212")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes options")
      andIChooseOptions("Yes")

      And("I enter to create 1234abcxyz")
      andIEnterToCreate("1234abcxyz")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter account Megacorp and sortcode 207106 and account number 86563611")
      andIEnterAccountAndSortcodeAndAccountNumber(
        "Megacorp",
        "207106",
        "86563611"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on change option on the review page for total return amount")
      whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount()

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I click on change option on customs duty should have paid")
      andIClickOnChangeOptionOnCustomsDutyShouldHavePaid()

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: 750.00")
      andIClearAmountAndEnterCustomsDutyShouldHavePaid(
        "750.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Bank transfer (Bacs) repayment option")
      andIChooseRepaymentOption("Bank transfer (Bacs)")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Application complete - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Application complete - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }

    Scenario(
      "Representative is not presented with CMA repayment option for claims less than £250 [YorNeori=Yes, eoriNo=GB123456789123, YorNvat=Yes, impName=test importer, declarantName=test declarant, businessName=test agent, phoneNo=09876543212, emailAddress=test@gmail.com, YorNDeclarantRefNO=Yes, declarantRefNo=123abcxyz, yOrNoIndirectRep=No, aName=Megacorp, sCode=207106, accNo=86563611]"
    ) {
      Given("I am on the start page for trader service and select Apply Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Representative claimant type")
      andIChooseRepresentativeClaimantType()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose one entry")
      andIChooseOneEntry()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
      andIEnterDeclarationDetails("345", "123456t")

      And("I enter an entry date that was 7 days ago")
      andIEnterAnEntryDateThatWasXDaysAgo("7")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose a regulation repayment Type")
      andIChooseARegulationRepaymentType()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose an application Reason")
      andIChooseAnApplicationReason()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter goods details- Details: Shoes Jeans Jackets")
      andIEnterGoodsDetails("Shoes Jeans Jackets")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose the Customs Duty option")
      andIChooseTheCustomsDutyOption()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter customs Duty paid- CustomDuty: 300.00")
      andIEnterCustomsDutyPaid("300.00")

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 100.00")
      andIEnterCustomsDutyShouldHavePaidToHMRC(
        "100.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on Choose file button and add the first file")
      whenIClickOnChooseFileButtonAndAddTheXFile("first")

      And("I wait for the file to be uploaded")
      andIWaitForTheFileToBeUploaded()

      Then("I should see first uploaded doc JPEGImage.jpg on upload page")
      thenIShouldSeeUploadedDocOnUploadPage(
        "first",
        "JPEGImage.jpg"
      )

      When("I click the file continue button")
      whenIClickTheFileContinueButton()

      Then(
        "I am on Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose eori Yes option")
      andIChooseEori("Yes")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter GB123456789123 in correct format GB")
      andIEnterXInCorrectFormatGB("GB123456789123")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes option")
      andIChooseOption("Yes")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter test importer name in rep journey")
      andIEnterImpNameInRepJourney("Test Importer")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Your details - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Your details - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter your test declarant and business test agent")
      andIEnterYourNameAndBusinessName(
        "Test Declarant",
        "Test Agent"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I select email option")
      andISelectEmailOption()

      And("I enter test@gmail.com")
      andIEnterEmail("test@gmail.com")

      And("I select phone no option")
      andISelectPhoneNoOption()

      And("I enter 09876543212 importers")
      andIEnterPhoneNo("09876543212")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes options")
      andIChooseOption("Yes")

      And("I enter to create 123abcxyz")
      andIEnterToCreate("123abcxyz")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Representative option")
      andIChooseRepresentativeOption()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose No indirect representative option")
      andIChooseXIndirectRepresentativeOption("No")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on Choose file button and add the next file")
      whenIClickOnChooseFileButtonAndAddTheXFile("next")

      When("I click on the file upload continue button")
      whenIClickOnTheFileUploadContinueButton()

      Then("I am on Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter account Megacorp and sortcode 207106 and account number 86563611")
      andIEnterAccountAndSortcodeAndAccountNumber(
        "Megacorp",
        "207106",
        "86563611"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on change option on the review page for total return amount")
      whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount()

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I click on change option on customs duty should have paid")
      andIClickOnChangeOptionOnCustomsDutyShouldHavePaid()

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: 50.00")
      andIClearAmountAndEnterCustomsDutyShouldHavePaid(
        "50.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Bank transfer (Bacs) repayment option")
      andIChooseRepaymentOption("Bank transfer (Bacs)")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Application complete - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Application complete - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }

    Scenario(
      "User is not presented with CMA repayment option for claims more than 42 days ago [YorNvat=Yes, fName=Test, lName=Importer, YorNgoodsOwner=Yes, phoneNo=09876543212, emailAddress=test@mail.com, YorNDeclarantRefNO=Yes, declarantRefNo=1234abcxyz, aName=Megacorp, sCode=207106, accNo=86563611]"
    ) {
      Given("I am on the start page for trader service and select Apply Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Importer claimant type")
      andIChooseImporterClaimantType()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose one entry")
      andIChooseOneEntry()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
      andIEnterDeclarationDetails("345", "123456t")

      And("I enter an entry date that was 43 days ago")
      andIEnterAnEntryDateThatWasXDaysAgo("43")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose a regulation repayment Type")
      andIChooseARegulationRepaymentType()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose an application Reason")
      andIChooseAnApplicationReason()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter goods details- Details: Shoes Jeans Jackets")
      andIEnterGoodsDetails("Shoes Jeans Jackets")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose the Customs Duty option")
      andIChooseTheCustomsDutyOption()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter customs Duty paid- CustomDuty: 1000.00")
      andIEnterCustomsDutyPaid("1000.00")

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 500.00")
      andIEnterCustomsDutyShouldHavePaidToHMRC(
        "500.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on Choose file button and add the first file")
      whenIClickOnChooseFileButtonAndAddTheXFile("first")

      And("I wait for the file to be uploaded")
      andIWaitForTheFileToBeUploaded()

      Then("I should see first uploaded doc JPEGImage.jpg on upload page")
      thenIShouldSeeUploadedDocOnUploadPage(
        "first",
        "JPEGImage.jpg"
      )

      When("I click the file continue button")
      whenIClickTheFileContinueButton()

      Then("I am on Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes option")
      andIChooseOption("Yes")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What is your name? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What is your name? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter first Test and last Importer")
      andIEnterFirstAndLastName("Test", "Importer")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes option to confirm owner of the goods")
      andIChooseOptionToConfirmOwnerOfTheGoods("Yes")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I select email option")
      andISelectEmailOption()

      And("I enter test@mail.com")
      andIEnterEmail("test@mail.com")

      And("I select phone no option")
      andISelectPhoneNoOption()

      And("I enter 09876543212 importers")
      andIEnterPhoneNo("09876543212")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes options")
      andIChooseOptions("Yes")

      And("I enter to create 1234abcxyz")
      andIEnterToCreate("1234abcxyz")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter account Megacorp and sortcode 207106 and account number 86563611")
      andIEnterAccountAndSortcodeAndAccountNumber(
        "Megacorp",
        "207106",
        "86563611"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on change option on the review page for entry details")
      whenIClickOnChangeOptionOnTheReviewPageForEntryDetails()

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter an entry date that was 41 days ago")
      andIEnterAnEntryDateThatWasXDaysAgo("41")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Bank transfer (Bacs) repayment option")
      andIChooseRepaymentOption("Bank transfer (Bacs)")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Application complete - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Application complete - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }

    Scenario(
      "Representative is not presented with CMA repayment option for claims more than 42 days ago [YorNeori=Yes, eoriNo=GB123456789123, YorNvat=Yes, impName=test importer, declarantName=test declarant, businessName=test agent, phoneNo=09876543212, emailAddress=test@gmail.com, YorNDeclarantRefNO=Yes, declarantRefNo=123abcxyz, yOrNoIndirectRep=No, aName=Megacorp, sCode=207106, accNo=86563611]"
    ) {
      Given("I am on the start page for trader service and select Apply Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Representative claimant type")
      andIChooseRepresentativeClaimantType()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose one entry")
      andIChooseOneEntry()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter declaration details- EPU: 345 and Entry No: 123456t")
      andIEnterDeclarationDetails("345", "123456t")

      And("I enter an entry date that was 43 days ago")
      andIEnterAnEntryDateThatWasXDaysAgo("43")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose a regulation repayment Type")
      andIChooseARegulationRepaymentType()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose an application Reason")
      andIChooseAnApplicationReason()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter goods details- Details: Shoes Jeans Jackets")
      andIEnterGoodsDetails("Shoes Jeans Jackets")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose the Customs Duty option")
      andIChooseTheCustomsDutyOption()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter customs Duty paid- CustomDuty: 500.00")
      andIEnterCustomsDutyPaid("500.00")

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 250.00")
      andIEnterCustomsDutyShouldHavePaidToHMRC("250.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on Choose file button and add the first file")
      whenIClickOnChooseFileButtonAndAddTheXFile("first")

      And("I wait for the file to be uploaded")
      andIWaitForTheFileToBeUploaded()

      Then("I should see first uploaded doc JPEGImage.jpg on upload page")
      thenIShouldSeeUploadedDocOnUploadPage(
        "first",
        "JPEGImage.jpg"
      )

      When("I click the file continue button")
      whenIClickTheFileContinueButton()

      Then(
        "I am on Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose eori Yes option")
      andIChooseEori("Yes")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter GB123456789123 in correct format GB")
      andIEnterXInCorrectFormatGB("GB123456789123")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes option")
      andIChooseOption("Yes")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter test importer name in rep journey")
      andIEnterImpNameInRepJourney("Test Importer")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Your details - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Your details - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter your test declarant and business test agent")
      andIEnterYourNameAndBusinessName(
        "Test Declarant",
        "Test Agent"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I select email option")
      andISelectEmailOption()

      And("I enter test@gmail.com")
      andIEnterEmail("test@gmail.com")

      And("I select phone no option")
      andISelectPhoneNoOption()

      And("I enter 09876543212 importers")
      andIEnterPhoneNo("09876543212")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Yes options")
      andIChooseOption("Yes")

      And("I enter to create 123abcxyz")
      andIEnterToCreate("123abcxyz")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Representative option")
      andIChooseRepresentativeOption()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose No indirect representative option")
      andIChooseXIndirectRepresentativeOption("No")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on Choose file button and add the next file")
      whenIClickOnChooseFileButtonAndAddTheXFile("next")

      When("I click on the file upload continue button")
      whenIClickOnTheFileUploadContinueButton()

      Then("I am on Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter account Megacorp and sortcode 207106 and account number 86563611")
      andIEnterAccountAndSortcodeAndAccountNumber(
        "Megacorp",
        "207106",
        "86563611"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on change option on the review page for entry details")
      whenIClickOnChangeOptionOnTheReviewPageForEntryDetails()

      Then("I am on Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter an entry date that was 41 days ago")
      andIEnterAnEntryDateThatWasXDaysAgo("41")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose Bank transfer (Bacs) repayment option")
      andIChooseRepaymentOption("Bank transfer (Bacs)")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Application complete - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Application complete - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }
  }
}
