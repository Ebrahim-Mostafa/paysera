package Pages.currencyCalculator;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import Utilities.TimeUtils;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class filters extends BasePage {

    SoftAssert softAssert = new SoftAssert();

    public void checkFilters() {

        //Click on Buy Currency DropDown
        WebElement currencyBuySign = ObjectRepositoryJsonParser.getObjectLocator("$.filters.currencyBuySign");
        elementClick(currencyBuySign);

        //Change Buy Currency Sign to be USD
        WebElement usdBuyCurrencySign = ObjectRepositoryJsonParser.getObjectLocator("$.filters.usdBuyCurrencySign");
        elementClick(usdBuyCurrencySign);

        //Click on Filter button
        WebElement filterButton = ObjectRepositoryJsonParser.getObjectLocator("$.filters.filterBtn");
        elementClick(filterButton);

        //Check first exchange rate in the table is USD
        TimeUtils.mediumWait();
        WebElement usdCurrency = ObjectRepositoryJsonParser.getObjectLocator("$.filters.usdCurrency");
        String usdSign = usdCurrency.getText();
        System.out.println("First rate will be: " + usdSign);
        softAssert.assertEquals(usdSign, "USD (US Dollar)", "Filter not applied successfully");

        //Click on Clear Filter
        WebElement clearFilterButton = ObjectRepositoryJsonParser.getObjectLocator("$.filters.clearFilterBtn");
        elementClick(clearFilterButton);
        TimeUtils.mediumWait();

        //Check Currency first-rate return to euro again after clear all filters
        WebElement euroCurrency = ObjectRepositoryJsonParser.getObjectLocator("$.countrySelection.euroCurrency");
        elementIsDisplayed(euroCurrency);
        String euroSign = euroCurrency.getText();
        System.out.println("First rate will be: " + euroSign);
        softAssert.assertEquals(euroSign, "EUR (Euro)", "Currency Rate not Changed");

        softAssert.assertAll();
    }
}