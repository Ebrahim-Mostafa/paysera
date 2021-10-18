package cucumber.steps;

import BasePackage.BaseTest;
import Pages.currencyCalculator.currencyConversion;
import Pages.currencyCalculator.lossAmount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class lossAmountTest extends BaseTest {

    public static lossAmount lossAmount;    

    @Given("^user is on the calculator page$")
    public void user_is_on_the_calculator_page() {
        System.out.println("You are in the calculator page");
    }

    @When("^user fill sell amount box$")
    public void user_fill_sell_amount_box() {
        System.out.println("User will fill sell amount box to view exchane rates");
    }

    @Then("^Paysera Exchange Amount displayed$")
    public void paysera_exchange_amount_displayed() {
        System.out.println("Paysera Exchange Amount displayed");

    }

    @And("^Bank Exchange Amount displayed$")
    public void bank_exchange_amount_displayed() {
        System.out.println("Bank Exchange Amount displayed");
    }

    @Then("^Loss Amount is Displayed when bank exchange amount is lower than the amount provided by Paysera$")
    public void loss_amount_is_displayed_when_bank_exchange_amount_is_lower_than_the_amount_provided_by_paysera() {
        lossAmount = new lossAmount();
        lossAmount.checkLossAmount();
    }
}