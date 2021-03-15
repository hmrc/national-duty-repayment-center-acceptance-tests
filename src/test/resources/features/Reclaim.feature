Feature: Reclaim Dynamic content scenarios
  @suite
  Scenario: Reclaim single entry journey help text
    Given I am on the start page for trader service and select Apply Now
    Then I am on "Are you the importer or their representative? - National Duty Repayment Centre - GOV.UK" page
    And I choose Importer claimant type
    When I click on the "Continue" button
    Then I am on "How many entries do you want to submit? - National Duty Repayment Centre - GOV.UK" page
    And I choose one entry
    When I click on the "Continue" button
    Then I am on "What was the entry acceptance date? - National Duty Repayment Centre - GOV.UK" page
    And I choose a date Range on or before Dec
    When I click on the "Continue" button
    Then I am on "Why are you applying for this repayment? - National Duty Repayment Centre - GOV.UK" page
    And I choose a repayment Type
    When I click on the "Continue" button
    Then I am on "Entry details - National Duty Repayment Centre - GOV.UK" page
    And I enter declaration details- EPU: "345" and Entry No: "123456t"
    And I enter entryDate- Day: "08", Month: "12" and Year: "2019"
    When I click on the "Continue" button
    Then I am on "What does your application relate to? - National Duty Repayment Centre - GOV.UK" page
    And I choose an application Reason
    When I click on the "Continue" button
    Then I am on "Tell us why the overpayment happened - National Duty Repayment Centre - GOV.UK" page
    And I enter goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "What do you want to reclaim? - National Duty Repayment Centre - GOV.UK" page
    And I choose customsDuty importVAT anotherTypeofDuty options
    When I click on the "Continue" button
    Then I am on "Customs Duty overpayment - National Duty Repayment Centre - GOV.UK" page
    And Hint text is displayed "Enter the amount of Customs Duty that was paid to HMRC, and the amount you think should have been paid. Do not include any agent fees."
    And I enter customs Duty paid- CustomDuty: "100000.00"
    And I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "750.00"
    When I click on the "Continue" button
    Then I am on "Import VAT overpayment - National Duty Repayment Centre - GOV.UK" page
    And Hint text is displayed "Enter the amount of Customs Duty that was paid to HMRC, and the amount you think should have been paid. Do not include any agent fees."
    And I enter import vat paid- VatPaid: "9999999.00"
    And I enter import vat been Paid to HMRC- VatBeenPaid: "500.00"
    When I click on the "Continue" button
    Then I am on "Overpayment of other duties - National Duty Repayment Centre - GOV.UK" page
    And Hint text is displayed "Enter the amount of Customs Duty that was paid to HMRC, and the amount you think should have been paid. Do not include any agent fees."
    And I enter other custom Duty paid- OtherCustDutyPaid: "1250.00"
    And I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "200.00"
    When I click on the "Continue" button
    Then I am on "Repayment amount summary - National Duty Repayment Centre - GOV.UK" page

  @suite
  Scenario: Reclaim multi entry journey help text
    Given I am on the start page for trader service and select Apply Now
    Then I am on "Are you the importer or their representative? - National Duty Repayment Centre - GOV.UK" page
    And I choose Importer claimant type
    When I click on the "Continue" button
    Then I am on "How many entries do you want to submit? - National Duty Repayment Centre - GOV.UK" page
    And I choose one entry
    When I click on the "Continue" button
    Then I am on "What was the entry acceptance date? - National Duty Repayment Centre - GOV.UK" page
    And I choose a date Range on or before Dec
    When I click on the "Continue" button
    Then I am on "Why are you applying for this repayment? - National Duty Repayment Centre - GOV.UK" page
    And I choose a repayment Type
    When I click on the "Continue" button
    Then I am on "Entry details - National Duty Repayment Centre - GOV.UK" page
    And I enter declaration details- EPU: "345" and Entry No: "123456t"
    And I enter entryDate- Day: "08", Month: "12" and Year: "2019"
    When I click on the "Continue" button
    Then I am on "What does your application relate to? - National Duty Repayment Centre - GOV.UK" page
    And I choose an application Reason
    When I click on the "Continue" button
    Then I am on "Tell us why the overpayment happened - National Duty Repayment Centre - GOV.UK" page
    And I enter goods details- Details: "Shoes Jeans Jackets"
    When I click on the "Continue" button
    Then I am on "What do you want to reclaim? - National Duty Repayment Centre - GOV.UK" page
    And I choose customsDuty importVAT anotherTypeofDuty options
    When I click on the "Continue" button
    Then I am on "Customs Duty overpayment - National Duty Repayment Centre - GOV.UK" page
    And Hint text is displayed "Enter the amount of Customs Duty that was paid to HMRC, and the amount you think should have been paid. Do not include any agent fees."
    And I enter customs Duty paid- CustomDuty: "100000.00"
    And I enter customs Duty should have paid to HMRC- CustomsDutyBeenPaid: "750.00"
    When I click on the "Continue" button
    Then I am on "Import VAT overpayment - National Duty Repayment Centre - GOV.UK" page
    And Hint text is displayed "Enter the amount of Customs Duty that was paid to HMRC, and the amount you think should have been paid. Do not include any agent fees."
    And I enter import vat paid- VatPaid: "9999999.00"
    And I enter import vat been Paid to HMRC- VatBeenPaid: "500.00"
    When I click on the "Continue" button
    Then I am on "Overpayment of other duties - National Duty Repayment Centre - GOV.UK" page
    And Hint text is displayed "Enter the amount of Customs Duty that was paid to HMRC, and the amount you think should have been paid. Do not include any agent fees."
    And I enter other custom Duty paid- OtherCustDutyPaid: "1250.00"
    And I enter other custom Duty been paid to HMRC- OtherCustDutyBeenPaid: "200.00"
    When I click on the "Continue" button
    Then I am on "Repayment amount summary - National Duty Repayment Centre - GOV.UK" page