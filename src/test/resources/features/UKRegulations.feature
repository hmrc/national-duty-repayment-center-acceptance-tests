Feature: UK Regulations scenarios
  @suite
  Scenario Outline: A user wants to complete a New Importers journey with UK regulations
    Given I am on the start page for trader service and select Apply Now
    When I click on the "Continue" button
    Then I am on "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Importer claimant type
    When I click on the "Continue" button
    Then I am on "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose one entry
    When I click on the "Continue" button
    Then I am on "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter declaration details- EPU: "345" and Entry No: "123456t"
    And I enter an entry date that was 7 days ago
    When I click on the "Continue" button
    Then I am on "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose a regulation repayment Type
    When I click on the "Continue" button
    Then I am on "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose an application Reason
    When I click on the "Continue" button
    Then I am on "Give us more details about the overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter goods details- Details: "Shoes Jeans Jackets"
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
    Then I am on "Documents we need from you - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Upload your supporting documentation - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    When I click the file continue button
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
#   ALF Stubbing
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
    And I choose "Current month amendment (CMA)" repayment option
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Application complete - Apply for repayment of import duty and import VAT - GOV.UK" page

    Examples:
      | YorNvat   | fName     | lName       |  YorNgoodsOwner | goodsOwner  | phoneNo      | emailAddress     | YorNDeclarantRefNO  | declarantRefNo  |
      | Yes       | Test      | Importer    | No              | Goods Owner | 09876543212  | test@mail.com    |     Yes             | 123abcxyz       |


  @suite
  Scenario: UK regulations available for entry date 1 Jan 2021
    Given I am on the start page for trader service and select Apply Now
    When I click on the "Continue" button
    Then I am on "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Importer claimant type
    When I click on the "Continue" button
    Then I am on "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose one entry
    When I click on the "Continue" button
    Then I am on "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter declaration details- EPU: "345" and Entry No: "123456t"
    And I enter an entry date of 1/1/2021
    When I click on the "Continue" button
    Then I am on "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose a regulation repayment Type
    When I click on the "Continue" button
    Then I am on "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK" page

  @suite
  Scenario: Customs articles available for entry date pre 1 Jan 2021
    Given I am on the start page for trader service and select Apply Now
    When I click on the "Continue" button
    Then I am on "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Importer claimant type
    When I click on the "Continue" button
    Then I am on "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose one entry
    When I click on the "Continue" button
    Then I am on "Add the details for this entry - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter declaration details- EPU: "345" and Entry No: "123456t"
    And I enter an entry date of 31/12/2020
    When I click on the "Continue" button
    Then I am on "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose an article Type
    When I click on the "Continue" button
    Then I am on "What does your application relate to? - Apply for repayment of import duty and import VAT - GOV.UK" page