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

import io.cucumber.scala.{EN, ScalaDsl}
import ndrcApplication.pages.eoriNoPage._
import ndrcApplication.pages.eoriNoPage

object EoriNoStepsSteps {

  // ^I choose eori "([^"]*)" option$
  def andIChooseEori(yOrNEori: String): Unit =
    yOrNEori match {
      case "Yes" => clickByCSS("#value")
      case "No"  => clickByCSS("#value-no")
    }

  // ^I enter \"([^\"]*)\" in correct format GB$
  def andIEnterXInCorrectFormatGB(eoriNO: String): Unit =
    eoriNoPage.enterEoriNo(eoriNO)

}
