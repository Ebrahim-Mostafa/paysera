Feature: Test when user fills "BUY" amount, "SELL" amount box is being emptied and vice versa

  Scenario: Currency Conversion Calculator Page
  The user should be able to fills "BUY" amount, "SELL" amount box
    Given user is on the currency conversion page
    When user fill the sell amount box
    Then Buy amount box will be empty
    And user fill the buy amount box
    Then Sell amount box will be empty