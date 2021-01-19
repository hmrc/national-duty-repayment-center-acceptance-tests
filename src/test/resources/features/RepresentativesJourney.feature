Feature: Representatives Journey
  @suite
    @ZAP
  Scenario Outline: A user wants to complete a New Representatives journey
    Given I am on the start page for trader service and select Apply Now
    Then I am on "are you an importer or representative" page
    And I choose Representative claimant type
    When I click on the "Continue" button
    Then I am on "No of entries" page
    And I choose "<entry>"
    When I click on the "Continue" button
    Then I am on "what was the acceptance date for all entries" page
    And I choose "<dateRange>"
    When I click on the "Continue" button
    Then I am on "are you applying for repayment" page
    And I choose "<repaymentType>"
    When I click on the "Continue" button
    Then I am on "entry details" page
    And I enter declaration details "<epu>" and "<entryNo>"
    And I enter today's date for entryDate
    When I click on the "Continue" button
    Then I am on "application reason" page
    And I choose "<applicationReason>"
    When I click on the "Continue" button
    Then I am on "reason for overpayment" page
    And I enter "<reason>" for overpayment
    When I click on the "Continue" button
    Then I am on "tell us about the goods" page
    And I enter "<goods>" details
    When I click on the "Continue" button
    Then I am on "what was overpaid" page
    And I choose customsDuty importVAT anotherTypeofDuty options
    When I click on the "Continue" button
    Then I am on "Customs duty was paid" page
    And I enter "<customsDuty>" paid
    When I click on the "Continue" button
    Then I am on "Customs duty should have been paid" page
    And I enter "<customsDutie>" should have paid to HMRC
    When I click on the "Continue" button
    Then I am on "import VAT was paid" page
    And I enter import "<vat>" paid
    When I click on the "Continue" button
    Then I am on "import VAT should have been paid to HMRC" page
    And I enter import "<vatPaid>" to HMRC
    When I click on the "Continue" button
    Then I am on "other customs duty paid" page
    And I enter other "<cDuty>" paid
    When I click on the "Continue" button
    Then I am on "other duties should have been paid to HMRC" page
    And I enter other "<cDuties>" paid to HMRC
    When I click on the "Continue" button
    Then I am on the "Repayment amount summary" page
    When I click on the "Continue" button
    Then I am on "supporting documents" page
    When I click on the "Continue" button
    Then I am on "Upload a file" page
