Feature: Amend case Journey
  @suite
    @accessibility
   # @ZAP
  Scenario Outline: A user wants to Amend a case
    Given I am on the start page for trader service and select Amend Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter valid Application "<referenceNo>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose both send more supporting documents and give further information
    When I click on the "Continue" button
    Then I am on "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    When I click the file continue button
    Then I am on "Give us further information - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter further goods details- Details: "'Shoes Jeans Jackets'"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - Apply for repayment of import duty and import VAT - GOV.UK" page


    Examples:
    | referenceNo               |
    | NDRC21052618650YFLZNMV2   |

  @suite
  Scenario Outline: A user wants to Amend a case to send more supporting documents
    Given I am on the start page for trader service and select Amend Now
    Then I Accept cookies and hide message
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
    When I click the file continue button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - Apply for repayment of import duty and import VAT - GOV.UK" page


    Examples:
      | referenceNo                |
      | NDRC21052618646XZ66EBX6    |

  @suite
  Scenario Outline: A user wants to Amend a case to give further information
    Given I am on the start page for trader service and select Amend Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter valid Application "<referenceNo>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose to provide give further information
    When I click on the "Continue" button
    Then I am on "Give us further information - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter further goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - Apply for repayment of import duty and import VAT - GOV.UK" page


    Examples:
      | referenceNo               |
      | NDRC2105261863OL4K3WXR2   |


  Scenario Outline: A user tries to Amend a closed case
    Given I am on the start page for trader service and select Amend Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter valid Application "<closedCaseReferenceNo>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I choose to provide give further information
    When I click on the "Continue" button
    Then I am on "Give us further information - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I enter further goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "This application is closed - Apply for repayment of import duty and import VAT - GOV.UK" page


    Examples:
      | closedCaseReferenceNo     |
      | NDRC2107162273ZJ5CBE667   |