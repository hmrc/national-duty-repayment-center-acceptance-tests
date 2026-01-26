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

import ndrcApplication.specpage.importerPersonalDetailsPage

object ImporterPersonalDetailsStepsSteps {

  // ^I enter first \"([^\"]*)\" and last \"([^\"]*)\"$
  def andIEnterFirstAndLastName(fName: String, lName: String): Unit = {
    importerPersonalDetailsPage.enterFName(fName)
    importerPersonalDetailsPage.enterLName(lName)
  }

  // ^I enter \"([^\"]*)\" name in rep journey$
  def andIEnterImpNameInRepJourney(impName: String): Unit =
    importerPersonalDetailsPage.enterImpName(impName)

  // ^I enter your \"([^\"]*)\" and business \"([^\"]*)\"$
  def andIEnterYourNameAndBusinessName(yourName: String, businessName: String): Unit = {
    importerPersonalDetailsPage.enterYourName(yourName)
    importerPersonalDetailsPage.enterBusinessName(businessName)
  }

  // ^I select \"([^\"]*)\" option$
  def andISelectOption(option: String): Unit =
    importerPersonalDetailsPage.enterAddManuallyLink()

  // ^I enter address manually Address Line: \"([^\"]*)\", City: \"([^\"]*)\" and PostCode: \"([^\"]*)\"$
  def andIEnterAddressManuallyAddressLine(addLine: String, city: String, postCode: String): Unit = {
    importerPersonalDetailsPage.enterAddLine1(addLine)
    importerPersonalDetailsPage.enterCity(city)
    importerPersonalDetailsPage.enterPostCode(postCode)
  }

  // ^I select email option$
  def andISelectEmailOption(): Unit =
    importerPersonalDetailsPage.selectEmailOption()

  // ^I enter \"([^\"]*)\"$
  def andIEnterEmail(email: String): Unit =
    importerPersonalDetailsPage.enterEmail(email)

  // ^I enter country \"([^\"]*)\"$
  def andIEnterCountry(country: String): Unit =
    importerPersonalDetailsPage.enterCountry(country)

  // ^I select phone no option$
  def andISelectPhoneNoOption(): Unit =
    importerPersonalDetailsPage.selectPhoneOption()

  // ^I enter \"([^\"]*)\" importers$
  def andIEnterPhoneNo(phoneNo: String): Unit =
    importerPersonalDetailsPage.enterPhoneNo(phoneNo)

}
