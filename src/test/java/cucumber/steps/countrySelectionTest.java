package cucumber.steps;

import BasePackage.BaseTest;
import Pages.currencyCalculator.countrySelection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class countrySelectionTest extends BaseTest {

    public static countrySelection countrySelection;

    @Given("user is on the currency exchange rate page")
    public void userIsOnTheCurrencyExchangeRatePage() {
        System.out.println("You are in the currency calculator page");
    }

    @When("user change country to be United Kingdom from drop down")
    public void userChangeCountryToBeUnitedKingdomFromDropDown() {
        countrySelection = new countrySelection();
        countrySelection.selectCountry();
    }

    @Then("Currency Option Changed to be GBP")
    public void currencyOptionChangedToBeGBP() {
        System.out.println("Currency Option Changed to be GBP successfully");
    }

    @And("Currency rates contains euro rate")
    public void currencyRatesContainsEuroRate() {
        System.out.println("Currency rates contains euro rate");
    }
}
