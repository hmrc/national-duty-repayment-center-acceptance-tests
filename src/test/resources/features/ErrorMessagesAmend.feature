Feature: Error Scenarios Amend case Journey
  @suite
  Scenario Outline: Error messages for Amend case journey scenarios
    Given I am on the start page for trader service and select Amend Now
    Then I Accept cookies and hide message
    When I click on the "Continue" button
    Then I am on "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then An error message is displayed- Error: "Enter the reference number"
    And I enter Application "<splCharacterRefNo>" reference no with a special character
    Then An error message is displayed- Error: "The reference number must only include letters a to z and numbers 0 to 9"
    Then I clear the reference no field
    Then I enter wrong format Application "<wrongFormatRefNo>" reference No
    Then An error message is displayed- Error: "Enter the reference number in the right format"
    Then I clear the reference no field
    Then I enter invalid length Application "<invalidLenRefNo>" reference number
    Then An error message is displayed- Error: "The reference number must be 23 characters long"
    Then I clear the reference no field
    And I enter valid Application "<referenceNo>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then An error message is displayed- Error: "Select if you want to send more supporting documents, or give us further information in writing"
    And I choose both send more supporting documents and give further information
    When I click on the "Continue" button
    #upload file error messages in another feature file
    Then I am on "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    When I click the file continue button
    Then I am on "Give us further information - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then An error message is displayed- Error: "Enter the further information"
    And I enter further goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - Apply for repayment of import duty and import VAT - GOV.UK" page


    Examples:
      | referenceNo               | splCharacterRefNo         | wrongFormatRefNo  | invalidLenRefNo     |
      | NDRC2105261863OL4K3WXR2   | NDRC2103151135EE6L6YKH3&* | 103151135EE6L6YKH | NDRC2103151135EE6L6 |
