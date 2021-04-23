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

package ndrcApplication.pages

import org.openqa.selenium.By

object otherCustDutyPage extends otherCustDutyPage

class otherCustDutyPage extends commonMethods {

  private val otherCustDutyPaidIdentifier = By.id("ActualPaidAmount")
  private val otherCustDutyBeenPaidIdentifier = By.id("ShouldHavePaidAmount")

  def clearOtherDutyPaid:Unit = driver.findElement(By.id("ActualPaidAmount")).clear()
  def clearOtherDutyBeenPaid:Unit = driver.findElement(By.id("ShouldHavePaidAmount")).clear()

  def enterOtherCustDutyPaid(otherCustDutyPaidValue : String): Unit = enterValInTextField(otherCustDutyPaidIdentifier, otherCustDutyPaidValue)
  def enterOtherCustDutyBeenPaid(otherCustDutyBeenPaidValue : String): Unit = enterValInTextField(otherCustDutyBeenPaidIdentifier, otherCustDutyBeenPaidValue)

}