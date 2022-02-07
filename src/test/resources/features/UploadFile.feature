Feature: Upload supporting files
  @suite
  Scenario: Upload supporting files scenarios
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
    And I enter an entry date of 12/12/2020
    When I click on the "Continue" button
    Then I am on "Why did the overpayment happen? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose an article Type
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
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I see an error message "This file has already been uploaded"
    #upload mutliple files
    When I click on Choose file button and add the "second" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    And I should see second uploaded doc "VA Plan v0.3.xlsx" on upload page


  @suite
  Scenario Outline: Upload supporting files scenarios - Amend case journey
    Given I am on the start page for trader service and select Amend Now
    When I click on the "Continue" button
    Then I am on "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter valid Application "<referenceNo>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose send more supporting documents
    When I click on the "Continue" button
    Then I am on "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    #file error duplicate file upload
    Then I am on "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I see an error message "This file has already been uploaded"
    #upload mutliple files
    When I click on Choose file button and add the "second" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    Then I should see second uploaded doc "VA Plan v0.3.xlsx" on upload page


    Examples:
      | referenceNo             |
      | NDRC2104261385QBULEC4B5 |