/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package ndrcApplication.pages

import org.openqa.selenium.By

object amendCaseResponseTypePage extends amendCaseResponseTypePage

class amendCaseResponseTypePage extends commonMethods {

  def selectSendMoreDocs: Unit = driver.findElement(By.cssSelector("#supportingDocuments")).click()
  def selectGiveMoreInfo: Unit = driver.findElement(By.cssSelector("#furtherInformation")).click()


}