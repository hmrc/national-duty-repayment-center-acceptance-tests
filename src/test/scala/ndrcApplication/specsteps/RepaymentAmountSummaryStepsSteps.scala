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

import ndrcApplication.specpage.repaymentAmtSummaryPage
import ndrcApplication.specpage.repaymentAmtSummaryPage._
import ndrcApplication.specpage.customsDutyPage
import ndrcApplication.specpage.vatPage
import ndrcApplication.specpage.otherCustDutyPage

object RepaymentAmountSummaryStepsSteps {

  // ^I verify reclaim options is displayed$
  def thenIVerifyReclaimOptionsIsDisplayed(): Unit = {
    repaymentAmtSummaryPage.verifyCustomDuty(CustomDuty)
    repaymentAmtSummaryPage.verifyImportVat(ImportVat)
    repaymentAmtSummaryPage.verifyOtherDut(OtherDuty)
    repaymentAmtSummaryPage.verifyTotal(Total)
  }

  // ^I click on change option on customs duty was paid$
  def andIClickOnChangeOptionOnCustomsDutyWasPaid(): Unit =
    repaymentAmtSummaryPage.ClickCustDutyPaidChangeOption()

  // ^I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"$
  def andIClearAmountAndEnterCustomsDutyPaid(changeCustDutyPaid: String): Unit = {
    customsDutyPage.clearCustDutyPaid()
    customsDutyPage.enterCustDutyPaid(changeCustDutyPaid)
  }

  // ^I verify changed customs duty paid- CustomDuty: \"([^\"]*)\" is displayed$
  def andIVerifyChangedCustomsDutyPaidIsDisplayed(changeCDutyPaid: String): Unit =
    assertElementText(changeCDutyPaid, CustomDutyPaidResponse)

  // ^I click on change option on customs duty should have paid$
  def andIClickOnChangeOptionOnCustomsDutyShouldHavePaid(): Unit =
    repaymentAmtSummaryPage.ClickCustDutyShldHavePaidChangeOption()

  // ^I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"$
  def andIClearAmountAndEnterCustomsDutyShouldHavePaid(changeCustDutyShldHavePaid: String): Unit = {
    customsDutyPage.clearCustDutyShldHavePaid()
    customsDutyPage.enterCustDutyHaveBeenPaid(changeCustDutyShldHavePaid)
  }

  // ^I verify changed customs duty should have paid- CustomDuty: \"([^\"]*)\" is displayed$
  def andIVerifyChangedCustomsDutyShouldHavePaidIsDisplayed(changeCDutyShldHavePaid: String): Unit =
    assertElementText(changeCDutyShldHavePaid, CustomDutyShldHavePaidResponse)

  // ^I click on change option on import vat was paid$
  def andIClickOnChangeOptionOnImportVatWasPaid(): Unit =
    repaymentAmtSummaryPage.ClickImpVatPaidChangeOption()

  // ^I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"$
  def andIClearAmountAndEnterImportVatPaid(changeImpVatPaid: String): Unit = {
    vatPage.clearImpVATPaid()
    vatPage.enterVatPaid(changeImpVatPaid)
  }

  // ^I verify changed import vat paid- VatPaid: \"([^\"]*)\" is displayed$
  def andIVerifyChangedImportVatPaidIsDisplayed(changeImportVatPaid: String): Unit =
    assertElementText(changeImportVatPaid, ImportVatPaidResponse)

  // ^I click on change option on import vat should have paid$
  def andIClickOnChangeOptionOnImportVatShouldHavePaid(): Unit =
    repaymentAmtSummaryPage.ClickImpVatShldHavePaidChangeOption()

  // ^I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"$
  def andIClearAmountAndEnterImportVatBeenPaidToHMRC(changeImpVatShldHavepaid: String): Unit = {
    vatPage.clearImpVATBeenPaid()
    vatPage.enterVatBeenPaid(changeImpVatShldHavepaid)
  }

  // ^I verify changed import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\" is displayed$
  def andIVerifyChangedImportVatBeenPaidToHMRCIsDisplayed(changeIVatShldHavepaid: String): Unit =
    assertElementText(changeIVatShldHavepaid, ImportVathldHavePaidResponse)

  // ^I click on change option on other duty was paid$
  def andIClickOnChangeOptionOnOtherDutyWasPaid(): Unit =
    repaymentAmtSummaryPage.ClickOtherDutyPaidChangeOption()

  // ^I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"$
  def andIClearAmountAndEnterOtherDutyPaid(changeOtherDutyPaid: String): Unit = {
    otherCustDutyPage.clearOtherDutyPaid()
    otherCustDutyPage.enterOtherCustDutyPaid(changeOtherDutyPaid)
  }

  // ^I verify changed other duty paid- OtherDutyPaid: \"([^\"]*)\" is displayed$
  def andIVerifyChangedOtherDutyPaidIsDisplayed(changeODutyPaid: String): Unit =
    assertElementText(changeODutyPaid, OtherDutyPaidResponse)

  // ^I click on change option on other duty should have paid$
  def andIClickOnChangeOptionOnOtherDutyShouldHavePaid(): Unit =
    repaymentAmtSummaryPage.ClickOtherDutyHavePaidChangeOption()

  // ^I clear amount and enter other duty should have paid- OtherDutyBeenPaid: \"([^\"]*)\"$
  def andIClearAmountAndEnterOtherDutyShouldHavePaid(changeOtherDutyShldHavePaid: String): Unit = {
    otherCustDutyPage.clearOtherDutyBeenPaid()
    otherCustDutyPage.enterOtherCustDutyBeenPaid(changeOtherDutyShldHavePaid)
  }

}
