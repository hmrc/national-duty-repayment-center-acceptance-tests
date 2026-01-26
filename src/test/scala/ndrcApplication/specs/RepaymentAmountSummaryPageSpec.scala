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

      And("I choose customsDuty importVAT anotherTypeofDuty options")
      andIChooseCustomsDutyImportVATAnotherTypeofDutyOptions()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter customs Duty paid- CustomDuty: 1000.00")
      andIEnterCustomsDutyPaid("1000.00")

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 750.00")
      andIEnterCustomsDutyShouldHavePaidToHMRC("750.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter import vat paid- VatPaid: 1500.00")
      andIEnterImportVatPaid("1500.00")

      And("I enter import vat been Paid to HMRC- VatBeenPaid: 500.00")
      andIEnterImportVatBeenPaidToHMRC("500.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter other custom Duty paid- OtherCustDutyPaid: 1250.00")
      andIEnterOtherCustomDutyPaid("1250.00")

      And("I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: 200.00")
      andIEnterOtherCustomDutyBeenPaidToHMRC("200.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then("I verify reclaim options is displayed")
      thenIVerifyReclaimOptionsIsDisplayed()

      And("I click on change option on customs duty was paid")
      andIClickOnChangeOptionOnCustomsDutyWasPaid()

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I clear amount and enter customs Duty paid- CustomDuty: 7000.00")
      andIEnterCustomsDutyPaid("7000.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I verify changed customs duty paid- CustomDuty: £7000.00 is displayed")
      andIVerifyChangedCustomsDutyPaidIsDisplayed(
        "£7000.00"
      )

      And("I click on change option on customs duty should have paid")
      andIClickOnChangeOptionOnCustomsDutyShouldHavePaid()

      Then("I am on Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: 3300.00")
      andIClearAmountAndEnterCustomsDutyShouldHavePaid(
        "3300.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I verify changed customs duty should have paid- CustomDuty: £3300.00 is displayed")
      andIVerifyChangedCustomsDutyShouldHavePaidIsDisplayed(
        "£3300.00"
      )

      And("I click on change option on import vat was paid")
      andIClickOnChangeOptionOnImportVatWasPaid()

      Then("I am on VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I clear amount and enter import vat paid- VatPaid: 9000.00")
      andIClearAmountAndEnterImportVatPaid(
        "9000.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I verify changed import vat paid- VatPaid: £9000.00 is displayed")
      andIVerifyChangedImportVatPaidIsDisplayed(
        "£9000.00"
      )

      And("I click on change option on import vat should have paid")
      andIClickOnChangeOptionOnImportVatShouldHavePaid()

      Then("I am on VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: 4000.00")
      andIClearAmountAndEnterImportVatBeenPaidToHMRC(
        "4000.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I verify changed import vat been Paid to HMRC- VatBeenPaid: £4000.00 is displayed")
      andIVerifyChangedImportVatBeenPaidToHMRCIsDisplayed(
        "£4000.00"
      )

      And("I click on change option on other duty was paid")
      andIClickOnChangeOptionOnOtherDutyWasPaid()

      Then("I am on Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I clear amount and enter other duty paid- OtherDutyPaid: 100000.00")
      andIClearAmountAndEnterOtherDutyPaid(
        "100000.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I verify changed other duty paid- OtherDutyPaid: £100000.00 is displayed")
      andIVerifyChangedOtherDutyPaidIsDisplayed(
        "£100000.00"
      )

      And("I click on change option on other duty should have paid")
      andIClickOnChangeOptionOnOtherDutyShouldHavePaid()

      Then("I am on Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I clear amount and enter other duty should have paid- OtherDutyBeenPaid: 2000.00")
      andIClearAmountAndEnterOtherDutyShouldHavePaid(
        "2000.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage("Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK")

      And("I verify changed other duty paid- OtherDutyBeenPaid: £2000.00 is displayed")
      andIVerifyChangedOtherDutyShouldHavePaidIsDisplayed(
        "£2000.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

    }
  }
}
