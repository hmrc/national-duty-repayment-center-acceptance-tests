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

package ndrcApplication.specsteps

import java.time.LocalDate
import ndrcApplication.pages.aboutGoodsPage
import ndrcApplication.pages.amendCaseFurtherInfoPage
import ndrcApplication.pages.amendCaseResponseTypePage
import ndrcApplication.pages.appReasonPage
import ndrcApplication.pages.applicationNotFoundPage
import ndrcApplication.pages.articlePage._
import ndrcApplication.pages.checkYourAnswersPage
import ndrcApplication.pages.checkYourAnswersPage._
import ndrcApplication.pages.commonMethods
import ndrcApplication.pages.declarantRefNoPage
import ndrcApplication.pages.entriesPage
import ndrcApplication.pages.entryDatePage._
import ndrcApplication.pages.entryDetailsPage
import ndrcApplication.pages.eoriNoPage
import ndrcApplication.pages.feedbackFormPage
import ndrcApplication.pages.goodsOwnerPage
import ndrcApplication.pages.importerPersonalDetailsPage
import ndrcApplication.pages.importerorRepPage._
import ndrcApplication.pages.loginPage
import ndrcApplication.pages.otherCustDutyPage
import ndrcApplication.pages.reclaimPage
import ndrcApplication.pages.regulationsPage._
import ndrcApplication.pages.repaymentAmtSummaryPage
import ndrcApplication.pages.repaymentAmtSummaryPage._
import ndrcApplication.pages.selectRepayMethodPage
import ndrcApplication.pages.uploadFilePage
import ndrcApplication.pages.vatPage
import ndrcApplication.pages.vatRegPage
import ndrcApplication.pages.{amendCaseRefNoPage, commonPage, customsDutyPage}
import org.openqa.selenium.{By, NoSuchElementException}
import org.scalatest.matchers.must.Matchers.{convertToAnyMustWrapper, include}
import scala.util.Try
import uk.gov.hmrc.selenium.webdriver.Driver

object StepDefsSteps extends commonMethods {

    // ^I enter Reason for overpayment- Reason: "([^"]*)"$
    def andIEnterReasonForOverpayment(reason: String): Unit = {
      aboutGoodsPage.enterReason(reason)
    }

    // ^I enter goods details- Details: "([^"]*)"$
    def andIEnterGoodsDetails(goodsDetails: String): Unit = {
      aboutGoodsPage.enterGoodsDetails(goodsDetails)
    }

    // ^I enter further goods details- Details: \"([^\"]*)\"$
    def andIEnterFurtherGoodsDetails(furtherInfo: String): Unit = {
      amendCaseFurtherInfoPage.enterFurtherInfo(furtherInfo)
    }

    // ^I enter valid Application \"([^\"]*)\"$
    def andIEnterValidApplication(refNo: String): Unit = {
      amendCaseRefNoPage.enterRefNo(refNo)
    }

    // ^I enter Application \"([^\"]*)\" reference no with a special character$
    def andIEnterApplicationReferenceNoWithASpecialCharacter(splCharacterRefNo: String): Unit = {
      amendCaseRefNoPage.enterRefNo(splCharacterRefNo)
    }

    // ^I enter wrong format Application \"([^\"]*)\" reference No$
    def thenIEnterWrongFormatApplicationReferenceNo(wrongFormatRefNo: String): Unit = {
      amendCaseRefNoPage.enterRefNo(wrongFormatRefNo)
    }

    // ^I enter invalid length Application \"([^\"]*)\" reference number$
    def thenIEnterInvalidLengthApplicationReferenceNumber(invalidLenRefNo: String): Unit = {
      amendCaseRefNoPage.enterRefNo(invalidLenRefNo)
    }

    // ^I choose both send more supporting documents and give further information$
    def andIChooseBothSendMoreSupportingDocumentsAndGiveFurtherInformation(): Unit = {
      amendCaseResponseTypePage.selectSendMoreDocs()
          amendCaseResponseTypePage.selectGiveMoreInfo()
    }

