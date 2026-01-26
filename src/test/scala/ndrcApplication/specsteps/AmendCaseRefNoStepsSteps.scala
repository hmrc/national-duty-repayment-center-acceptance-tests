/*
 * Copyright 2026 HM Revenue & Customs
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

import ndrcApplication.specpage.amendCaseRefNoPage

object AmendCaseRefNoStepsSteps {

  // ^I enter valid Application \"([^\"]*)\"$
  def andIEnterValidApplication(refNo: String): Unit =
    amendCaseRefNoPage.enterRefNo(refNo)

  // ^I enter Application \"([^\"]*)\" reference no with a special character$
  def andIEnterApplicationReferenceNoWithASpecialCharacter(splCharacterRefNo: String): Unit =
    amendCaseRefNoPage.enterRefNo(splCharacterRefNo)

  // ^I enter wrong format Application \"([^\"]*)\" reference No$
  def thenIEnterWrongFormatApplicationReferenceNo(wrongFormatRefNo: String): Unit =
    amendCaseRefNoPage.enterRefNo(wrongFormatRefNo)

  // ^I enter invalid length Application \"([^\"]*)\" reference number$
  def thenIEnterInvalidLengthApplicationReferenceNumber(invalidLenRefNo: String): Unit =
    amendCaseRefNoPage.enterRefNo(invalidLenRefNo)

}
