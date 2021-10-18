package cucumber.steps;

import BasePackage.BaseTest;
import Pages.currencyCalculator.currencyConversion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class currencyConversionTest extends BaseTest {

    public static currencyConversion currencyConversion;

    @Given("user is on the currency conversion page")
    public void userIsOnTheCurrencyConversionPage() {
        System.out.println("You are in the calculator page");
    }

    @When("user fill the sell amount box")
    public void userFillTheSellAmountBox() {
        currencyConversion = new currencyConversion();
        currencyConversion.fillSellBox();
    }

    @Then("^Buy amount box will be empty")
    public void buy_amount_box_will_be_empty() {
        System.out.println("Buy Box Input field is empty");
    }

    @And("user fill the buy amount box")
    public void userFillTheBuyAmountBox() {
        currencyConversion = new currencyConversion();
        currencyConversion.fillBuyBox();
    }

    @Then("^Sell amount box will be empty")
    public void sell_amount_box_will_be_empty() {
        System.out.println("Sell Box Input field is empty");
    }
}