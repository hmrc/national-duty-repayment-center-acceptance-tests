/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package ndrcApplication.pages

import org.openqa.selenium.By

object selectRepayMethodPage extends selectRepayMethodPage

class selectRepayMethodPage extends commonMethods {

  private val accNameIdentifier = By.id("AccountName")
  private val sortCodeIdentifier = By.id("SortCode")
  private val accNoIdentifier = By.id("AccountNumber")


  def enterAccName(accNameValue : String): Unit = enterValInTextField(accNameIdentifier, accNameValue)
  def enterSortCode(sortCodeValue : String): Unit = enterValInTextField(sortCodeIdentifier, sortCodeValue)
  def enterAccNo(accNoValue : String): Unit = enterValInTextField(accNoIdentifier, accNoValue)


}