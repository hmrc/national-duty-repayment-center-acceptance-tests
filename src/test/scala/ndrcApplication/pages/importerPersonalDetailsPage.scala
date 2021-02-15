/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package ndrcApplication.pages

import org.openqa.selenium.By

object importerPersonalDetailsPage extends importerPersonalDetailsPage

class importerPersonalDetailsPage extends commonMethods {

  private val fNameIdentifier = By.id("firstName")
  private val lNameIdentifier = By.id("lastName")
  private val postcodeIdentifier = By.id("postCode")
  private val phoneNoIdentifier = By.id("value")
  private val emailIdentifier = By.id("email")



  def enterFName(fNameValue : String): Unit = enterValInTextField(fNameIdentifier, fNameValue)
  def enterLName(lNameValue : String): Unit = enterValInTextField(lNameIdentifier, lNameValue)
  def enterPostCode(postCodeValue : String): Unit = enterValInTextField(postcodeIdentifier, postCodeValue)
  def enterPhoneNo(phoneNoValue : String): Unit = enterValInTextField(phoneNoIdentifier, phoneNoValue)
  def enterEmail(emailValue : String): Unit = enterValInTextField(emailIdentifier, emailValue)

}