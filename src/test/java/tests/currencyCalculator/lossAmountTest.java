package tests.currencyCalculator;

import BasePackage.BaseTest;
import Pages.currencyCalculator.currencyConversion;
import Pages.currencyCalculator.lossAmount;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class lossAmountTest extends BaseTest {

    private static lossAmount lossAmount;

    @BeforeClass
    public void initialization() {
        lossAmount = new lossAmount();
    }


    @Test(priority = 2)
    public void lossAmount(){
        lossAmount.checkLossAmount();
    }
}