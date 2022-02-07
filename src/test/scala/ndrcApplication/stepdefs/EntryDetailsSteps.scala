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

import java.time.LocalDate

import io.cucumber.scala.{EN, ScalaDsl}
import ndrcApplication.pages.entryDetailsPage

import scala.util.Try

  class EntryDetailsSteps extends entryDetailsPage with ScalaDsl with EN {

    And("""^I enter declaration details- EPU: "([^"]*)" and Entry No: "([^"]*)"$""") { (epu: String, entryNo: String) =>
      entryDetailsPage.enterEPU(epu)
      entryDetailsPage.enterEntryNo(entryNo)

    }

    And("""^I enter an entry date that was ([^"]*) days ago$""") { (numberOfDays: String) =>
      val entryDate = LocalDate.now().minusDays(Try(numberOfDays.toLong).getOrElse(0L))
      entryDetailsPage.enterDay(entryDate.getDayOfMonth.toString)
      entryDetailsPage.enterMonth(entryDate.getMonthValue.toString)
      entryDetailsPage.enterYear(entryDate.getYear.toString)

    }

    And("""^I enter an entry date of (.*)/(.*)/(.*)$""") { (day: String,month: String, year: String) =>
      entryDetailsPage.enterDay(day)
      entryDetailsPage.enterMonth(month)
      entryDetailsPage.enterYear(year)

    }

}
