/*
 * Copyright 2021 HM Revenue & Customs
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

object checkYourAnswersPage extends checkYourAnswersPage

class checkYourAnswersPage extends commonMethods {

  //Amend case summary list
  val RefNo = "Reference number"
  val ResType = "What do you need to do?"
  val ResToHMRC = "Additional information"
  val Docs = "Additional uploads"

  def verifyRefNo(text: String): Unit = findElementByCss("#main-content > div > div > div.govuk-\\!-margin-bottom-6 > form > dl > div:nth-child(1) > dt").getText mustEqual text
  def verifyResType(text: String): Unit = findElementByCss("#main-content > div > div > div.govuk-\\!-margin-bottom-6 > form > dl > div:nth-child(2) > dt").getText mustEqual text
  def verifyResToHMRC(text: String): Unit = findElementByCss("#main-content > div > div > div.govuk-\\!-margin-bottom-6 > form > dl > div:nth-child(3) > dt").getText mustEqual text
  def verifyDocs(text: String): Unit = findElementByCss("#main-content > div > div > div.govuk-\\!-margin-bottom-6 > form > dl > div:nth-child(4) > dt").getText mustEqual text

  def RefNoResponse: WebElement = findByXpath("//*[@id=\"main-content\"]/div/div/div[1]/form/dl/div[1]/dd[1]")
  def ResTypeResponse: WebElement = findByXpath("//*[@id=\"main-content\"]/div/div/div[1]/form/dl/div[2]/dd[1]")
  def ResToHMRCResponse: WebElement = findByXpath("//*[@id=\"main-content\"]/div/div/div[1]/form/dl/div[3]/dd[1]")
  def DocsResponse: WebElement = findByXpath("//*[@id=\"main-content\"]/div/div/div[1]/form/dl/div[4]/dd[1]")

  def clickRefNOChangeOption: Unit = clickHref("a[href*='/apply-for-repayment-of-import-duty-and-import-vat/amend-check-your-answers/change/referenceNumber']")
  def clickResTypeChangeOption: Unit = clickHref("a[href*='/apply-for-repayment-of-import-duty-and-import-vat/amend-check-your-answers/change/amendCaseResponseType']")
  def clickResToHMRCChangeOption: Unit = clickHref("a[href*='/apply-for-repayment-of-import-duty-and-import-vat/amend-check-your-answers/change/furtherInformation']")
  def clickDocsChangeOption: Unit = clickHref("a[href*='/apply-for-repayment-of-import-duty-and-import-vat/amend-check-your-answers/change/amendFileUploadPage']")

}