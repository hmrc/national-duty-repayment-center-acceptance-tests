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

class ReclaimSpec extends BaseSpec {

  Feature("Reclaim Dynamic content scenarios") {

    Scenario("Reclaim single entry journey help text") {
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

      And("Hint text is displayed Do not include any agent fees.")
      andHintTextIsDisplayed("Do not include any agent fees.")

      And("I enter customs Duty paid- CustomDuty: 100000.00")
      andIEnterCustomsDutyPaid("100000.00")

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 750.00")
      andIEnterCustomsDutyShouldHavePaidToHMRC("750.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("Hint text is displayed Do not include any agent fees.")
      andHintTextIsDisplayed("Do not include any agent fees.")

      And("I enter import vat paid- VatPaid: 9999999.00")
      andIEnterImportVatPaid("9999999.00")

      And("I enter import vat been Paid to HMRC- VatBeenPaid: 500.00")
      andIEnterImportVatBeenPaidToHMRC("500.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("Hint text is displayed Do not include any agent fees.")
      andHintTextIsDisplayed("Do not include any agent fees.")

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

    }

    Scenario("Reclaim multi entry journey help text") {
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

      And("Hint text is displayed Do not include any agent fees.")
      andHintTextIsDisplayed("Do not include any agent fees.")

      And("I enter customs Duty paid- CustomDuty: 100000.00")
      andIEnterCustomsDutyPaid("100000.00")

      And("I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: 750.00")
      andIEnterCustomsDutyShouldHavePaidToHMRC(
        "750.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("Hint text is displayed Do not include any agent fees.")
      andHintTextIsDisplayed("Do not include any agent fees.")

      And("I enter import vat paid- VatPaid: 9999999.00")
      andIEnterImportVatPaid("9999999.00")

      And("I enter import vat been Paid to HMRC- VatBeenPaid: 500.00")
      andIEnterImportVatBeenPaidToHMRC("500.00")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("Hint text is displayed Do not include any agent fees.")
      andHintTextIsDisplayed("Do not include any agent fees.")

      And("I enter other custom Duty paid- OtherCustDutyPaid: 1250.00")
      andIEnterOtherCustomDutyPaid("1250.00")

      And("I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: 200.00")
      andIEnterOtherCustomDutyBeenPaidToHMRC(
        "200.00"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }
  }
}
