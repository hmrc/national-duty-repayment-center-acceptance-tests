Feature: Amend case Journey QA
  @qa
  Scenario Outline: A user wants to Amend a case
    Given I am on the start page for trader service and select Amend Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter valid Application "<referenceNoDoesNotExist>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose both send more supporting documents and give further information
    When I click on the "Continue" button
    Then I am on "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    When I click the file continue button
    Then I am on "Add more information to your application - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter further goods details- Details: "'Shoes Jeans Jackets'"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button

    Then I am on "Application not found - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on enter the application number again
    Then I am on "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    Then I clear the reference no field
    And I enter valid Application "<referenceNo>"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button

    Then I am on "Information sent - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I click the What did you think of this service? link
    Then I am on "Give feedback - GOV.UK" page


    Examples:
    | referenceNo               |  referenceNoDoesNotExist  |
    | NDRC21052618650YFLZNMV2   |  NDRC21052618646XZ66E666  |