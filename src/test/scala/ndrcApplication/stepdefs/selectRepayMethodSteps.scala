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
import ndrcApplication.pages.{commonPage, selectRepayMethodPage}

class selectRepayMethodSteps extends selectRepayMethodPage with ScalaDsl with EN {

  Then("""^I am on "([^"]*)" page$""") { pageTitle: String =>
    assert(commonPage.isPageTitleDisplayed(pageTitle))
  }

  And("^I choose \"([^\"]*)\" option$") { (repayment: String) =>

    repayment match {
      case "Bank transfer (Bacs)" => optionSelected("#value")
      case "Current month amendment (CMA)" => optionSelected("#value-2")
    }
  }

  When("""^I click on the "([^"]*)" button$""") {
    commonPage.clickOnContinueBtn()
  }

  Then("""^I am on "([^"]*)" page$""") { pageTitle: String =>
    assert(commonPage.isPageTitleDisplayed(pageTitle))
  }

  And("^I enter account \"([^\"]*)\" and sortcode \"([^\"]*)\" and account number \"([^\"]*)\"$") { (accName: String, sortCode: String, accNo: String) =>
    selectRepayMethodPage.enterAccName(accName)
    selectRepayMethodPage.enterSortCode(sortCode)
    selectRepayMethodPage.enterAccNo(accNo)
  }

  When("""^I click on the "([^"]*)" button$""") {
    commonPage.clickOnContinueBtn()
  }

}
