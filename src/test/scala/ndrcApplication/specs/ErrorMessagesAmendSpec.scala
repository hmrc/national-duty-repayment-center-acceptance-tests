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

class ErrorMessagesAmendSpec extends BaseSpec {

  Feature("Error Scenarios Amend case Journey") {

    Scenario(
      "Error messages for Amend case journey scenarios [referenceNo=NDRC2105261863OL4K3WXR2, splCharacterRefNo=NDRC2103151135EE6L6YKH3&*, wrongFormatRefNo=103151135EE6L6YKH, invalidLenRefNo=NDRC2103151135EE6L6]"
    ) {
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

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("An error message is displayed- Error: Enter the reference number")
      thenAnErrorMessageIsDisplayed(
        "Enter the reference number"
      )

      And("I enter Application NDRC2103151135EE6L6YKH3&* reference no with a special character")
      andIEnterApplicationReferenceNoWithASpecialCharacter(
        "NDRC2103151135EE6L6YKH3&*"
      )

      Then(
        "An error message is displayed- Error: The reference number must only include letters a to z and numbers 0 to 9"
      )
      thenAnErrorMessageIsDisplayed(
        "The reference number must only include letters a to z and numbers 0 to 9"
      )

      Then("I clear the reference no field")
      thenIClearTheReferenceNoField()

      Then("I enter wrong format Application 103151135EE6L6YKH reference No")
      thenIEnterWrongFormatApplicationReferenceNo(
        "103151135EE6L6YKH"
      )

      Then("An error message is displayed- Error: Enter the reference number in the right format")
      thenAnErrorMessageIsDisplayed(
        "Enter the reference number in the right format"
      )

      Then("I clear the reference no field")
      thenIClearTheReferenceNoField()

      Then("I enter invalid length Application NDRC2103151135EE6L6 reference number")
      thenIEnterInvalidLengthApplicationReferenceNumber(
        "NDRC2103151135EE6L6"
      )

      Then("An error message is displayed- Error: The reference number must be 23 characters long")
      thenAnErrorMessageIsDisplayed(
        "The reference number must be 23 characters long"
      )

      Then("I clear the reference no field")
      thenIClearTheReferenceNoField()

      And("I enter valid Application NDRC2105261863OL4K3WXR2")
      andIEnterValidApplication("NDRC2105261863OL4K3WXR2")

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("I am on What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK page")
      thenIAmOnPage(
        "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK"
      )

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then(
        "An error message is displayed- Error: Select if you want to send more supporting documents, or give us further information in writing"
      )
      thenAnErrorMessageIsDisplayed(
        "Select if you want to send more supporting documents, or give us further information in writing"
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

      When("I click on the Continue button")
      whenIClickOnTheXButton("")

      Then("An error message is displayed- Error: Enter the further information")
      thenAnErrorMessageIsDisplayed(
        "Enter the further information"
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
  }
}