    // ^I choose send more supporting documents$
    def andIChooseSendMoreSupportingDocuments(): Unit = {
      amendCaseResponseTypePage.selectSendMoreDocs()
    }

    // ^I choose to provide give further information$
    def andIChooseToProvideGiveFurtherInformation(): Unit = {
      amendCaseResponseTypePage.selectGiveMoreInfo()
    }

    // ^I choose an application Reason$
    def andIChooseAnApplicationReason(): Unit = {
      appReasonPage.selectCommCode()
    }

    // ^I choose multiple application Reasons$
    def andIChooseMultipleApplicationReasons(): Unit = {
      appReasonPage.selectCommCode()
          appReasonPage.selectPreference()
    }

    // ^I click on enter the application number again$
    def whenIClickOnEnterTheApplicationNumberAgain(): Unit = {
      applicationNotFoundPage.clickEnterRefNoAgain()
    }

    // ^I choose an article Type$
    def andIChooseAnArticleType(): Unit = {
      selectVatArticle()
    }

    // ^I verify correct data items is displayed$
    def thenIVerifyCorrectDataItemsIsDisplayed(): Unit = {
      checkYourAnswersPage.verifyRefNo(RefNo)
      checkYourAnswersPage.verifyResType(ResType)
      checkYourAnswersPage.verifyResToHMRC(ResToHMRC)
      checkYourAnswersPage.verifyDocs(Docs)
    }

    // ^I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$
    def thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(refNo: String, resType: String, resHMRC: String, docsCount: String): Unit = {
      assertElementText(refNo, RefNoResponse)
          assertElementText(resType, ResTypeResponse)
          assertElementText(resHMRC, ResToHMRCResponse)
          assertElementText(docsCount, DocsResponse)
    }

    // ^I click on change option on the amend review page for reference no$
    def whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo(): Unit = {
      checkYourAnswersPage.clickRefNOChangeOption()
    }

    // ^I click on change option on the amend review page for response type$
    def whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType(): Unit = {
      checkYourAnswersPage.clickResTypeChangeOption()
    }

    // ^I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$
    def thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(refNo: String, resType: String, resHMRC: String): Unit = {
      println("My input is " + resHMRC + " and response is " + ResToHMRCResponse.getText + "'")
      assertElementText(refNo, RefNoResponse)
            assertElementText(resType, ResTypeResponse)
            assertElementText(resHMRC, ResToHMRCResponse)
    }
    // ^I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$
    def thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourneyMultiple(refNo: String, resType: String, documents: String*): Unit = {
      assertElementText(refNo, RefNoResponse)
            assertElementText(resType, ResTypeResponse)
            val expectedDocs = documents.mkString(", ")
            assertElementText(expectedDocs, ResToHMRCResponse)
    }
    

    // ^I click on change option on the amend review page for documents uploaded$
    def whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded(): Unit = {
      checkYourAnswersPage.clickDocsChangeOption()
    }

    // ^I click on change option on the review page for total return amount$
    def whenIClickOnChangeOptionOnTheReviewPageForTotalReturnAmount(): Unit = {
      checkYourAnswersPage.clickTotalReturnAmountChangeOption()
    }

    // ^I click on change option on the review page for entry details
    def whenIClickOnChangeOptionOnTheReviewPageForEntryDetails(): Unit = {
      checkYourAnswersPage.clickEntryDetailsChangeOption()
    }

    // ^I am on "([^"]*)" page$
    def thenIAmOnPage(pageTitle: String): Unit = {
      assert(commonPage.isPageTitleDisplayed(pageTitle))
    }

    // ^I click on the "([^"]*)" button$
    def whenIClickOnTheXButton(continue: String): Unit = {
      commonPage.clickGenericButton()
    }

    // ^I click the (.*) link$
    def andIClickTheXLink(): Unit = {
      link: String =>
          commonPage.click(link)
    }

    // ^An error message is displayed- Error: \"([^\"]*)\"$
    def thenAnErrorMessageIsDisplayed(errorMsg: String): Unit = {
      amendCaseRefNoPage.errMsg()
    }

    // ^I clear the reference no field$
    def thenIClearTheReferenceNoField(): Unit = {
      amendCaseRefNoPage.clearRefNo()
    }

