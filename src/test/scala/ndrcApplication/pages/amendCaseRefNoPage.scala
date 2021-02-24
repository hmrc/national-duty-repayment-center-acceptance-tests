/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package ndrcApplication.pages

import org.openqa.selenium.By

object amendCaseRefNoPage extends amendCaseRefNoPage

class amendCaseRefNoPage extends commonMethods {

  private val refNoIdentifier = By.id("value")

  def enterRefNo(refNoValue : String): Unit = enterValInTextField(refNoIdentifier, refNoValue)

}