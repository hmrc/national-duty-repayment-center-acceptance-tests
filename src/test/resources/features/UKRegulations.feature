Feature: UK Regulations scenarios
  @suite
  Scenario Outline: A user wants to complete a New Importers journey with UK regulations
    Given I am on the start page for trader service and select Apply Now
    Then I am on "Are you the importer or their representative? - National Duty Repayment Centre - GOV.UK" page
    And I choose Importer claimant type
    When I click on the "Continue" button
    Then I am on "How many entries do you want to submit? - National Duty Repayment Centre - GOV.UK" page
    And I choose one entry
    When I click on the "Continue" button
    Then I am on "What was the entry acceptance date? - National Duty Repayment Centre - GOV.UK" page
    And I choose a date Range from Jan this year
    When I click on the "Continue" button
    Then I am on "Why are you applying for this repayment? - National Duty Repayment Centre - GOV.UK" page
    And I choose a regulation repayment Type
    When I click on the "Continue" button
    Then I am on "Entry details - National Duty Repayment Centre - GOV.UK" page
    And I enter declaration details- EPU: "345" and Entry No: "123456t"
    And I enter entryDate- Day: "08", Month: "12" and Year: "2019"
    When I click on the "Continue" button
    Then I am on "What does your application relate to? - National Duty Repayment Centre - GOV.UK" page
    And I choose an application Reason
    When I click on the "Continue" button
    Then I am on "Reason for overpayment - National Duty Repayment Centre - GOV.UK" page
    And I enter Reason for overpayment- Reason: "Paid more"
    When I click on the "Continue" button
    Then I am on "Tell us about the goods - National Duty Repayment Centre - GOV.UK" page
    And I enter goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "What do you want to reclaim? - National Duty Repayment Centre - GOV.UK" page
    And I choose customsDuty importVAT anotherTypeofDuty options
    When I click on the "Continue" button
    Then I am on "How much Customs Duty was paid to HMRC? - National Duty Repayment Centre - GOV.UK" page
    And I enter customs Duty paid- CustomDuty: "1000.00"
    When I click on the "Continue" button
    Then I am on "How much Customs Duty should have been paid? - National Duty Repayment Centre - GOV.UK" page
    And I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "750.00"
    When I click on the "Continue" button
    Then I am on "How much import VAT was paid to HMRC? - National Duty Repayment Centre - GOV.UK" page
    And I enter import vat paid- VatPaid: "1500.00"
    When I click on the "Continue" button
    Then I am on "How much import VAT should have been paid? - National Duty Repayment Centre - GOV.UK" page
    And I enter import vat been Paid to HMRC- VatBeenPaid: "500.00"
    When I click on the "Continue" button
    Then I am on "How much was paid in other duties to HMRC? - National Duty Repayment Centre - GOV.UK" page
    And I enter other custom Duty paid- OtherCustDutyPaid: "1250.00"
    When I click on the "Continue" button
    Then I am on "How much should have been paid in other duties? - National Duty Repayment Centre - GOV.UK" page
    And I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "200.00"
    When I click on the "Continue" button
    Then I am on "Repayment amount summary - National Duty Repayment Centre - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Supporting documents - National Duty Repayment Centre - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Upload a file - National Duty Repayment Centre - GOV.UK" page
    When I click on Choose file button and add the "first" file
    When I click on the "Continue" button
    Then I am on "You have uploaded 1 file - National Duty Repayment Centre - GOV.UK" page
    Then I should see first uploaded doc "JPEGImage.jpg" on upload review page
    Then I select "<YorNuploadFile>" to uploading another file
    When I click on the "Continue" button
    Then I am on "Do you have an EORI number? - National Duty Repayment Centre - GOV.UK" page
    And I choose eori "<YorNeori>" option
    When I click on the "Continue" button
    Then I am on "What is your EORI number? - National Duty Repayment Centre - GOV.UK" page
    And I enter "<eoriNo>" in correct format GB
    When I click on the "Continue" button
    Then I am on "Are you VAT registered? - National Duty Repayment Centre - GOV.UK" page
    And I choose "<YorNvat>" option
    When I click on the "Continue" button
    Then I am on "What is your name - National Duty Repayment Centre - GOV.UK" page
    And I enter first "<fName>" and last "<lName>"
    When I click on the "Continue" button
    Then I am on "What is your address? - National Duty Repayment Centre - GOV.UK" page
    And I select "Enter address Manually" option
    Then I am on "Enter your address - National Duty Repayment Centre - GOV.UK" page
    And I enter address manually Address Line: "<addLine>", City: "<city>", County: "<county>", PostCode: "<postCode>" and Country: "<country>"
    When I click on the "Continue" button
    Then I am on "Enter your phone number - National Duty Repayment Centre - GOV.UK" page
    And I enter "<phoneNo>" importers
    When I click on the "Continue" button
    Then I am on "Can we contact you by email? - National Duty Repayment Centre - GOV.UK" page
    And I choose "<YorNemail>" option and enter "<emailAddress>"
    When I click on the "Continue" button
    Then I am on "Select repayment method - National Duty Repayment Centre - GOV.UK" page
    And I chooose "<repayment>" option
    When I click on the "Continue" button
    Then I am on "Enter UK bank details - National Duty Repayment Centre - GOV.UK" page
    And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - National Duty Repayment Centre - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - National Duty Repayment Centre - GOV.UK" page

    Examples:
      |YorNuploadFile | YorNeori | eoriNo               | YorNvat   | fName     | lName       | addLine               | city      | county         | postCode  | country                  | phoneNo      | YorNemail | emailAddress       | repayment                | aName   | sCode  | accNo      |
      |No             |   Yes    | GB123456789123       | Yes       | test      | tester      | 38 Piccadilly Street  | Bradford  | West Yorkshire | BD1 3LY   | United Kingdom           | 09876543212  |  Yes      | test@mail.com      | Bank transfer (Bacs)     | Test    | 987654 | 12345678   |
