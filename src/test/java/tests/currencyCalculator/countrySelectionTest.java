package tests.currencyCalculator;

import BasePackage.BaseTest;
import Pages.currencyCalculator.countrySelection;
import Pages.currencyCalculator.lossAmount;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class countrySelectionTest extends BaseTest {

    private static countrySelection countrySelection;

    @BeforeClass
    public void initialization() {
        countrySelection = new countrySelection();
    }


    @Test(priority = 3)
    public void selectCountry(){
        countrySelection.selectCountry();
    }
}