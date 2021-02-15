/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package ndrcApplication.pages

import org.openqa.selenium.By

object eoriNoPage extends eoriNoPage

class eoriNoPage extends commonMethods {

  private val eoriNoIdentifier = By.id("value")


  def enterEoriNo(eoriNoValue : String): Unit = enterValInTextField(eoriNoIdentifier, eoriNoValue)





}