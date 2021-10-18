Feature: Test when user click on "filter" and "clear filter" buttons

  Scenario: Filter functionality
  The user should be able to make filter using filter button

    Given user is on the exchange rate page
    When user select buy Currency Sign to be USD from drop down
    And user click on filter button
    Then first exchange rate in the table is USD
    And user click on clear filter button
    Then first exchange rate return to euro again after clear all filters