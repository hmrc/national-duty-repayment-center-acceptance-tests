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
import ndrcApplication.pages.checkYourAnswersPage

class CheckYourAnswersSteps extends checkYourAnswersPage with ScalaDsl with EN {

  Then("^I verify correct data items is displayed$") { () =>
    checkYourAnswersPage.verifyRefNo(RefNo)
    checkYourAnswersPage.verifyResType(ResType)
    checkYourAnswersPage.verifyResToHMRC(ResToHMRC)
    checkYourAnswersPage.verifyDocs(Docs)
  }

  Then(
    "^I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$"
  ) { (refNo: String, resType: String, resHMRC: String, docsCount: String) =>
    assertElementText(refNo, RefNoResponse)
    assertElementText(resType, ResTypeResponse)
    assertElementText(resHMRC, ResToHMRCResponse)
    assertElementText(docsCount, DocsResponse)

  }

  When("^I click on change option on the amend review page for reference no$") { () =>
    checkYourAnswersPage.clickRefNOChangeOption()
  }

  When("^I click on change option on the amend review page for response type$") { () =>
    checkYourAnswersPage.clickResTypeChangeOption()
  }

  Then("^I verify correct responses is displayed for Amend case journey \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$") {
    (refNo: String, resType: String, resHMRC: String) =>
      assertElementText(refNo, RefNoResponse)
      assertElementText(resType, ResTypeResponse)
      assertElementText(resHMRC, ResToHMRCResponse)
  }

  When("^I click on change option on the amend review page for documents uploaded$") { () =>
    checkYourAnswersPage.clickDocsChangeOption()
  }

  When("^I click on change option on the review page for total return amount$") { () =>
    checkYourAnswersPage.clickTotalReturnAmountChangeOption()
  }

  When("^I click on change option on the review page for entry details") { () =>
    checkYourAnswersPage.clickEntryDetailsChangeOption()
  }

}
