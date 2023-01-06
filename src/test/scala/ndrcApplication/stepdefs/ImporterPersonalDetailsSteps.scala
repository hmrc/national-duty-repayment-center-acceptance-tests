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
import ndrcApplication.pages.importerPersonalDetailsPage

class ImporterPersonalDetailsSteps extends importerPersonalDetailsPage with ScalaDsl with EN {

  And("^I enter first \"([^\"]*)\" and last \"([^\"]*)\"$") { (fName: String, lName: String) =>
    importerPersonalDetailsPage.enterFName(fName)
    importerPersonalDetailsPage.enterLName(lName)
  }
//Representative journey - capture importer name
  And("^I enter \"([^\"]*)\" name in rep journey$") { (impName: String) =>
    importerPersonalDetailsPage.enterImpName(impName)
  }

  And("^I enter your \"([^\"]*)\" and business \"([^\"]*)\"$") { (yourName: String, businessName: String) =>
    importerPersonalDetailsPage.enterYourName(yourName)
    importerPersonalDetailsPage.enterBusinessName(businessName)
  }

  And("^I select \"([^\"]*)\" option$") { (_: String) =>
    importerPersonalDetailsPage.enterAddManuallyLink()
  }

  And("^I enter address manually Address Line: \"([^\"]*)\", City: \"([^\"]*)\" and PostCode: \"([^\"]*)\"$") {
    (addLine: String, city: String, postCode: String) =>
      importerPersonalDetailsPage.enterAddLine1(addLine)
      importerPersonalDetailsPage.enterCity(city)
      importerPersonalDetailsPage.enterPostCode(postCode)
  }

  And("^I select email option$") { () =>
    importerPersonalDetailsPage.selectEmailOption()
  }

  And("^I enter \"([^\"]*)\"$") { (email: String) =>
    importerPersonalDetailsPage.enterEmail(email)
  }

  And("^I enter country \"([^\"]*)\"$") { (country: String) =>
    importerPersonalDetailsPage.enterCountry(country)
  }

  And("^I select phone no option$") { () =>
    importerPersonalDetailsPage.selectPhoneOption()
  }

  And("^I enter \"([^\"]*)\" importers$") { (phoneNo: String) =>
    importerPersonalDetailsPage.enterPhoneNo(phoneNo)
  }

}
