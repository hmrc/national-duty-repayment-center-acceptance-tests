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

import ndrcApplication.specpage.selectRepayMethodPage
import ndrcApplication.specpage.selectRepayMethodPage._

object selectRepayMethodStepsSteps {

  // ^I choose \"([^\"]*)\" repayment option$
  def andIChooseRepaymentOption(repayment: String): Unit =
    repayment match {
      case "Bank transfer (Bacs)"          => clickByCSS("#value")
      case "Current month amendment (CMA)" => clickByCSS("#value-2")
    }

  // ^I enter account \"([^\"]*)\" and sortcode \"([^\"]*)\" and account number \"([^\"]*)\"$
  def andIEnterAccountAndSortcodeAndAccountNumber(accName: String, sortCode: String, accNo: String): Unit = {
    selectRepayMethodPage.enterAccName(accName)
    selectRepayMethodPage.enterSortCode(sortCode)
    selectRepayMethodPage.enterAccNo(accNo)
  }

}