    // ^Hint text is displayed \"([^\"]*)\"$
    def andHintTextIsDisplayed(hintText: String): Unit = {
      customsDutyPage.hintText mustBe hintText
    }

    // ^I Accept cookies and hide message$
    def thenIAcceptCookiesAndHideMessage(): Unit = {
      commonPage.acceptCookies()
          commonPage.hideCookiesMsg()
    }

    // ^I enter customs Duty paid- CustomDuty: "([^"]*)"$
    def andIEnterCustomsDutyPaid(custDutyPaid: String): Unit = {
      customsDutyPage.enterCustDutyPaid(custDutyPaid)
    }

    // ^I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "([^"]*)"$
    def andIEnterCustomsDutyShouldHavePaidToHMRC(custDutyBeenPaid: String): Unit = {
      customsDutyPage.enterCustDutyHaveBeenPaid(custDutyBeenPaid)
    }

    // ^I choose \"([^\"]*)\" options$
    def andIChooseOptions(yOrNDRN: String): Unit = {
      yOrNDRN match {
            case "Yes" => clickByCSS("#value")
            case "No"  => clickByCSS("#value-2")
          }
    }

    // ^I enter to create \"([^\"]*)\"$
    def andIEnterToCreate(decRefNo: String): Unit = {
      declarantRefNoPage.enterDRN(decRefNo)
    }

    // ^I choose one entry$
    def andIChooseOneEntry(): Unit = {
      entriesPage.selectOneEntry()
    }

    // ^I choose multi entry$
    def andIChooseMultiEntry(): Unit = {
      entriesPage.selectMultiEntry()
    }

    // ^I enter \"([^\"]*)\" value$
    def andIEnterValue(noOfEntries: String): Unit = {
      entriesPage.enterNoOfEntries(noOfEntries)
    }

    // ^I choose a date Range on or before Dec$
    def andIChooseADateRangeOnOrBeforeDec(): Unit = {
      selectOnORBeforeDecDate()
    }

    // ^I choose a date Range from Jan this year$
    def andIChooseADateRangeFromJanThisYear(): Unit = {
      selectJanDate()
    }

    // ^I enter declaration details- EPU: "([^"]*)" and Entry No: "([^"]*)"$
    def andIEnterDeclarationDetails(epu: String, entryNo: String): Unit = {
      entryDetailsPage.enterEPU(epu)
          entryDetailsPage.enterEntryNo(entryNo)
    }

    // ^I enter an entry date that was ([^"]*) days ago$
    def andIEnterAnEntryDateThatWasXDaysAgo(numberOfDays: String): Unit = {
      val entryDate = LocalDate.now().minusDays(Try(numberOfDays.toLong).getOrElse(0L))
          entryDetailsPage.enterDay(entryDate.getDayOfMonth.toString)
          entryDetailsPage.enterMonth(entryDate.getMonthValue.toString)
          entryDetailsPage.enterYear(entryDate.getYear.toString)
    }

    // ^I enter an entry date of (.*)/(.*)/(.*)$
    def andIEnterAnEntryDateOfX(day: String, month: String, year: String): Unit = {
      entryDetailsPage.enterDay(day)
          entryDetailsPage.enterMonth(month)
          entryDetailsPage.enterYear(year)
    }

    // ^I choose eori "([^"]*)" option$
    def andIChooseEori(yOrNEori: String): Unit = {
      yOrNEori match {
            case "Yes" => clickByCSS("#value")
            case "No"  => clickByCSS("#value-no")
          }
    }

    // ^I enter \"([^\"]*)\" in correct format GB$
    def andIEnterXInCorrectFormatGB(eoriNO: String): Unit = {
      eoriNoPage.enterEoriNo(eoriNO)
    }

    // ^I choose \"([^\"]*)\" for you able to do what you needed to do today$
    def andIChooseXForYouAbleToDoWhatYouNeededToDoToday(yOrN: String): Unit = {
      yOrN match {
            case "Yes" => clickByCSS("#ableToDo-yes")
            case "No"  => clickByCSS("#ableToDo-no")
          }
    }

