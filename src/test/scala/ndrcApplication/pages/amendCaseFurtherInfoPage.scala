/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package ndrcApplication.pages

import org.openqa.selenium.By

object amendCaseFurtherInfoPage extends amendCaseFurtherInfoPage

class amendCaseFurtherInfoPage extends commonMethods {

  private val furtherInfoIdentifier = By.id("value")

  def enterFurtherInfo(furtherInfoValue : String): Unit = enterValInTextField(furtherInfoIdentifier, furtherInfoValue)

}