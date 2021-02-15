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

object reclaimPage extends reclaimPage

class reclaimPage extends commonMethods {

  def selectCustDuty: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-checkboxes') and input[@value = '01']]")).click()
  def selectImpVat: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-checkboxes') and input[@value = '02']]")).click()
  def selectOtherDuty: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-checkboxes') and input[@value = '03']]")).click()


}