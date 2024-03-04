Feature: Repayment Amount Summary Page
  @suite
  Scenario: A user wants to complete a New Importers journey
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
    #change Customs Duty
    Then I verify reclaim options is displayed
    And I click on change option on customs duty was paid
    Then I am on "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I clear amount and enter customs Duty paid- CustomDuty: "7000.00"
    When I click on the "Continue" button
    Then I am on "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I verify changed customs duty paid- CustomDuty: "£7000.00" is displayed

    And I click on change option on customs duty should have paid
    Then I am on "Customs Duty overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I clear amount and enter customs Duty should have paid- CustomsDutyBeenPaid: "3300.00"
    When I click on the "Continue" button
    Then I am on "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I verify changed customs duty should have paid- CustomDuty: "£3300.00" is displayed
    #change Import VAT
    And I click on change option on import vat was paid
    Then I am on "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I clear amount and enter import vat paid- VatPaid: "9000.00"
    When I click on the "Continue" button
    Then I am on "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I verify changed import vat paid- VatPaid: "£9000.00" is displayed

    And I click on change option on import vat should have paid
    Then I am on "VAT overpayment - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I clear amount and enter import vat been Paid to HMRC- VatBeenPaid: "4000.00"
    When I click on the "Continue" button
    Then I am on "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I verify changed import vat been Paid to HMRC- VatBeenPaid: "£4000.00" is displayed
    #change Other Duty
    And I click on change option on other duty was paid
    Then I am on "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I clear amount and enter other duty paid- OtherDutyPaid: "100000.00"
    When I click on the "Continue" button
    Then I am on "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I verify changed other duty paid- OtherDutyPaid: "£100000.00" is displayed

    And I click on change option on other duty should have paid
    Then I am on "Overpayment of other duties - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I clear amount and enter other duty should have paid- OtherDutyBeenPaid: "2000.00"
    When I click on the "Continue" button
    Then I am on "Return amount summary - Apply for repayment of import duty and import VAT - GOV.UK" page
    And I verify changed other duty paid- OtherDutyBeenPaid: "£2000.00" is displayed
    When I click on the "Continue" button


