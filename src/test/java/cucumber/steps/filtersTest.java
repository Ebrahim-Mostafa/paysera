package cucumber.steps;

import BasePackage.BaseTest;
import Pages.currencyCalculator.filters;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class filtersTest extends BaseTest {
    
    public static filters filters;
    
    @Given("user is on the exchange rate page")
    public void userIsOnTheExchangeRatePage() {
        System.out.println("User is on the exchange rate pag");
    }

    @When("user select buy Currency Sign to be USD from drop down")
    public void userSelectBuyCurrencySignToBeUSDFromDropDown() {
        System.out.println("User select buy Currency Sign to be USD from drop down");
    }

    @And("user click on filter button")
    public void userClickOnFilterButton() {
        filters = new filters();
        filters.checkFilters();
    }

    @Then("first exchange rate in the table is USD")
    public void firstExchangeRateInTheTableIsUSD() {
        System.out.println("First exchange rate in the table is USD");
    }

    @And("user click on clear filter button")
    public void userClickOnClearFilterButton() {
        System.out.println("User click on clear filter button");
    }

    @Then("first exchange rate return to euro again after clear all filters")
    public void firstExchangeRateReturnToEuroAgainAfterClearAllFilters() {
        System.out.println("first exchange rate return to euro again after clear all filters");
    }
}