    // ^I choose rating for was it for you to do what you needed to do today$
    def andIChooseRatingForWasItForYouToDoWhatYouNeededToDoToday(): Unit = {
      feedbackFormPage.selectEasy()
    }

    // ^I enter \"([^\"]*)\" of the service$
    def andIEnterXOfTheService(score: String): Unit = {
      feedbackFormPage.enterScoreDetails(score)
    }

    // ^I choose overallRating for the overall service$
    def andIChooseOverallRatingForTheOverallService(): Unit = {
      feedbackFormPage.selectVerySatisfied()
    }

    // ^I click on the \"([^\"]*)\" button on feedback form$
    def whenIClickOnTheXButtonOnFeedbackForm(buttonName: String): Unit = {
      feedbackFormPage.clickOnFeedBackContinue()
    }

    // ^I click the file continue button$
    def whenIClickTheFileContinueButton(): Unit = {
      Driver.instance.findElement(By.id("ndrc-fileupload-continue")).click()
    }

    // ^I click on the file upload continue button$
    def whenIClickOnTheFileUploadContinueButton(): Unit = {
      waitForVisible(By.id("ndrc-fileupload-continue"))
          Driver.instance.findElement(By.id("ndrc-fileupload-continue")).click()
    }

    // ^I wait for the file to be uploaded
    def andIWaitForTheFileToBeUploaded(): Unit = {
      waitForFileToBeUploaded
    }

    // ^I should see first uploaded doc "([^"]*)" on upload review page$
    def thenIShouldSeeFirstUploadedDocOnUploadReviewPage(fileName: String): Unit = {
      findElementByCss("div.govuk-summary-list__row:nth-child(1) > dd:nth-child(1)").isDisplayed
    }

    // ^I should see ([^"]*) uploaded doc "([^"]*)" on upload page$
    def thenIShouldSeeUploadedDocOnUploadPage(sequence: String, fileName: String): Unit = {
      val index = sequence match {
            case "first"  => "1"
            case "second" => "2"
          }
          findElementByCss(s"div.govuk-summary-list__row:nth-child($index)").isDisplayed
          findElementByCss(s"div.govuk-summary-list__row:nth-child($index) > dt").getText mustBe fileName
    }

    // ^I select "([^"]*)" to uploading another file$
    def thenISelectXToUploadingAnotherFile(yORNoUploadFile: String): Unit = {
      yORNoUploadFile match {
            case "Yes" => clickByCSS("#uploadAnotherFile")
            case "No"  => clickByCSS("#uploadAnotherFile-2")
  
          }
    }

    // ^I should see second uploaded doc "([^"]*)" on upload review page$
    def thenIShouldSeeSecondUploadedDocOnUploadReviewPage(secondFileName: String): Unit = {
      findElementByCss("div.govuk-summary-list__row:nth-child(2) > dd:nth-child(1)").isDisplayed
    }

    def waitForFileToBeUploaded: Boolean =
      try {
        waitForVisible(By.id("ndrc-fileupload-continue"))
        true
      } catch {
        case _: NoSuchElementException => false
      }

    // ^I choose \"([^\"]*)\" option to confirm owner of the goods$
    def andIChooseOptionToConfirmOwnerOfTheGoods(yOrNgoodsOwner: String): Unit = {
      yOrNgoodsOwner match {
            case "Yes" => clickByCSS("#value")
            case "No"  => clickByCSS("#value-2")
          }
    }

    // ^I enter \"([^\"]*)\" name$
    def andIEnterName(goodsOwnerName: String): Unit = {
      goodsOwnerPage.entergoodsOwnerName(goodsOwnerName)
    }

    // ^I enter first \"([^\"]*)\" and last \"([^\"]*)\"$
    def andIEnterFirstAndLastName(fName: String, lName: String): Unit = {
      importerPersonalDetailsPage.enterFName(fName)
          importerPersonalDetailsPage.enterLName(lName)
    }

    // ^I enter \"([^\"]*)\" name in rep journey$
    def andIEnterImpNameInRepJourney(impName: String): Unit = {
      importerPersonalDetailsPage.enterImpName(impName)
    }

