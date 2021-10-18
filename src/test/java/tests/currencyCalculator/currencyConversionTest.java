package tests.currencyCalculator;

import BasePackage.BaseTest;
import Pages.currencyCalculator.currencyConversion;
import Pages.currencyCalculator.lossAmount;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class currencyConversionTest extends BaseTest {

    private static currencyConversion currencyConversion;

    @BeforeClass
    public void initialization() {
        currencyConversion = new currencyConversion();
    }


    @Test(priority = 1)
    public void amountBoxes() {
        currencyConversion.fillSellBox();
        currencyConversion.fillBuyBox();
    }
}