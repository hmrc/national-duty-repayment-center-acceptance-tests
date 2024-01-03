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

object regulationsPage extends regulationsPage

class regulationsPage extends commonMethods {

  def selectErrorByCust(): Unit = webDriver.findElement(By.cssSelector("input[value=\"048\"]")).click()

  def selectLowerRate(): Unit = webDriver.findElement(By.cssSelector("input[value=\"049\"]")).click()

  def selectOverPayVat(): Unit = webDriver.findElement(By.cssSelector("input[value=\"050\"]")).click()

  def selectRejected(): Unit = webDriver.findElement(By.cssSelector("input[value=\"051\"]")).click()

  def selectSpecialCircum(): Unit = webDriver.findElement(By.cssSelector("input[value=\"052\"]")).click()

  def selectWithdrawalOfCust(): Unit = webDriver.findElement(By.cssSelector("input[value=\"053\"]")).click()

}