    // ^I enter your \"([^\"]*)\" and business \"([^\"]*)\"$
    def andIEnterYourNameAndBusinessName(yourName: String, businessName: String): Unit = {
      importerPersonalDetailsPage.enterYourName(yourName)
          importerPersonalDetailsPage.enterBusinessName(businessName)
    }

    // ^I select \"([^\"]*)\" option$
    def andISelectOption(option: String): Unit = {
      importerPersonalDetailsPage.enterAddManuallyLink()
    }

    // ^I enter address manually Address Line: \"([^\"]*)\", City: \"([^\"]*)\" and PostCode: \"([^\"]*)\"$
    def andIEnterAddressManuallyAddressLine(addLine: String, city: String, postCode: String): Unit = {
      importerPersonalDetailsPage.enterAddLine1(addLine)
            importerPersonalDetailsPage.enterCity(city)
            importerPersonalDetailsPage.enterPostCode(postCode)
    }

    // ^I select email option$
    def andISelectEmailOption(): Unit = {
      importerPersonalDetailsPage.selectEmailOption()
    }

    // ^I enter \"([^\"]*)\"$
    def andIEnterEmail(email: String): Unit = {
      importerPersonalDetailsPage.enterEmail(email)
    }

    // ^I enter country \"([^\"]*)\"$
    def andIEnterCountry(country: String): Unit = {
      importerPersonalDetailsPage.enterCountry(country)
    }

    // ^I select phone no option$
    def andISelectPhoneNoOption(): Unit = {
      importerPersonalDetailsPage.selectPhoneOption()
    }

    // ^I enter \"([^\"]*)\" importers$
    def andIEnterPhoneNo(phoneNo: String): Unit = {
      importerPersonalDetailsPage.enterPhoneNo(phoneNo)
    }

    // ^I choose Importer claimant type$
    def andIChooseImporterClaimantType(): Unit = {
      selectImporter()
    }

    // ^I choose Representative claimant type$
    def andIChooseRepresentativeClaimantType(): Unit = {
      selectRepresentative()
    }

    // ^I am on the start page for trader service and select Apply Now$
    def givenIAmOnTheStartPageForTraderServiceAndSelectApplyNow(): Unit = {
      commonPage.loginNDRCViaAuthStub()
          loginPage.selectStart()
    }

    // ^I am on the start page for trader service and select Amend Now$
    def givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow(): Unit = {
      commonPage.loginNDRCViaAuthStub()
          loginPage.selectAmend()
    }

    // ^I enter other custom Duty paid- OtherCustDutyPaid: "([^"]*)"$
    def andIEnterOtherCustomDutyPaid(otherCustDutyPaid: String): Unit = {
      otherCustDutyPage.enterOtherCustDutyPaid(otherCustDutyPaid)
    }

    // ^I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "([^"]*)"$
    def andIEnterOtherCustomDutyBeenPaidToHMRC(otherCustDutyBeenPaid: String): Unit = {
      otherCustDutyPage.enterOtherCustDutyBeenPaid(otherCustDutyBeenPaid)
    }

    // ^I choose customsDuty importVAT anotherTypeofDuty options$
    def andIChooseCustomsDutyImportVATAnotherTypeofDutyOptions(): Unit = {
      reclaimPage.selectCustDuty()
          reclaimPage.selectImpVat()
          reclaimPage.selectOtherDuty()
    }

    // ^I choose the Customs Duty option$
    def andIChooseTheCustomsDutyOption(): Unit = {
      reclaimPage.selectCustDuty()
    }

    // ^I choose a regulation repayment Type$
    def andIChooseARegulationRepaymentType(): Unit = {
      selectErrorByCust()
    }

    // ^I verify reclaim options is displayed$
    def thenIVerifyReclaimOptionsIsDisplayed(): Unit = {
      repaymentAmtSummaryPage.verifyCustomDuty(CustomDuty)
          repaymentAmtSummaryPage.verifyImportVat(ImportVat)
          repaymentAmtSummaryPage.verifyOtherDut(OtherDuty)
          repaymentAmtSummaryPage.verifyTotal(Total)
    }

