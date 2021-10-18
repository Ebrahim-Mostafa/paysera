package tests.currencyCalculator;

import BasePackage.BaseTest;
import Pages.currencyCalculator.filters;
import Pages.currencyCalculator.lossAmount;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class filtersTest extends BaseTest {

    private static filters filters;

    @BeforeClass
    public void initialization() {
        filters = new filters();
    }

    @Test(priority = 4)
    public void setFilters(){
        filters.checkFilters();
    }
}