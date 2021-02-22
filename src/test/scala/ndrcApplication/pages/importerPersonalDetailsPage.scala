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
import org.openqa.selenium.Keys

object importerPersonalDetailsPage extends importerPersonalDetailsPage

class importerPersonalDetailsPage extends commonMethods {

  private val fNameIdentifier = By.id("firstName")
  private val lNameIdentifier = By.id("lastName")
  private val addLine1Identifier = By.id("AddressLine1")
  private val cityIdentifier = By.id("City")
  private val countyIdentifier = By.id("Region")
  private val postcodeIdentifier = By.id("PostalCode")
  private val phoneNoIdentifier = By.id("value")
  private val emailIdentifier = By.id("email")


  def enterAddManuallyLink: Unit = driver.findElement(By.id("enter-address-manually")).click()
  def selectCountryCode(countryCodeValue : String): Unit = driver.findElement(By.cssSelector("#CountryCode")).sendKeys(countryCodeValue, Keys.DOWN, Keys.ENTER)

  def enterFName(fNameValue : String): Unit = enterValInTextField(fNameIdentifier, fNameValue)
  def enterLName(lNameValue : String): Unit = enterValInTextField(lNameIdentifier, lNameValue)
  def enterAddLine1(addLine1Value : String): Unit = enterValInTextField(addLine1Identifier, addLine1Value)
  def enterCity(cityValue : String): Unit = enterValInTextField(cityIdentifier, cityValue)
  def enterCounty(countyValue : String): Unit = enterValInTextField(countyIdentifier, countyValue)
  def enterPostCode(postCodeValue : String): Unit = enterValInTextField(postcodeIdentifier, postCodeValue)
  def enterPhoneNo(phoneNoValue : String): Unit = enterValInTextField(phoneNoIdentifier, phoneNoValue)
  def enterEmail(emailValue : String): Unit = enterValInTextField(emailIdentifier, emailValue)

}