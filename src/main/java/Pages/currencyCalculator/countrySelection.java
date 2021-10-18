package Pages.currencyCalculator;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import Utilities.TimeUtils;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class countrySelection extends BasePage {

    SoftAssert softAssert = new SoftAssert();

    public void selectCountry() {

        //Change country to be United Kingdom
        WebElement countryButton = ObjectRepositoryJsonParser.getObjectLocator("$.countrySelection.countryButton");
        elementClick(countryButton);
        WebElement countryDropDown = ObjectRepositoryJsonParser.getObjectLocator("$.countrySelection.countryDropDown");
        elementClick(countryDropDown);
        WebElement ukCountry = ObjectRepositoryJsonParser.getObjectLocator("$.countrySelection.ukCountry");
        elementClick(ukCountry);
        getPageCurrentURL();
        softAssert.assertTrue(getPageCurrentURL().contains("GB"), "Country not change");

        //Check Currency Option Changed to be GBP
        WebElement currencySellSign = ObjectRepositoryJsonParser.getObjectLocator("$.countrySelection.currencySellSign");
        elementIsDisplayed(currencySellSign);
        String sellSymbol = currencySellSign.getText();
        System.out.println("Currency Option changed to be: " + sellSymbol);
        softAssert.assertEquals(sellSymbol, "GBP", "Currency Options not changed");

        //Check Currency rate contains euro rate or not
        WebElement euroCurrency = ObjectRepositoryJsonParser.getObjectLocator("$.countrySelection.euroCurrency");
        elementIsDisplayed(euroCurrency);
        String euroSign = euroCurrency.getText();
        System.out.println("First rate will be: " + euroSign);
        softAssert.assertEquals(euroSign, "EUR (Euro)", "Currency Rate not Changed");

        softAssert.assertAll();
    }
}