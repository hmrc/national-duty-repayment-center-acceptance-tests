Feature: Importers Journey
   @suite
  Scenario Outline: VAT Registration
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



    Examples:
      | YorNuploadFile | YorNeori | eoriNo              |
      |      No        | Yes      | GB123456789123      |

  @suite
  Scenario Outline: VAT Registration Importers multi-entry journey

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
    And I click on Help VAT registration link
    And I confirm VAT registration is displayed: "Help with VAT registration You must register your business for VAT with HMRC if its VAT taxable turnover is over the current VAT registration threshold. You can register voluntarily if your turnover is under the threshold, unless everything you sell is exempt."


    Examples:
      | noOfEntries| YorNuploadFile | YorNeori | eoriNo              |
      | 8          |      No        | Yes      | GB123456789123      |

