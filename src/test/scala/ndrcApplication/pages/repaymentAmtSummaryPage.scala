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

package ndrcApplication.pages

import org.openqa.selenium.WebElement
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper

object repaymentAmtSummaryPage extends repaymentAmtSummaryPage

class repaymentAmtSummaryPage extends commonMethods {

  // Repayment reclaim options list
  val CustomDuty = "Customs Duty"
  val ImportVat  = "VAT"
  val OtherDuty  = "Other duties"
  val Total      = "Total"

  def verifyCustomDuty(text: String): Unit       =
    findElementByCss("#main-content>div>div>div>h2:nth-child(2)").getText mustEqual text
  def verifyImportVat(text: String): Unit        =
    findElementByCss("#main-content>div>div>div>h2:nth-child(4)").getText mustEqual text
  def verifyOtherDut(text: String): Unit         =
    findElementByCss("#main-content>div>div>div>h2:nth-child(6)").getText mustEqual text
  def verifyTotal(text: String): Unit            =
    findElementByCss("#main-content>div>div>div>h2:nth-child(8)").getText mustEqual text
//custom duty
  def CustomDutyPaidResponse: WebElement         = findByXpath("//*[@id=\"main-content\"]/div/div/div/dl[1]/div[1]/dd[1]")
  def CustomDutyShldHavePaidResponse: WebElement = findByXpath(
    "//*[@id=\"main-content\"]/div/div/div/dl[1]/div[2]/dd[1]"
  )

  def ClickCustDutyPaidChangeOption(): Unit         = clickByCSS("a.customs-duty-overpayment")
  def ClickCustDutyShldHavePaidChangeOption(): Unit = clickByCSS("a.customs-duty-overpayment")
//import vat
  def ImportVatPaidResponse: WebElement             = findByXpath("//*[@id=\"main-content\"]/div/div/div/dl[2]/div[1]/dd[1]")
  def ImportVathldHavePaidResponse: WebElement      = findByXpath("//*[@id=\"main-content\"]/div/div/div/dl[2]/div[2]/dd[1]")

  def ClickImpVatPaidChangeOption(): Unit         = clickByCSS("a.change-import-vat-overpayment")
  def ClickImpVatShldHavePaidChangeOption(): Unit = clickByCSS("a.change-import-vat-overpayment")
//other duty
  def OtherDutyPaidResponse: WebElement           = findByXpath("//*[@id=\"main-content\"]/div/div/div/dl[3]/div[1]/dd[1]")
  def OtherDutyShldHavePaidResponse: WebElement   = findByXpath(
    "//*[@id=\"main-content\"]/div/div/div/dl[3]/div[2]/dd[1]"
  )

  def ClickOtherDutyPaidChangeOption(): Unit     = clickByCSS("a.other-duties-overpayment")
  def ClickOtherDutyHavePaidChangeOption(): Unit = clickByCSS("a.other-duties-overpayment")

}
