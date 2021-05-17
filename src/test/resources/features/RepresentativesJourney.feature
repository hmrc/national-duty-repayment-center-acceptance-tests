Feature: Representatives Journey
  @suite
  Scenario Outline: A user wants to complete a New Representatives journey
      Given I am on the start page for trader service and select Apply Now
      Then I Accept cookies and hide message
      When I click on the "Continue" button
      Then I am on "Are you the importer or their representative? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose Representative claimant type
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
      Then I am on "Entry details - Apply for repayment of import duty and import VAT - GOV.UK" page
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
      And I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "750.00"
      When I click on the "Continue" button
      Then I am on "Import VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter import vat paid- VatPaid: "1500.00"
      And I enter import vat been Paid to HMRC- VatBeenPaid: "500.00"
      When I click on the "Continue" button
      Then I am on "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter other custom Duty paid- OtherCustDutyPaid: "1250.00"
      And I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "200.00"
      When I click on the "Continue" button
      Then I am on "Repayment amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on the "Continue" button
      Then I am on "Supporting documents - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on the "Continue" button
      Then I am on "Upload a file - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on Choose file button and add the "first" file
      When I click on the "Continue" button
      Then I am on "You have uploaded 1 file - Apply for repayment of import duty and import VAT - GOV.UK" page
      Then I should see first uploaded doc "JPEGImage.jpg" on upload review page
      Then I select "<YorNuploadFile>" to uploading another file
      When I click on the "Continue" button
      Then I am on "Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose eori "<YorNeori>" option
      When I click on the "Continue" button
      Then I am on "What is the importer's EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter "<eoriNo>" in correct format GB
      When I click on the "Continue" button
      Then I am on "Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose "<YorNvat>" option
      When I click on the "Continue" button
      Then I am on "What is the importer's name? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter first "<fName>" and last "<lName>"
      When I click on the "Continue" button
      Then I am on "What is the importer's address? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I select "Enter address Manually" option
      Then I am on "Enter the importer's address - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter address manually Address Line: "<addLine>", City: "<city>", County: "<county>", PostCode: "<postCode>" and Country: "<country>"
      When I click on the "Continue" button
      Then I am on "Do you have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose eori "<YorNeori>" option
      When I click on the "Continue" button
      Then I am on "What is your EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter "<agentEoriNo>" in correct format GB
      When I click on the "Continue" button
      Then I am on "What is your name - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter first "<agentFName>" and last "<agentLName>"
      When I click on the "Continue" button
      Then I am on "What is your business address? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I select "Enter address Manually" option
      Then I am on "Enter your business address - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter address manually Address Line: "<agentaddLine>", City: "<agentcity>", County: "<agentcounty>", PostCode: "<agentpostCode>" and Country: "<agentcountry>"
      When I click on the "Continue" button
      Then I am on "How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I select email option
      And I enter "<emailAddress>"
      And I select phone no option
      And I enter "<phoneNo>" importers
      When I click on the "Continue" button
      Then I am on "Do you want to create a declarant reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose "<YorNDeclarantRefNO>" options
      And I enter to create "<declarantRefNo>"
      When I click on the "Continue" button
      Then I am on "Select repayment method - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I chooose "<repayment>" option
      When I click on the "Continue" button
      Then I am on "Who is to be repaid? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose Representative option
      When I click on the "Continue" button
      Then I am on "Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I choose "<yOrNoIndirectRep>" indirect representative option
      When I click on the "Continue" button
      Then I am on "Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on Choose file button and add the "next" file
      When I click on the "Continue" button
      Then I am on "Enter UK bank details - Apply for repayment of import duty and import VAT - GOV.UK" page
      And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
      When I click on the "Continue" button
      Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
      When I click on the "Continue" button
      Then I am on "Information sent - Apply for repayment of import duty and import VAT - GOV.UK" page

    Examples:
      |YorNuploadFile | YorNeori    | eoriNo           | YorNvat | fName     | lName         | addLine        | city            | county        | postCode   | country         | agentEoriNo        | agentFName | agentLName | agentaddLine  | agentcity    | agentcounty    | agentpostCode  | agentcountry    | phoneNo       |  emailAddress     | repayment             | YorNDeclarantRefNO  | declarantRefNo | yOrNoIndirectRep | aName    | sCode       | accNo         |
      | No            |    Yes      | GB123456789123   | Yes     | test      | importer      | 23 Ludgatehill | Manchester      | Lancashire    |  M239SA    | United Kingdom  | GB123456789123001  | test       | agent      | 2 Piccadilly  | Bradford     | Yorkshire      | BD232AJ        | United Kingdom  | 09876543212   |  test@gmail.com   | Bank transfer (Bacs)  |  Yes                | 123abcxyz      |     No           | test     | 987890      | 98712356      |

  @suite @accessibility @ZAP
  Scenario Outline: A user wants to complete a New Multi entry Representatives journey
    Given I am on the start page for trader service and select Apply Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "Are you the importer or their representative? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Representative claimant type
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
    Then I am on "Upload the multiple entries spreadsheet - Apply for repayment of import duty and import VAT - GOV.UK" page
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
    And I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "750.00"
    When I click on the "Continue" button
    Then I am on "Import VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter import vat paid- VatPaid: "1500.00"
    And I enter import vat been Paid to HMRC- VatBeenPaid: "500.00"
    When I click on the "Continue" button
    Then I am on "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter other custom Duty paid- OtherCustDutyPaid: "1250.00"
    And I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "200.00"
    When I click on the "Continue" button
    Then I am on "Repayment amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Supporting documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Upload a file - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    When I click on the "Continue" button
    Then I am on "You have uploaded 1 file - Apply for repayment of import duty and import VAT - GOV.UK" page
    Then I should see first uploaded doc "JPEGImage.jpg" on upload review page
    Then I select "<YorNuploadFile>" to uploading another file
    When I click on the "Continue" button
    Then I am on "Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose eori "<YorNeori>" option
    When I click on the "Continue" button
    Then I am on "What is the importer's EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter "<eoriNo>" in correct format GB
    When I click on the "Continue" button
    Then I am on "Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<YorNvat>" option
    When I click on the "Continue" button
    Then I am on "What is the importer's name? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter first "<fName>" and last "<lName>"
    When I click on the "Continue" button
    Then I am on "What is the importer's address? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I select "Enter address Manually" option
    Then I am on "Enter the importer's address - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter address manually Address Line: "<addLine>", City: "<city>", County: "<county>", PostCode: "<postCode>" and Country: "<country>"
    When I click on the "Continue" button
    Then I am on "Do you have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose eori "<YorNeori>" option
    When I click on the "Continue" button
    Then I am on "What is your EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter "<agentEoriNo>" in correct format GB
    When I click on the "Continue" button
    Then I am on "What is your name - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter first "<agentFName>" and last "<agentLName>"
    When I click on the "Continue" button
    Then I am on "What is your business address? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I select "Enter address Manually" option
    Then I am on "Enter your business address - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter address manually Address Line: "<agentaddLine>", City: "<agentcity>", County: "<agentcounty>", PostCode: "<agentpostCode>" and Country: "<agentcountry>"
    When I click on the "Continue" button
    Then I am on "How can we contact you? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I select email option
    And I enter "<emailAddress>"
    And I select phone no option
    And I enter "<phoneNo>" importers
    When I click on the "Continue" button
    Then I am on "Do you want to create a declarant reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<YorNDeclarantRefNO>" options
    And I enter to create "<declarantRefNo>"
    When I click on the "Continue" button
    Then I am on "Who is to be repaid? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Representative option
    When I click on the "Continue" button
    Then I am on "Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<yOrNoIndirectRep>" indirect representative option
    When I click on the "Continue" button
    Then I am on "Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "next" file
    When I click on the "Continue" button
    Then I am on "Enter UK bank details - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - Apply for repayment of import duty and import VAT - GOV.UK" page

    Examples:
      | noOfEntries |YorNuploadFile | YorNeori    | eoriNo           | YorNvat | fName     | lName         | addLine        | city            | county        | postCode   | country         | agentEoriNo        | agentFName | agentLName | agentaddLine  | agentcity    | agentcounty    | agentpostCode  | agentcountry    | phoneNo       |  emailAddress    | YorNDeclarantRefNO  | declarantRefNo | yOrNoIndirectRep | aName    | sCode       | accNo         |
      |9            | No            |    Yes      | GB123456789123   | Yes     |test      | importer      | 23 Ludgatehill | Manchester      | Lancashire    |  M239SA    | United Kingdom  | GB123456789123001  | test       | agent      | 2 Piccadilly  | Bradford     | Yorkshire      | BD232AJ        | United Kingdom  | 09876543212    |  test@gmail.com  |  Yes                |  123abcxyz     |       No         | test     | 987890      | 98712356      |
