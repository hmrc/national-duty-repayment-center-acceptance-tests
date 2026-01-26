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

object aboutGoodsPage extends aboutGoodsPage

class aboutGoodsPage extends commonMethods {

  private val reasonIdentifier       = By.id("value")
  private val goodsDetailsIdentifier = By.id("value")

  def enterReason(reasonValue: String): Unit             = enterValInTextField(reasonIdentifier, reasonValue)
  def enterGoodsDetails(goodsDetailsValue: String): Unit =
    enterValInTextField(goodsDetailsIdentifier, goodsDetailsValue)

}
