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

object regulationsPage extends regulationsPage

class regulationsPage extends commonMethods {

  def selectErrorByCust(): Unit = driver.findElement(By.cssSelector("#value")).click()

  def selectLowerRate(): Unit = driver.findElement(By.cssSelector("#value-2")).click()

  def selectOverPayVat(): Unit = driver.findElement(By.cssSelector("#value-3")).click()

  def selectRejected(): Unit = driver.findElement(By.cssSelector("#value-4")).click()

  def selectSpecialCircum(): Unit = driver.findElement(By.cssSelector("#value-5")).click()

  def selectWithdrawalOfCust(): Unit = driver.findElement(By.cssSelector("#value-6")).click()

}
