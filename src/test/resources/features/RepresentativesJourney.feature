@suite
Feature: Representatives Journey

  Scenario Outline: A user wants to complete a New Representatives journey
    Given I am on the start page for trader service and select Apply Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Representative claimant type
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
    Then I am on "Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose eori "<YorNeori>" option
    When I click on the "Continue" button
    Then I am on "What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter "<eoriNo>" in correct format GB
    When I click on the "Continue" button
    Then I am on "Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<YorNvat>" option
    When I click on the "Continue" button
    Then I am on "Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter "<impName>" name in rep journey
    When I click on the "Continue" button
#   ALF Stubbing
    Then I am on "Your details - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter your "<declarantName>" and business "<businessName>"
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
    And I choose "<repayment>" repayment option
    When I click on the "Continue" button
    Then I am on "Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Representative option
    When I click on the "Continue" button
    Then I am on "Are you an indirect representative of the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<yOrNoIndirectRep>" indirect representative option
    When I click on the "Continue" button
    Then I am on "Upload proof of authority - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "next" file
    When I click on the file upload continue button
    Then I am on "Enter your bank details - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Application complete - Apply for repayment of import duty and import VAT - GOV.UK" page

    Examples:
      | YorNeori | eoriNo         | YorNvat | impName       | declarantName  | businessName | phoneNo     | emailAddress   | repayment            | YorNDeclarantRefNO | declarantRefNo | yOrNoIndirectRep | aName    | sCode  | accNo    |
      | Yes      | GB123456789123 | Yes     | test importer | test declarant | test agent   | 09876543212 | test@gmail.com | Bank transfer (Bacs) | Yes                | 123abcxyz      | No               | Megacorp | 207106 | 86563611 |

  @ZAP
  Scenario Outline: A user wants to complete a New Multi entry Representatives journey
    Given I am on the start page for trader service and select Apply Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "Are you the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Representative claimant type
    When I click on the "Continue" button
    Then I am on "How many entries do you want to submit? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose multi entry
    And I enter "<noOfEntries>" value
    When I click on the "Continue" button
    Then I am on "Enter the details of the oldest entry - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter declaration details- EPU: "345" and Entry No: "123456t"
    And I enter an entry date that was 7 days ago
    When I click on the "Continue" button
    Then I am on "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose a regulation repayment Type
    When I click on the "Continue" button
    Then I am on "Upload your document with multiple entries - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "second" file
    When I click on the file upload continue button
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
    Then I am on "Does the importer have an EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose eori "<YorNeori>" option
    When I click on the "Continue" button
    Then I am on "What is the importer’s EORI number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter "<eoriNo>" in correct format GB
    When I click on the "Continue" button
    Then I am on "Is the importer VAT registered? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose "<YorNvat>" option
    When I click on the "Continue" button
    Then I am on "Who is the importer? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter "<impName>" name in rep journey
    When I click on the "Continue" button
#   ALF Stubbing
    Then I am on "Your details - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter your "<declarantName>" and business "<businessName>"
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
    Then I am on "Who do you want HMRC to repay? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose Importer option
    When I click on the "Continue" button
    Then I am on "Enter the importer’s bank details - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter account "<aName>" and sortcode "<sCode>" and account number "<accNo>"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Application complete - Apply for repayment of import duty and import VAT - GOV.UK" page

    Examples:
      | noOfEntries | YorNeori | eoriNo         | YorNvat | impName       | declarantName  | businessName | phoneNo     | emailAddress   | YorNDeclarantRefNO | declarantRefNo | aName    | sCode  | accNo    |
      | 9           | Yes      | GB123456789123 | Yes     | test importer | test declarant | test agent   | 09876543212 | test@gmail.com | Yes                | 123abcxyz      | Megacorp | 207106 | 86563611 |
