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
import ndrcApplication.pages.amendCaseRefNoPage

class AmendCaseRefNoSteps extends amendCaseRefNoPage with ScalaDsl with EN {

  And("^I enter valid Application \"([^\"]*)\"$") { (refNo: String) =>
    amendCaseRefNoPage.enterRefNo(refNo)
  }

  And("^I enter Application \"([^\"]*)\" reference no with a special character$") { (splCharacterRefNo: String) =>
    amendCaseRefNoPage.enterRefNo(splCharacterRefNo)
  }

  Then("^I enter wrong format Application \"([^\"]*)\" reference No$") { (wrongFormatRefNo: String) =>
    amendCaseRefNoPage.enterRefNo(wrongFormatRefNo)
  }

  Then("^I enter invalid length Application \"([^\"]*)\" reference number$") { (invalidLenRefNo: String) =>
    amendCaseRefNoPage.enterRefNo(invalidLenRefNo)
  }

}
