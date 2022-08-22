/*
 * Copyright 2022 HM Revenue & Customs
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
import ndrcApplication.driver.StartUpTearDown
import ndrcApplication.pages.{amendCaseRefNoPage, commonPage, customsDutyPage}
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper

class CommonSteps extends ScalaDsl with EN with StartUpTearDown {

  Then("""^I am on "([^"]*)" page$""") { pageTitle: String =>
    assert(commonPage.isPageTitleDisplayed(pageTitle))
  }

  When("""^I click on the "([^"]*)" button$""") { (continue: String) =>
    commonPage.clickGenericButton()
  }

  And("""^I click the (.*) link$""") { link: String =>
    commonPage.click(link)
  }

  Then("^An error message is displayed- Error: \"([^\"]*)\"$") { (errorMsg: String) =>
    amendCaseRefNoPage.errMsg
  }

  Then("^I clear the reference no field$") { () =>
    amendCaseRefNoPage.clearRefNo
  }

  And("^Hint text is displayed \"([^\"]*)\"$") { (hintText: String) =>
    customsDutyPage.hintText mustBe hintText
  }

  Then("^I Accept cookies and hide message$") { () =>
    commonPage.acceptCookies()
    commonPage.hideCookiesMsg()
  }

}
