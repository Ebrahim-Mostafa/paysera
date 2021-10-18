package Pages.currencyCalculator;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import Utilities.TimeUtils;
import org.openqa.selenium.WebElement;

public class currencyConversion extends BasePage {


    public void fillSellBox() {

        WebElement sellTextBox = ObjectRepositoryJsonParser.getObjectLocator("$.currencyCalculator.sellTextBox");
        TimeUtils.explicitWait(sellTextBox, 10);
        //Clear Sell Box
        elementClear(sellTextBox);
        //Fill Sell Box
        elementSendKeys(sellTextBox, "200");
        //Check Buy Box is Empty
        WebElement buyTextBoxEmpty = ObjectRepositoryJsonParser.getObjectLocator("$.currencyCalculator.buyTextBoxEmpty");
        String textInsideBuyBox = buyTextBoxEmpty.getAttribute("value");
        if (textInsideBuyBox.isEmpty()) {
            System.out.println("Buy Box Input field is empty");
        }
    }

    public void fillBuyBox() {

        WebElement buyTextBoxEmpty = ObjectRepositoryJsonParser.getObjectLocator("$.currencyCalculator.buyTextBoxEmpty");
        //Clear Buy Box
        elementClear(buyTextBoxEmpty);
        //Fill Buy Box
        elementSendKeys(buyTextBoxEmpty, "300");
        //Check Sell Box is Empty
        WebElement sellTextBoxEmpty = ObjectRepositoryJsonParser.getObjectLocator("$.currencyCalculator.sellTextBoxEmpty");
        String textInsideBuyBox = sellTextBoxEmpty.getAttribute("value");
        if (textInsideBuyBox.isEmpty()) {
            System.out.println("Sell Box Input field is empty");
        }
    }
}