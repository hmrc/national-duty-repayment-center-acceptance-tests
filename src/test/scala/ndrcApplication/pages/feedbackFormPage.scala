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

package ndrcApplication.pages

import org.openqa.selenium.By

object feedbackFormPage extends feedbackFormPage

class feedbackFormPage extends commonMethods {

  private val scoreDetailsIdentifier = By.id("whyGiveScore")

  def selectVerEasy(): Unit                              = driver.findElement(By.cssSelector("#howEasyQuestion\\.VeryEasy")).click()
  def selectEasy(): Unit                                 = driver.findElement(By.cssSelector("#howEasyQuestion\\.Easy")).click()
  def selectNeitherEasyofDiff(): Unit                    = driver.findElement(By.cssSelector("#howEasyQuestion\\.Moderate")).click()
  def selectDiff(): Unit                                 = driver.findElement(By.cssSelector("#howEasyQuestion\\.Difficult")).click()
  def selectVeryDiff(): Unit                             = driver.findElement(By.cssSelector("#howEasyQuestion\\.VeryDifficult")).click()
  def selectVerySatisfied(): Unit                        =
    driver.findElement(By.cssSelector("#howDoYouFeelQuestion\\.VerySatisfied")).click()
  def selectSatisfied(): Unit                            = driver.findElement(By.cssSelector("#howDoYouFeelQuestion\\.Satisfied")).click()
  def selectNeitherSatisfiedOrDiss(): Unit               =
    driver.findElement(By.cssSelector("#howDoYouFeelQuestion\\.Moderate")).click()
  def selectDiss(): Unit                                 = driver.findElement(By.cssSelector("#howDoYouFeelQuestion\\.Dissatisfied")).click()
  def selectVeryDiss(): Unit                             = driver.findElement(By.cssSelector("#howDoYouFeelQuestion\\.VeryDissatisfied")).click()
  def clickOnFeedBackContinue(): Unit                    = driver.findElement(By.id("submit")).click()
  def enterScoreDetails(scoreDetailsValue: String): Unit =
    enterValInTextField(scoreDetailsIdentifier, scoreDetailsValue)

}
