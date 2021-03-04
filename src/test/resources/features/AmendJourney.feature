Feature: Amend case Journey
  @suite
  #  @accessibility
  #  @ZAP
  Scenario Outline: A user wants to Amend a case
    Given I am on the start page for trader service and select Amend Now
    Then I am on "What is the reference number? - National Duty Repayment Centre - GOV.UK" page
    And I enter valid Application "<referenceNo>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - National Duty Repayment Centre - GOV.UK" page
    And I choose both send more supporting documents and give further information
    When I click on the "Continue" button
    Then I am on "Upload a file - National Duty Repayment Centre - GOV.UK" page
    When I click on Choose file button and add the "first" file
    When I click on the "Continue" button
    Then I am on "You have uploaded 1 file - National Duty Repayment Centre - GOV.UK" page
    Then I should see first uploaded doc "JPEGImage.jpg" on upload review page
    Then I select "<YorNuploadFile>" to uploading another file
    When I click on the "Continue" button
    Then I am on "Give us further information - National Duty Repayment Centre - GOV.UK" page
    And I enter further goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - National Duty Repayment Centre - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - National Duty Repayment Centre - GOV.UK" page


    Examples:
    | referenceNo               | YorNuploadFile |
    | NDRC210304971XG8WJSPBP4   | No             |

  @suite
  Scenario Outline: A user wants to Amend a case to send more supporting documents
    Given I am on the start page for trader service and select Amend Now
    Then I am on "What is the reference number? - National Duty Repayment Centre - GOV.UK" page
    And I enter valid Application "<referenceNo>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - National Duty Repayment Centre - GOV.UK" page
    And I choose send more supporting documents
    When I click on the "Continue" button
    Then I am on "Upload a file - National Duty Repayment Centre - GOV.UK" page
    When I click on Choose file button and add the "first" file
    When I click on the "Continue" button
    Then I am on "You have uploaded 1 file - National Duty Repayment Centre - GOV.UK" page
    Then I should see first uploaded doc "JPEGImage.jpg" on upload review page
    Then I select "<YorNuploadFile>" to uploading another file
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - National Duty Repayment Centre - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - National Duty Repayment Centre - GOV.UK" page


    Examples:
      | referenceNo                | YorNuploadFile |
      | NDRC210304971XG8WJSPBP4   | No             |

  @suite
  Scenario Outline: A user wants to Amend a case to give further information
    Given I am on the start page for trader service and select Amend Now
    Then I am on "What is the reference number? - National Duty Repayment Centre - GOV.UK" page
    And I enter valid Application "<referenceNo>"
    When I click on the "Continue" button
    Then I am on "What do you need to do? - National Duty Repayment Centre - GOV.UK" page
    And I choose to provide give further information
    When I click on the "Continue" button
    Then I am on "Give us further information - National Duty Repayment Centre - GOV.UK" page
    And I enter further goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your application - National Duty Repayment Centre - GOV.UK" page
    When I click on the "Continue" button
    Then I am on "Information sent - National Duty Repayment Centre - GOV.UK" page


    Examples:
      | referenceNo               |
      | NDRC210304971XG8WJSPBP4   |