    // ^I click on change option on customs duty was paid$
    def andIClickOnChangeOptionOnCustomsDutyWasPaid(): Unit = {
      repaymentAmtSummaryPage.ClickCustDutyPaidChangeOption()
    }

    // ^I clear amount and enter customs Duty paid- CustomDuty: \"([^\"]*)\"$
    def andIClearAmountAndEnterCustomsDutyPaid(changeCustDutyPaid: String): Unit = {
      customsDutyPage.clearCustDutyPaid()
          customsDutyPage.enterCustDutyPaid(changeCustDutyPaid)
    }

    // ^I verify changed customs duty paid- CustomDuty: \"([^\"]*)\" is displayed$
    def andIVerifyChangedCustomsDutyPaidIsDisplayed(changeCDutyPaid: String): Unit = {
      assertElementText(changeCDutyPaid, CustomDutyPaidResponse)
    }

    // ^I click on change option on customs duty should have paid$
    def andIClickOnChangeOptionOnCustomsDutyShouldHavePaid(): Unit = {
      repaymentAmtSummaryPage.ClickCustDutyShldHavePaidChangeOption()
    }

    // ^I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: \"([^\"]*)\"$
    def andIClearAmountAndEnterCustomsDutyShouldHavePaid(changeCustDutyShldHavePaid: String): Unit = {
      customsDutyPage.clearCustDutyShldHavePaid()
            customsDutyPage.enterCustDutyHaveBeenPaid(changeCustDutyShldHavePaid)
    }

    // ^I verify changed customs duty should have paid- CustomDuty: \"([^\"]*)\" is displayed$
    def andIVerifyChangedCustomsDutyShouldHavePaidIsDisplayed(changeCDutyShldHavePaid: String): Unit = {
      assertElementText(changeCDutyShldHavePaid, CustomDutyShldHavePaidResponse)
    }

    // ^I click on change option on import vat was paid$
    def andIClickOnChangeOptionOnImportVatWasPaid(): Unit = {
      repaymentAmtSummaryPage.ClickImpVatPaidChangeOption()
    }

    // ^I clear amount and enter import vat paid- VatPaid: \"([^\"]*)\"$
    def andIClearAmountAndEnterImportVatPaid(changeImpVatPaid: String): Unit = {
      vatPage.clearImpVATPaid()
          vatPage.enterVatPaid(changeImpVatPaid)
    }

    // ^I verify changed import vat paid- VatPaid: \"([^\"]*)\" is displayed$
    def andIVerifyChangedImportVatPaidIsDisplayed(changeImportVatPaid: String): Unit = {
      assertElementText(changeImportVatPaid, ImportVatPaidResponse)
    }

    // ^I click on change option on import vat should have paid$
    def andIClickOnChangeOptionOnImportVatShouldHavePaid(): Unit = {
      repaymentAmtSummaryPage.ClickImpVatShldHavePaidChangeOption()
    }

    // ^I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\"$
    def andIClearAmountAndEnterImportVatBeenPaidToHMRC(changeImpVatShldHavepaid: String): Unit = {
      vatPage.clearImpVATBeenPaid()
            vatPage.enterVatBeenPaid(changeImpVatShldHavepaid)
    }

    // ^I verify changed import vat been Paid to HMRC- VatBeenPaid: \"([^\"]*)\" is displayed$
    def andIVerifyChangedImportVatBeenPaidToHMRCIsDisplayed(changeIVatShldHavepaid: String): Unit = {
      assertElementText(changeIVatShldHavepaid, ImportVathldHavePaidResponse)
    }

    // ^I click on change option on other duty was paid$
    def andIClickOnChangeOptionOnOtherDutyWasPaid(): Unit = {
      repaymentAmtSummaryPage.ClickOtherDutyPaidChangeOption()
    }

    // ^I clear amount and enter other duty paid- OtherDutyPaid: \"([^\"]*)\"$
    def andIClearAmountAndEnterOtherDutyPaid(changeOtherDutyPaid: String): Unit = {
      otherCustDutyPage.clearOtherDutyPaid()
          otherCustDutyPage.enterOtherCustDutyPaid(changeOtherDutyPaid)
    }

