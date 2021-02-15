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

object appReasonPage extends appReasonPage

class appReasonPage extends commonMethods {


  def selectCommCode: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '04']]")).click()
  def selectCurrChange: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '03']]")).click()
  def selectCustProCode: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '02']]")).click()
  def selectCustSplPro: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '05']]")).click()
  def selectPreference: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '06']]")).click()
  def selectRetroQuota: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '01']]")).click()
  def selectRetUnwantGoods: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '08']]")).click()
  def selectRetGoodsRelief: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '07']]")).click()
  def selectValue: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '09']]")).click()
  def selectOther: Unit = driver.findElement(By.className("//*[contains(@class, 'govuk-radios') and input[@value = '10']]")).click()


}