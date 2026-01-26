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

class AmendJourneySpec extends BaseSpec {

  Feature("Amend case Journey") {

    Scenario("A user wants to Amend a case [referenceNo=NDRC21052618650YFLZNMV2]") {
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

      And("I enter valid Application NDRC21052618650YFLZNMV2")
      andIEnterValidApplication("NDRC21052618650YFLZNMV2")

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

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Information sent - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }

    Scenario("A user wants to Amend a case to send more supporting documents [referenceNo=NDRC21052618646XZ66EBX6]") {
      Given("I am on the start page for trader service and select Amend Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter valid Application NDRC21052618646XZ66EBX6")
      andIEnterValidApplication("NDRC21052618646XZ66EBX6")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose send more supporting documents")
      andIChooseSendMoreSupportingDocuments()

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
        "I am on Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "Check your additional information - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Information sent - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }

    Scenario("A user wants to Amend a case to give further information [referenceNo=NDRC2105261863OL4K3WXR2]") {
      Given("I am on the start page for trader service and select Amend Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow()

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

      And("I choose to provide give further information")
      andIChooseToProvideGiveFurtherInformation()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

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

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on Information sent - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "Information sent - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }

    Scenario("A user tries to Amend a closed case [closedCaseReferenceNo=NDRC2107162273ZJ5CBE667]") {
      Given("I am on the start page for trader service and select Amend Now")
      givenIAmOnTheStartPageForTraderServiceAndSelectAmendNow()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "I am on What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK page"
      )
      thenIAmOnPage(
        "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I enter valid Application NDRC2107162273ZJ5CBE667")
      andIEnterValidApplication("NDRC2107162273ZJ5CBE667")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      And("I choose to provide give further information")
      andIChooseToProvideGiveFurtherInformation()

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

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

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on This application is closed - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "This application is closed - Apply for repayment of import duty and import VAT - GOV.UK"
      )

    }
  }
}
