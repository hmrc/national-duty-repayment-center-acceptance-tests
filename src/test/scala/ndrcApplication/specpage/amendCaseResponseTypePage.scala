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

package ndrcApplication.specpage

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver

object amendCaseResponseTypePage extends amendCaseResponseTypePage

class amendCaseResponseTypePage extends commonMethods {

  def selectSendMoreDocs(): Unit = Driver.instance.findElement(By.cssSelector("#value")).click()

  def selectGiveMoreInfo(): Unit = Driver.instance.findElement(By.cssSelector("#value-2")).click()

}