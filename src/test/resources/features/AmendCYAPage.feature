Feature: Amend case CYA Page
  @suite

  Scenario Outline: A user wants to change an answer via the CYA page - Amend case
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
    And I enter further goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    Then I verify correct data items is displayed
    Then I verify correct responses is displayed for Amend case journey "<referenceNo>", "<responseType>", "<responseToHMRC>" and "<docsUploaded>"

    #change Reference No
    When I click on change option on the amend review page for reference no
    Then I am on "What is the application reference number? - Apply for repayment of import duty and import VAT - GOV.UK" page
    Then I clear the reference no field
    And I enter valid Application "<changeReferenceNo>"
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    Then I verify correct responses is displayed for Amend case journey "<changeReferenceNo>", "<responseType>", "<responseToHMRC>" and "<docsUploaded>"

    #change Response type
    When I click on change option on the amend review page for response type
    Then I am on "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK" page
    #unselecting supporting documents
    And I choose send more supporting documents
    When I click on the "Continue" button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    Then I verify correct responses is displayed for Amend case journey "<changeReferenceNo>", "<changeResType>", "<responseToHMRC>"

    When I click on change option on the amend review page for response type
    Then I am on "What do you need to do? - Apply for repayment of import duty and import VAT - GOV.UK" page
    #unselecting further information
    And I choose both send more supporting documents and give further information
    When I click on the "Continue" button
    Then I am on "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "first" file
    And I wait for the file to be uploaded
    Then I should see first uploaded doc "JPEGImage.jpg" on upload page
    When I click the file continue button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    Then I verify correct responses is displayed for Amend case journey "<changeReferenceNo>", "<changeRespType>", "<docsUploaded>"

    #change Documents
    When I click on change option on the amend review page for documents uploaded
    Then I am on "Upload your additional documents - Apply for repayment of import duty and import VAT - GOV.UK" page
    When I click on Choose file button and add the "second" file
    And I wait for the file to be uploaded
    Then I should see second uploaded doc "VA Plan v0.3.xlsx" on upload page
    When I click the file continue button
    Then I am on "Check your answers before sending your information - Apply for repayment of import duty and import VAT - GOV.UK" page
    Then I verify correct responses is displayed for Amend case journey "<changeReferenceNo>", "<changeRespType>", "<changeDocsUploaded>"

    When I click on the "Continue" button
    Then I am on "Information sent - Apply for repayment of import duty and import VAT - GOV.UK" page


    Examples:
      | referenceNo               |  responseType                               | responseToHMRC       | docsUploaded                   | changeReferenceNo       | changeResToHMRC                         | changeResType                   | changeRespType                 | changeDocsUploaded                   |
      | NDRC2105261863OL4K3WXR2   |  Send additional Documents and Information  | Shoes Jeans Jackets  | JPEGImage.jpg                  | NDRC21052618646XZ66EBX6 | Shoes Jeans JacketsShoes Jeans Jackets  | Send additional Information     | Send additional Documents      | JPEGImage.jpg\nVA Plan v0.3.xlsx      |
