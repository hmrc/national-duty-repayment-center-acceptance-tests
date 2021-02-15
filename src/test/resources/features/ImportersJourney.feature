Feature: Importers Journey
    @suite
    @ZAP
  Scenario Outline: A user wants to complete a New Importers journey
    Given I am on the start page for trader service and select Apply Now
      Then I am on "are you an importer or representative" page
      And I choose Importer claimant type
      When I click on the "Continue" button
      Then I am on "No of entries" page
      And I choose one entry
      When I click on the "Continue" button
      Then I am on "what was the acceptance date for all entries" page
      And I choose a date Range on or before Dec
      When I click on the "Continue" button
      Then I am on "are you applying for repayment" page
      And I choose a repayment Type
      When I click on the "Continue" button
      Then I am on "entry details" page
      And I enter declaration details- EPU: "345" and Entry No: "123456t"
      And I enter entryDate- Day: "08", Month: "12" and Year: "2019"
      When I click on the "Continue" button
      Then I am on "application reason" page
      And I choose an application Reason
      When I click on the "Continue" button
      Then I am on "reason for overpayment" page
      And I enter Reason for overpayment- Reason: "Paid more"
      When I click on the "Continue" button
      Then I am on "tell us about the goods" page
      And I enter goods details- Details: "Shoes Jeans Jackets"
      When I click on the "Continue" button
      Then I am on "what was overpaid" page
      And I choose customsDuty importVAT anotherTypeofDuty options
      When I click on the "Continue" button
      Then I am on "Customs duty was paid" page
      And I enter customs Duty paid- CustomDuty: "1000.00"
      When I click on the "Continue" button
      Then I am on "Customs duty should have been paid" page
      And I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "750.00"
      When I click on the "Continue" button
      Then I am on "import VAT was paid" page
      And I enter import vat paid- VatPaid: "1500.00"
      When I click on the "Continue" button
      Then I am on "import VAT should have been paid to HMRC" page
      And I enter import vat been Paid to HMRC- VatBeenPaid: "500.00"
      When I click on the "Continue" button
      Then I am on "other customs duty paid" page
      And I enter other custom Duty paid- OtherCustDutyPaid: "1250.00"
      When I click on the "Continue" button
      Then I am on "other duties should have been paid to HMRC" page
      And I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "200.00"
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
      Then I am on "EORI no" page
      And I choose "<YorNeori>" option
      When I click on continue button
      Then I am on "Eori no entry" page
      And I enter "<eoriNo>" in correct format GB
      When I click on the "Continue" button
      Then I am on "are you VAT registered" page
      And I choose "<YorNvat>" option
      When I click on the "Continue" button
      Then I am on "What is your name" page
      And I enter first "<fName>" and last "<lName>"
      When I click on the "Continue" button
      Then I am on "What is your address?" page
      And I enter importers "<postCode>"
      When I click on the "Continue" button
      Then I am on "Select your address" page
      When click on the "Continue" button
      Then I am on "Enter your phone number" page
      And I enter "<phoneNo>" importers
      When I click on the "Continue" button
      Then I am on "Can we contact you by email?" page
      And I choose "<YorNemail>" option and enter "<emailAddress>"
      When I click on the "Continue" button
      Then I am on "Select repayment method" page
      And I choose "<repayment>" option
      When I click on the "Continue" button
      Then I am on "Enter UK bank details" page
      And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
      When I click on the "Continue" button
      Then I am on "Check your answers" page
      When I click on the "Continue" button
      Then I am on "application confirmation" page

    Examples:
      | YorNeori | eoriNo               | YorNvat   | fName     | lName       | postCode  | phoneNo      | YorNemail | emailAddress       | repayment                | aName   | sCode  | accNo      |
      |   yes    | GB123456789123       | yes       | test      | tester      | Bd1 3LY   | 09876543212  |  yes      | test@mail.com      | Bank transfer (Bacs)     | Test    | 987654 | 12345678   |


  Scenario Outline: A user wants to complete a New Multi entry Importers journey
    Given I am on the start page for trader service and select Apply Now
    Then I am on "are you an importer or representative" page
    And I choose Importer claimant type
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
    Then I am on "EORI no" page
    And I choose Yes option
    When I click on continue button
    Then I am on "Eori no entry" page
    And I enter "<eoriNo>" either GB or XI
    When I click on the "Continue" button
    Then I am on "are you VAT registered" page
    And I choose Yes option
    When I click on the "Continue" button
    Then I am on "enter your name" page
    And I enter first "<fName>" and last "<lName>"
    When I click on the "Continue" button
    Then I am on address page
    And I enter importers "<postCode>"
    When I click on the "Continue" button
    Then I am on select your address page
    When click on the "Continue" button
    Then I am on "enter your phone no" page
    And I enter "<phoneNo>" importers
    When I click on the "Continue" button
    Then I am on "contact you by email" page
    And I choose Yes option and enter "<emailAddress>"
    When I click on the "Continue" button
    Then I am on "enter your bank details" page
    And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
    When I click on the "Continue" button
    Then I am on "check your answers" page
    When I click on the "Continue" button
    Then I am on "application confirmation" page

    Examples:
      | entry  | noOfEntries | dateRange| repaymentType | epu | entryNo | applicationReason | reason | goods | customsDuty | customsDutie | vat | vatPaid | cDuty | cDuties | eoriNo | fName | lName | postCode | phoneNo | emailAddress | aName | sCode | accNo |

