Feature: Importers Journey
   @suite
     @accessibility
    @ZAP
  Scenario Outline: A user wants to complete a New Importers journey
    Given I am on the start page for trader service and select Apply Now
      Then I Accept cookies and hide message
      When I click on the "Continue" button
      Then I am on "Are you the importer or their representative? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose Importer claimant type
      When I click on the "Continue" button
      Then I am on "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose one entry
      When I click on the "Continue" button
      Then I am on "What was the entry acceptance date? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose a date Range on or before Dec
      When I click on the "Continue" button
      Then I am on "Why are you applying for this repayment? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose a repayment Type
      When I click on the "Continue" button
      Then I am on "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter declaration details- EPU: "345" and Entry No: "123456t"
      And I enter entryDate- Day: "08", Month: "12" and Year: "2019"
      When I click on the "Continue" button
      Then I am on "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose an application Reason
      When I click on the "Continue" button
      Then I am on "Tell us why the overpayment happened - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter goods details- Details: "'Shoes Jeans Jackets'"
      When I click on the "Continue" button
      Then I am on "What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose customsDuty importVAT anotherTypeofDuty options
      When I click on the "Continue" button
      Then I am on "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter customs Duty paid- CustomDuty: "1000.00"
      And I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "750.00"
      When I click on the "Continue" button
      Then I am on "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter import vat paid- VatPaid: "1500.00"
      And I enter import vat been Paid to HMRC- VatBeenPaid: "500.00"
      When I click on the "Continue" button
      Then I am on "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter other custom Duty paid- OtherCustDutyPaid: "1250.00"
      And I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "200.00"
      When I click on the "Continue" button
      Then I am on "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on the "Continue" button
      Then I am on "Required supporting documents - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on the "Continue" button
      Then I am on "Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on Choose file button and add the "first" file
      And I wait for the file to be uploaded
      Then I should see first uploaded doc "JPEGImage.jpg" on upload page
      When I click the file continue button
      Then I am on "Do you have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose eori "<YorNeori>" option
      When I click on the "Continue" button
      Then I am on "What is your EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter "<eoriNo>" in correct format GB
      When I click on the "Continue" button
      Then I am on "Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose "<YorNvat>" option
      When I click on the "Continue" button
      Then I am on "What is your name? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter first "<fName>" and last "<lName>"
      When I click on the "Continue" button
      Then I am on "Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose "<YorNgoodsOwner>" option to confirm owner of the goods
      When I click on the "Continue" button
      Then I am on "What is your address? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I select "Enter address Manually" option
      Then I am on "Enter your address - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter address manually Address Line: "<addLine>", City: "<city>", County: "<county>", PostCode: "<postCode>" and Country: "<country>"
      When I click on the "Continue" button
      Then I am on "Confirm your address - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on the "Continue" button
      Then I am on "How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I select email option
      And I enter "<emailAddress>"
      And I select phone no option
      And I enter "<phoneNo>" importers
      When I click on the "Continue" button
      Then I am on "Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose "<YorNDeclarantRefNO>" options
      And I enter to create "<declarantRefNo>"
      When I click on the "Continue" button
      Then I am on "Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I chooose "<repayment>" option
      When I click on the "Continue" button
      Then I am on "Enter UK bank details - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
      When I click on the "Continue" button
      Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on the "Continue" button
      Then I am on "Application complete - Apply for repayment of import duty and import VAT - GOV.UK" page

    Examples:
      |YorNuploadFile | YorNeori | eoriNo               | YorNvat   | fName     | lName       | YorNgoodsOwner | addLine               | city      | county         | postCode  | country                  | phoneNo      | emailAddress   |  YorNDeclarantRefNO    |  declarantRefNo  | repayment                | aName   | sCode  | accNo      |
      |No             |   Yes    | GB123456789123       | Yes       | Test      | Importer    |    Yes         |38 Piccadilly Street  | Bradford  | West Yorkshire | BD1 3LY   | United Kingdom           | 09876543212  | test@mail.com  |    Yes                 |  1234abcxyz      | Bank transfer (Bacs)     | Test    | 400530 | 71584685   |

  @suite
  Scenario Outline: A user wants to complete a New Multi entry Importers journey
    Given I am on the start page for trader service and select Apply Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "Are you the importer or their representative? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Importer claimant type
    When I click on the "Continue" button
    Then I am on "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose multi entry
    And I enter "<noOfEntries>" value
    When I click on the "Continue" button
    Then I am on "What was the entry acceptance date? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose a date Range on or before Dec
    When I click on the "Continue" button
    Then I am on "Why are you applying for this repayment? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose a repayment Type
    When I click on the "Continue" button
    Then I am on "Upload the multiple entry document - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "second" file
    When I click on the "Continue" button
    Then I am on "Enter the details of the oldest entry - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter declaration details- EPU: "345" and Entry No: "123456t"
    And I enter entryDate- Day: "08", Month: "12" and Year: "2019"
    When I click on the "Continue" button
    Then I am on "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose an application Reason
    When I click on the "Continue" button
    Then I am on "Tell us why the overpayment happened - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "What do you want to reclaim? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose customsDuty importVAT anotherTypeofDuty options
    When I click on the "Continue" button
    Then I am on "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter customs Duty paid- CustomDuty: "1000.00"
    And I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "0.00"
    When I click on the "Continue" button
    Then I am on "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter import vat paid- VatPaid: "1500.00"
    And I enter import vat been Paid to HMRC- VatBeenPaid: "0.00"
    When I click on the "Continue" button
    Then I am on "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter other custom Duty paid- OtherCustDutyPaid: "1250.00"
    And I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "0.00"
    When I click on the "Continue" button
    Then I am on "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Required supporting documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    When I click the file continue button
    Then I am on "Do you have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose eori "<YorNeori>" option
    When I click on the "Continue" button
    Then I am on "What is your EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter "<eoriNo>" in correct format GB
    When I click on the "Continue" button
    Then I am on "Are you VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<YorNvat>" option
    When I click on the "Continue" button
    Then I am on "What is your name? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter first "<fName>" and last "<lName>"
    When I click on the "Continue" button
    Then I am on "Is Test Importer the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<YorNgoodsOwner>" option to confirm owner of the goods
    When I click on the "Continue" button
    Then I am on "What is the name on the import documents? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter "<goodsOwner>" name
    When I click on the "Continue" button
    Then I am on "What is your address? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I select "Enter address Manually" option
    Then I am on "Enter your address - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter address manually Address Line: "<addLine>", City: "<city>", County: "<county>", PostCode: "<postCode>" and Country: "<country>"
    When I click on the "Continue" button
    Then I am on "Confirm your address - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I select email option
    And I enter "<emailAddress>"
    And I select phone no option
    And I enter "<phoneNo>" importers
    When I click on the "Continue" button
    Then I am on "Do you want to use your own reference? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<YorNDeclarantRefNO>" options
    And I enter to create "<declarantRefNo>"
    When I click on the "Continue" button
    Then I am on "Enter UK bank details - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Application complete - Apply for repayment of import duty and import VAT - GOV.UK" page

    Examples:
     | noOfEntries | YorNuploadFile| YorNeori | eoriNo               | YorNvat   | fName     | lName       | YorNgoodsOwner | goodsOwner | addLine               | city      | county         | postCode  | country        | phoneNo      | emailAddress     | YorNDeclarantRefNO  | declarantRefNo | aName   | sCode  | accNo      |
     |     8       |  No           |  Yes     | GB123456789123       | Yes       | Test      | Importer    |  No            | Goods Owner|52 Rue Des Fleurs      | Paris     |                 | 34092     | France        | 09876543212  | test@mail.com    |    Yes              |  123abcxyz     | Test    | 400530 | 71584685   |
