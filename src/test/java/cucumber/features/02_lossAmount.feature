Feature: Test Loss Amount is Displayed when bank exchange amount is lower than the amount provided by Paysera

  Scenario: Loss Amount is displayed
  The user should be able to view the exchange rates
    Given user is on the calculator page
    When user fill sell amount box
    Then Paysera Exchange Amount displayed
    And Bank Exchange Amount displayed
    Then Loss Amount is Displayed when bank exchange amount is lower than the amount provided by Paysera