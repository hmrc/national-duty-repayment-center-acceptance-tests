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

package ndrcApplication.pages

import org.openqa.selenium.By

object selectRepayMethodPage extends selectRepayMethodPage

class selectRepayMethodPage extends commonMethods {

  private val accNameIdentifier  = By.id("AccountName")
  private val sortCodeIdentifier = By.id("SortCode")
  private val accNoIdentifier    = By.id("AccountNumber")

  def enterAccName(accNameValue: String): Unit   = enterValInTextField(accNameIdentifier, accNameValue)
  def enterSortCode(sortCodeValue: String): Unit = enterValInTextField(sortCodeIdentifier, sortCodeValue)
  def enterAccNo(accNoValue: String): Unit       = enterValInTextField(accNoIdentifier, accNoValue)

}
