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

class AmendCYAPageSpec extends BaseSpec {

  Feature("Amend case CYA Page") {

    Scenario(
      "A user wants to change an answer via the CYA page - Amend case [referenceNo=NDRC2105261863OL4K3WXR2, responseType=Send additional Documents and Information, responseToHMRC=Shoes Jeans Jackets, docsUploaded=JPEGImage.jpg, referenceNoDoesNotExist=NDRC21052618646XZ66E666, changeResType=Send additional Information, changeRespType=Send additional Documents, changeDocsUploaded=JPEGImage.jpg\nVA Plan v0.3.xlsx]"
    ) {
      Given("I am on the start page for trader service and select Amend Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow()

      Then("I Accept cookies and hide message")
      thenIAcceptCookiesAndHideMessage()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter valid Application NDRC2105261863OL4K3WXR2")
      andIEnterValidApplication("NDRC2105261863OL4K3WXR2")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose both send more supporting documents and give further information")
      andIChooseBothSendMoreSupportingDocumentsAndGiveFurtherInformation()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK"
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
        "I am on Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter further goods details- Details: Shoes Jeans Jackets")
      andIEnterFurtherGoodsDetails(
        "Shoes Jeans Jackets"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then("I verify correct data items is displayed")
      thenIVerifyCorrectDataItemsIsDisplayed()

      Then(
        "I verify correct responses is displayed for Amend case journey NDRC2105261863OL4K3WXR2, Send additional Documents and Information, Shoes Jeans Jackets and JPEGImage.jpg"
      )

      thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(
        "NDRC2105261863OL4K3WXR2",
        "Send additional Documents and Information",
        "Shoes Jeans Jackets",
        "JPEGImage.jpg"
      )

      When("I click on change option on the amend review page for reference no")
      whenIClickOnChangeOptionOnTheAmendReviewPageForReferenceNo()

      Then(
        "I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then("I clear the reference no field")
      thenIClearTheReferenceNoField()

      And("I enter valid Application NDRC21052618646XZ66E666")
      andIEnterValidApplication("NDRC21052618646XZ66E666")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then(
        "I verify correct responses is displayed for Amend case journey NDRC21052618646XZ66E666, Send additional Documents and Information, Shoes Jeans Jackets and JPEGImage.jpg"
      )
      thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(
        "NDRC21052618646XZ66E666",
        "Send additional Documents and Information",
        "Shoes Jeans Jackets",
        "JPEGImage.jpg"
      )

      When("I click on change option on the amend review page for response type")
      whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType()

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose send more supporting documents")
      andIChooseSendMoreSupportingDocuments()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then(
        "I verify correct responses is displayed for Amend case journey NDRC21052618646XZ66E666, Send additional Information, Shoes Jeans Jackets"
      )
      thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(
        "NDRC21052618646XZ66E666",
        "Send additional Information",
        "Shoes Jeans Jackets"
      )

      When("I click on change option on the amend review page for response type")
      whenIClickOnChangeOptionOnTheAmendReviewPageForResponseType()

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose both send more supporting documents and give further information")
      andIChooseBothSendMoreSupportingDocumentsAndGiveFurtherInformation()

      When("I click on the Continue button")
      whenIClickOnTheXButton("Continue")

      Then("I am on Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK"
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
        "I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then(
        "I verify correct responses is displayed for Amend case journey NDRC21052618646XZ66E666, Send additional Documents, JPEGImage.jpg"
      )
      thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(
        "NDRC21052618646XZ66E666",
        "Send additional Documents",
        "JPEGImage.jpg"
      )

      When("I click on change option on the amend review page for documents uploaded")
      whenIClickOnChangeOptionOnTheAmendReviewPageForDocumentsUploaded()

      Then("I am on Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on Choose file button and add the second file")
      whenIClickOnChooseFileButtonAndAddTheXFile("second")

      And("I wait for the file to be uploaded")
      andIWaitForTheFileToBeUploaded()

      Then("I should see second uploaded doc VA Plan v0.3.xlsx on upload page")
      thenIShouldSeeUploadedDocOnUploadPage(
        "second",
        "VA Plan v0.3.xlsx"
      )

      When("I click the file continue button")
      whenIClickTheFileContinueButton()

      Then(
        "I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then(
        "I verify correct responses is displayed for Amend case journey NDRC21052618646XZ66E666, Send additional Documents, JPEGImage.jpgn VA Plan v0.3.xlsx"
      )
      thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(
        "NDRC21052618646XZ66E666",
        "Send additional Documents",
        "JPEGImage.jpg\nVA Plan v0.3.xlsx"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Application not found - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Application not found - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on enter the application number again")
      whenIClickOnEnterTheApplicationNumberAgain()

      Then(
        "I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then("I clear the reference no field")
      thenIClearTheReferenceNoField()

      And("I enter valid Application NDRC2105261863OL4K3WXR2")
      andIEnterValidApplication("NDRC2105261863OL4K3WXR2")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      Then(
        "I verify correct responses is displayed for Amend case journey NDRC2105261863OL4K3WXR2, Send additional Documents, JPEGImage.jpg, VA Plan v0.3.xlsx"
      )
      thenIVerifyCorrectResponsesIsDisplayedForAmendCaseJourney(
        "NDRC2105261863OL4K3WXR2",
        "Send additional Documents",
        "JPEGImage.jpg\nVA Plan v0.3.xlsx"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Information sent - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }
  }
}
