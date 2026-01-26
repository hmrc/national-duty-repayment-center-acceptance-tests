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

import io.cucumber.scala.{EN, ScalaDsl}
import ndrcApplication.pages.amendCaseResponseTypePage

object AmendCaseResponseTypeSteps {

  // ^I choose both send more supporting documents and give further information$
  def andIChooseBothSendMoreSupportingDocumentsAndGiveFurtherInformation(): Unit = {
    amendCaseResponseTypePage.selectSendMoreDocs()
    amendCaseResponseTypePage.selectGiveMoreInfo()
  }

  // ^I choose send more supporting documents$
  def andIChooseSendMoreSupportingDocuments(): Unit =
    amendCaseResponseTypePage.selectSendMoreDocs()

  // ^I choose to provide give further information$
  def andIChooseToProvideGiveFurtherInformation(): Unit =
    amendCaseResponseTypePage.selectGiveMoreInfo()

}
