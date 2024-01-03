/*
 * Copyright 2024 HM Revenue & Customs
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

package ndrcApplication.pages

import org.openqa.selenium.By

object customsDutyPage extends customsDutyPage

class customsDutyPage extends commonMethods {

  private val custDutyPaidIdentifier         = By.id("ActualPaidAmount")
  private val custDutyHaveBeenPaidIdentifier = By.id("ShouldHavePaidAmount")

  def clearCustDutyPaid(): Unit = webDriver.findElement(By.id("ActualPaidAmount")).clear()

  def clearCustDutyShldHavePaid(): Unit = webDriver.findElement(By.id("ShouldHavePaidAmount")).clear()

  def hintText: String = webDriver.findElement(By.id("instructions")).getText()

  def enterCustDutyPaid(custDutyPaidValue: String): Unit =
    enterValInTextField(custDutyPaidIdentifier, custDutyPaidValue)

  def enterCustDutyHaveBeenPaid(custDutyHaveBeenPaidValue: String): Unit =
    enterValInTextField(custDutyHaveBeenPaidIdentifier, custDutyHaveBeenPaidValue)

}
