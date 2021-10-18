Feature: Test When user selects country rates must be updated and currency option should be changed to the respective country

  Scenario: Change Country from footer
  The user should be able to view the country drop down list
    Given user is on the currency exchange rate page
    When user change country to be United Kingdom from drop down
    Then Currency Option Changed to be GBP
    And Currency rates contains euro rate