#      When I click the button to upload and select "first" file
#      Then I should be on the new file upload confirmation page after uploading 1 document/s
#      Then I should see first uploaded doc test.jpg on upload review page
#      Then I select No to to uploading another file
    When I click on the "Continue" button
    Then I am on "Importers EORI no" page
    And I choose Yes option
    When I click on continue button
    Then I am on "Importer Eori no entry" page
    And I enter "<eoriNo>" either GB or XI
    When I click on the "Continue" button
    Then I am on "are you VAT registered" page
    And I choose Yes option
    When I click on the "Continue" button
    Then I am on "importers name" page
    And I enter first "<fName>" and last "<lName>"
    When I click on the "Continue" button
    Then I am on "importers address" page
    And I enter importers "<postCode>"
    When I click on the "Continue" button
    Then I am on "select your importers address" page
    When click on the "Continue" button
    Then I am on "agent eori no" page
    And I choose Yes option
    When I click on continue button
    Then I am on "Agent Eori no entry" page
    And I enter "<agentEoriNo>" either GB or XI
    When I click on the "Continue" button
    Then I am on "agent name" page
    And I enter first "<agentfName>" and last "<agentlName>"
    When I click on the "Continue" button
    Then I am on "Business address" page
    And I enter business "<businessPostCode>"
    When I click on the "Continue" button
    Then I am on "select your business address" page
    When click on the "Continue" button
    Then I am on "enter your phone no" page
    And I enter "<phoneNo>" importers
    When I click on the "Continue" button
    Then I am on "contact you by email" page
    And I choose Yes option and enter "<emailAddress>"
    When I click on the "Continue" button
    Then I am on "select repayment method" page
    And I choose BACS option
    When I click on the "Continue" button
    Then I am on "who is to be repaid" page
    And I choose "Representative" option
    When I click on the "Continue" button
    Then I am on "Indirect representative" page
    And I choose Yes option
    When I click on the "Continue" button
    Then I am on "enter your bank details" page
    And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
    When I click on the "Continue" button
    Then I am on "check your answers" page
    When I click on the "Continue" button
    Then I am on "application confirmation" page

    Examples:
      | entry | dateRange| repaymentType | epu | entryNo | applicationReason | reason | goods | customsDuty | customsDutie | vat | vatPaid | cDuty | cDuties | eoriNo | fName | lName | postCode | agentEoriNo | agentfName | agentlName | businessPostCode | phoneNo | emailAddress | aName | sCode | accNo |


  Scenario Outline: A user wants to complete a New Multi entry Representatives journey
    Given I am on the start page for trader service and select Apply Now
    Then I am on "are you an importer or representative" page
    And I choose Representative claimant type
    When I click on the "Continue" button
    Then I am on "No of entries" page
    And I choose "<entry>"
    When I click on the "Continue" button
    Then I am on "How many entries are you claiming for" page
    And I enter "<noOfEntries>" value
    When I click on the "Continue" button
    Then I am on "what was the acceptance date for all entries" page
    And I choose "<dateRange>"
    When I click on the "Continue" button
    Then I am on "Upload the multiple entries" page
    When I click on the "Continue" button
    Then I am on "are you applying for repayment" page
    And I choose "<repaymentType>"
    When I click on the "Continue" button
    Then I am on "entry details" page
    And I enter declaration details "<epu>" and "<entryNo>"
    And I enter today's date for entryDate
    When I click on the "Continue" button
    Then I am on "application reason" page
    And I choose "<applicationReason>"
    When I click on the "Continue" button
    Then I am on "reason for overpayment" page
    And I enter "<reason>" for overpayment
    When I click on the "Continue" button
    Then I am on "tell us about the goods" page
    And I enter "<goods>" details
    When I click on the "Continue" button
    Then I am on "what was overpaid" page
    And I choose customsDuty importVAT anotherTypeofDuty options
    When I click on the "Continue" button
    Then I am on "Customs duty was paid" page
    And I enter "<customsDuty>" paid
    When I click on the "Continue" button
    Then I am on "Customs duty should have been paid" page
    And I enter "<customsDutie>" should have paid to HMRC
    When I click on the "Continue" button
    Then I am on "import VAT was paid" page
    And I enter import "<vat>" paid
    When I click on the "Continue" button
    Then I am on "import VAT should have been paid to HMRC" page
    And I enter import "<vatPaid>" to HMRC
    When I click on the "Continue" button
    Then I am on "other customs duty paid" page
    And I enter other "<cDuty>" paid
    When I click on the "Continue" button
    Then I am on "other duties should have been paid to HMRC" page
    And I enter other "<cDuties>" paid to HMRC
    When I click on the "Continue" button
    Then I am on the "Repayment amount summary" page
    When I click on the "Continue" button
    Then I am on "supporting documents" page
    When I click on the "Continue" button
    Then I am on "Upload a file" page
#      When I click the button to upload and select "first" file
#      Then I should be on the new file upload confirmation page after uploading 1 document/s
#      Then I should see first uploaded doc test.jpg on upload review page
#      Then I select No to to uploading another file
    When I click on the "Continue" button
    Then I am on "Importers EORI no" page
    And I choose Yes option
    When I click on continue button
    Then I am on "Importer Eori no entry" page
    And I enter "<eoriNo>" either GB or XI
    When I click on the "Continue" button
    Then I am on "are you VAT registered" page
    And I choose Yes option
    When I click on the "Continue" button
    Then I am on "importers name" page
    And I enter first "<fName>" and last "<lName>"
    When I click on the "Continue" button
    Then I am on "importers address" page
    And I enter importers "<postCode>"
    When I click on the "Continue" button
    Then I am on "select your importers address" page
    When click on the "Continue" button
    Then I am on "agent eori no" page
    And I choose Yes option
    When I click on continue button
    Then I am on "Agent Eori no entry" page
    And I enter "<agentEoriNo>" either GB or XI
    When I click on the "Continue" button
    Then I am on "agent name" page
    And I enter first "<agentfName>" and last "<agentlName>"
    When I click on the "Continue" button
    Then I am on "Business address" page
    And I enter business "<businessPostCode>"
    When I click on the "Continue" button
    Then I am on "select your business address" page
    When click on the "Continue" button
    Then I am on "enter your phone no" page
    And I enter "<phoneNo>" agent
    When I click on the "Continue" button
    Then I am on "contact you by email" page
    And I choose Yes option and enter "<emailAddress>"
    When I click on the "Continue" button
    Then I am on "who is to be repaid" page
    And I choose "Representative" option
    When I click on the "Continue" button
    Then I am on "Indirect representative" page
    And I choose Yes option
    When I click on the "Continue" button
    Then I am on "enter your bank details" page
    And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
    When I click on the "Continue" button
    Then I am on "check your answers" page
    When I click on the "Continue" button
    Then I am on "application confirmation" page

    Examples:
      | entry | dateRange| repaymentType | epu | entryNo | applicationReason | reason | goods | customsDuty | customsDutie | vat | vatPaid | cDuty | cDuties | eoriNo | fName | lName | postCode | agentEoriNo | agentfName | agentlName | businessPostCode | phoneNo | emailAddress | aName | sCode | accNo |