    // ^I verify changed other duty paid- OtherDutyPaid: \"([^\"]*)\" is displayed$
    def andIVerifyChangedOtherDutyPaidIsDisplayed(changeODutyPaid: String): Unit = {
      assertElementText(changeODutyPaid, OtherDutyPaidResponse)
    }

    // ^I click on change option on other duty should have paid$
    def andIClickOnChangeOptionOnOtherDutyShouldHavePaid(): Unit = {
      repaymentAmtSummaryPage.ClickOtherDutyHavePaidChangeOption()
    }

    // ^I clear amount and enter other duty should have paid- OtherDutyBeenPaid: \"([^\"]*)\"$
    def andIClearAmountAndEnterOtherDutyShouldHavePaid(changeOtherDutyShldHavePaid: String): Unit = {
      otherCustDutyPage.clearOtherDutyBeenPaid()
            otherCustDutyPage.enterOtherCustDutyBeenPaid(changeOtherDutyShldHavePaid)
    }

    // ^I click on Choose file button and add the "([^"]*)" file$
    def whenIClickOnChooseFileButtonAndAddTheXFile(fileSeq: String): Unit = {
      uploadFilePage.uploadFile(fileSeq)
    }

    // ^I see an error message \"([^\"]*)\"$
    def thenISeeAnErrorMessageX(errorMsg: String): Unit = {
      findElementByCss("ul.govuk-error-summary__list").isDisplayed mustBe true
          findElementByCss("ul.govuk-error-summary__list").getText must include(errorMsg)
    }

    // ^I choose "([^"]*)" option$
    def andIChooseOption(yOrNVat: String): Unit = {
      yOrNVat match {
            case "Yes" => clickByCSS("#value")
            case "No"  => clickByCSS("#value-2")
          }
    }

    // ^I click on Help VAT registration link$
    def andIClickOnHelpVATRegistrationLink(): Unit = {
      vatRegPage.vatRegHyperlink()
    }

    // ^I confirm VAT registration is displayed: \"([^\"]*)\"$
    def andIConfirmVATRegistrationIsDisplayed(vatRegText: String): Unit = {
      vatRegPage.vatRegText()
    }

    // ^I enter import vat paid- VatPaid: "([^"]*)"$
    def andIEnterImportVatPaid(vatPaid: String): Unit = {
      vatPage.enterVatPaid(vatPaid)
    }

    // ^I enter import vat been Paid to HMRC- VatBeenPaid: "([^"]*)"$
    def andIEnterImportVatBeenPaidToHMRC(vatBeenPaid: String): Unit = {
      vatPage.enterVatBeenPaid(vatBeenPaid)
    }

    // ^I choose \"([^\"]*)\" repayment option$
    def andIChooseRepaymentOption(repayment: String): Unit = {
      repayment match {
            case "Bank transfer (Bacs)"          => clickByCSS("#value")
            case "Current month amendment (CMA)" => clickByCSS("#value-2")
          }
    }

    // ^I enter account \"([^\"]*)\" and sortcode \"([^\"]*)\" and account number \"([^\"]*)\"$
    def andIEnterAccountAndSortcodeAndAccountNumber(accName: String, sortCode: String, accNo: String): Unit = {
      selectRepayMethodPage.enterAccName(accName)
            selectRepayMethodPage.enterSortCode(sortCode)
            selectRepayMethodPage.enterAccNo(accNo)
    }

    // ^I choose Representative option$
    def andIChooseRepresentativeOption(): Unit = {
      selectRepresentative()
    }

    // ^I choose Importer option$
    def andIChooseImporterOption(): Unit = {
      selectImporter()
    }

    // ^I choose \"([^\"]*)\" indirect representative option$
    def andIChooseXIndirectRepresentativeOption(yORNIndirectRep: String): Unit = {
      yORNIndirectRep match {
            case "Yes" => clickByCSS("#value")
            case "No"  => clickByCSS("#value-no")
          }
    }

}
