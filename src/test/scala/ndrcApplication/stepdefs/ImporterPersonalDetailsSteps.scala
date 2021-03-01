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

package ndrcApplication.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import ndrcApplication.pages.importerPersonalDetailsPage

class ImporterPersonalDetailsSteps extends importerPersonalDetailsPage with ScalaDsl with EN {

  And("^I enter first \"([^\"]*)\" and last \"([^\"]*)\"$"){ (fName: String, lName: String) =>
    importerPersonalDetailsPage.enterFName(fName)
    importerPersonalDetailsPage.enterLName(lName)

  }

  And("^I select \"([^\"]*)\" option$"){ (enterAddManLink: String) =>
    importerPersonalDetailsPage.enterAddManuallyLink
  }

  And("^I enter address manually Address Line: \"([^\"]*)\", City: \"([^\"]*)\", County: \"([^\"]*)\", PostCode: \"([^\"]*)\" and Country: \"([^\"]*)\"$") { (addLine: String, city: String, county: String, postCode: String, country: String) =>
    importerPersonalDetailsPage.enterAddLine1(addLine)
    importerPersonalDetailsPage.enterCity(city)
    importerPersonalDetailsPage.enterCounty(county)
    importerPersonalDetailsPage.enterPostCode(postCode)
    importerPersonalDetailsPage.selectCountryCode(country)
  }

  And("^I enter \"([^\"]*)\" importers$") { (phoneNo: String) =>
    importerPersonalDetailsPage.enterPhoneNo(phoneNo)
  }

  And("^I choose \"([^\"]*)\" option and enter \"([^\"]*)\"$") { (YorNEmail: String, email: String) =>

    YorNEmail match {
      case "Yes" => clickByCSS("#value")
      case "No" => clickByCSS("#value-2")
    }

    importerPersonalDetailsPage.enterEmail(email)
  }

}
