/*
 * Copyright 2023 HM Revenue & Customs
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

package ndrcApplication.stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import ndrcApplication.pages.repaymentAmtSummaryPage
import ndrcApplication.pages.customsDutyPage
import ndrcApplication.pages.vatPage
import ndrcApplication.pages.otherCustDutyPage

class RepaymentAmountSummarySteps extends repaymentAmtSummaryPage with ScalaDsl with EN {

  Then("^I verify reclaim options is displayed$") { () =>
    repaymentAmtSummaryPage.verifyCustomDuty(CustomDuty)
    repaymentAmtSummaryPage.verifyImportVat(ImportVat)
    repaymentAmtSummaryPage.verifyOtherDut(OtherDuty)
    repaymentAmtSummaryPage.verifyTotal(Total)
  }

  And("^I click on change option on customs duty was paid$") { () =>
    repaymentAmtSummaryPage.ClickCustDutyPaidChangeOption()
  }

  And("^I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"$") { (changeCustDutyPaid: String) =>
    customsDutyPage.clearCustDutyPaid()
    customsDutyPage.enterCustDutyPaid(changeCustDutyPaid)
  }

  And("^I verify changed customs duty paid- CustomDuty: \"([^\"]*)\" is displayed$") { (changeCDutyPaid: String) =>
    assertElementText(changeCDutyPaid, CustomDutyPaidResponse)
  }

  And("^I click on change option on customs duty should have paid$") { () =>
    repaymentAmtSummaryPage.ClickCustDutyShldHavePaidChangeOption()
  }

  And("^I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"$") {
    (changeCustDutyShldHavePaid: String) =>
      customsDutyPage.clearCustDutyShldHavePaid()
      customsDutyPage.enterCustDutyHaveBeenPaid(changeCustDutyShldHavePaid)
  }

  And("^I verify changed customs duty should have paid- CustomDuty: \"([^\"]*)\" is displayed$") {
    (changeCDutyShldHavePaid: String) =>
      assertElementText(changeCDutyShldHavePaid, CustomDutyShldHavePaidResponse)
  }

  And("^I click on change option on import vat was paid$") { () =>
    repaymentAmtSummaryPage.ClickImpVatPaidChangeOption()
  }

  And("^I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"$") { (changeImpVatPaid: String) =>
    vatPage.clearImpVATPaid()
    vatPage.enterVatPaid(changeImpVatPaid)
  }

  And("^I verify changed import vat paid- VatPaid: \"([^\"]*)\" is displayed$") { (changeImportVatPaid: String) =>
    assertElementText(changeImportVatPaid, ImportVatPaidResponse)
  }

  And("^I click on change option on import vat should have paid$") { () =>
    repaymentAmtSummaryPage.ClickImpVatShldHavePaidChangeOption()
  }

  And("^I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"$") {
    (changeImpVatShldHavepaid: String) =>
      vatPage.clearImpVATBeenPaid()
      vatPage.enterVatBeenPaid(changeImpVatShldHavepaid)
  }

  And("^I verify changed import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\" is displayed$") {
    (changeIVatShldHavepaid: String) =>
      assertElementText(changeIVatShldHavepaid, ImportVathldHavePaidResponse)
  }

  And("^I click on change option on other duty was paid$") { () =>
    repaymentAmtSummaryPage.ClickOtherDutyPaidChangeOption()
  }

  And("^I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"$") { (changeOtherDutyPaid: String) =>
    otherCustDutyPage.clearOtherDutyPaid()
    otherCustDutyPage.enterOtherCustDutyPaid(changeOtherDutyPaid)
  }

  And("^I verify changed other duty paid- OtherDutyPaid: \"([^\"]*)\" is displayed$") { (changeODutyPaid: String) =>
    assertElementText(changeODutyPaid, OtherDutyPaidResponse)
  }

  And("^I click on change option on other duty should have paid$") { () =>
    repaymentAmtSummaryPage.ClickOtherDutyHavePaidChangeOption()
  }

  And("^I clear amount and enter other duty should have paid- OtherDutyBeenPaid: \"([^\"]*)\"$") {
    (changeOtherDutyShldHavePaid: String) =>
      otherCustDutyPage.clearOtherDutyBeenPaid()
      otherCustDutyPage.enterOtherCustDutyBeenPaid(changeOtherDutyShldHavePaid)
  }

  And("^I verify changed other duty paid- OtherDutyBeenPaid: \"([^\"]*)\" is displayed$") {
    (changeODutyShldHavePaid: String) =>
      assertElementText(changeODutyShldHavePaid, OtherDutyShldHavePaidResponse)
  }

}
