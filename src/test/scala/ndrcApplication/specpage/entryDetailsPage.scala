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

package ndrcApplication.specpage
import org.openqa.selenium.By

object entryDetailsPage extends entryDetailsPage

class entryDetailsPage extends commonMethods {

  private val epuID     = By.id("EPU")
  private val entryNoID = By.id("EntryNumber")
  private val dayID     = By.id("EntryDate.day")
  private val monthID   = By.id("EntryDate.month")
  private val yearID    = By.id("EntryDate.year")

  def enterEPU(epuValue: String): Unit         = enterValInTextField(epuID, epuValue)
  def enterEntryNo(entryNoValue: String): Unit = enterValInTextField(entryNoID, entryNoValue)
  def enterDay(dayValue: String): Unit         = enterValInTextField(dayID, dayValue)
  def enterMonth(monthValue: String): Unit     = enterValInTextField(monthID, monthValue)
  def enterYear(yearValue: String): Unit       = enterValInTextField(yearID, yearValue)

}