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
import ndrcApplication.pages.commonPage
import ndrcApplication.pages.loginPage

class LoginPageSteps extends loginPage with ScalaDsl with EN {

  Given("""^I am on the start page for trader service and select Apply Now$""") { () =>
    commonPage.loginNDRCViaAuthStub()
    loginPage.selectStart

  }

  Given("^I am on the start page for trader service and select Amend Now$") { () =>
    commonPage.loginNDRCViaAuthStub()
    loginPage.selectAmend

  }

}
