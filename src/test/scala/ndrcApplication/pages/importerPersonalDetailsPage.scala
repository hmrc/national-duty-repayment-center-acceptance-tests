/*
 * Copyright 2022 HM Revenue & Customs
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
//import org.openqa.selenium.Keys

object importerPersonalDetailsPage extends importerPersonalDetailsPage

class importerPersonalDetailsPage extends commonMethods {

  private val fNameIdentifier = By.id("firstName")
  private val lNameIdentifier = By.id("lastName")
  private val impNameIdentifier = By.id("importerName")
  private val yourNameIdentifier = By.id("declarantName")
  private val businessNameIdentifier = By.id("agentName")
  private val addLine1Identifier = By.id("line1")
  private val cityIdentifier = By.id("town")
  private val postcodeIdentifier = By.id("postcode")
  private val countryCodeIdentifier = By.id("countryCode")
  private val phoneNoIdentifier = By.id("phone")
  private val emailIdentifier = By.id("email")


  def enterAddManuallyLink(): Unit = driver.findElement(By.id("manualAddress")).click()
  //def selectCountryCode(countryCodeValue : String): Unit = driver.findElement(By.cssSelector("#CountryCode")).sendKeys(countryCodeValue, Keys.DOWN, Keys.ENTER)
  def selectEmailOption(): Unit = driver.findElement(By.cssSelector("#value")).click()
  def selectPhoneOption(): Unit = driver.findElement(By.cssSelector("#value-2")).click()

  def enterFName(fNameValue : String): Unit = enterValInTextField(fNameIdentifier, fNameValue)
  def enterLName(lNameValue : String): Unit = enterValInTextField(lNameIdentifier, lNameValue)
  def enterImpName(impNameValue: String): Unit = enterValInTextField(impNameIdentifier,impNameValue)
  def enterYourName(yourNameValue: String): Unit = enterValInTextField(yourNameIdentifier,yourNameValue)
  def enterBusinessName(businessNameValue: String): Unit = enterValInTextField(businessNameIdentifier,businessNameValue)
  def enterAddLine1(addLine1Value : String): Unit = enterValInTextField(addLine1Identifier, addLine1Value)
  def enterCity(cityValue : String): Unit = enterValInTextField(cityIdentifier, cityValue)
  def enterPostCode(postCodeValue : String): Unit = enterValInTextField(postcodeIdentifier, postCodeValue)
  def enterCountryCode(countryCodeValue : String): Unit = enterValInTextField(countryCodeIdentifier, countryCodeValue)
  def enterPhoneNo(phoneNoValue : String): Unit = enterValInTextField(phoneNoIdentifier, phoneNoValue)
  def enterEmail(emailValue : String): Unit = enterValInTextField(emailIdentifier, emailValue)

}