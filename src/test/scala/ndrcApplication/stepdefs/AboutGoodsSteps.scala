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

import cucumber.api.scala.{EN, ScalaDsl}
import ndrcApplication.pages.aboutGoodsPage

class AboutGoodsSteps extends aboutGoodsPage with ScalaDsl with EN {

  And("""^I enter Reason for overpayment- Reason: "([^"]*)"$""") { (reason: String) =>
    aboutGoodsPage.enterReason(reason)

  }

  And("""^I enter goods details- Details: "([^"]*)"$""") { (goodsDetails: String) =>
    aboutGoodsPage.enterGoodsDetails(goodsDetails)

  }

}
