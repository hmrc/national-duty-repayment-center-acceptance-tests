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
import ndrcApplication.pages.feedbackFormPage

class FeedbackFormSteps extends feedbackFormPage with ScalaDsl with EN {

  And("^I click on what do you think of this service link$") {  () =>
    feedbackFormPage.clickServiceSurveyFromConfPage
  }

  And("^I choose \"([^\"]*)\" for you able to do what you needed to do today$") {  (yOrN: String) =>
    yOrN match {
      case "Yes" => clickByCSS("#ableToDo-yes")
      case "No" => clickByCSS("#ableToDo-no")
    }
  }

  And("^I choose rating for was it for you to do what you needed to do today$") { () =>
    feedbackFormPage.selectEasy
  }

  And("^I enter \"([^\"]*)\" of the service$") { (score: String) =>
    feedbackFormPage.enterScoreDetails(score)
  }

  And("^I choose overallRating for the overall service$") { () =>
    feedbackFormPage.selectVerySatisfied
  }

}
