package Pages.currencyCalculator;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class lossAmount extends BasePage {

    SoftAssert softAssert = new SoftAssert();

    public void checkLossAmount() {

        //Check Paysera Exchange Amount is Displayed
        WebElement payseraAmount = ObjectRepositoryJsonParser.getObjectLocator("$.exchangeRate.payseraAmount");
        String payseraAmountText = payseraAmount.getText();
        double payseraAmountNum = Double.parseDouble(payseraAmountText);
        System.out.println("Paysera Exchange Amount: " + payseraAmountNum);

        //Check Bank Exchange Amount is Displayed
        WebElement bankAmount = ObjectRepositoryJsonParser.getObjectLocator("$.exchangeRate.bankAmount");
        String bankAmountText = bankAmount.getText();
        double bankAmountNum = Double.parseDouble(bankAmountText);
        System.out.println("Bank Exchange Amount: " + bankAmountNum);

        //Check Loss Amount is Displayed when bank exchange amount is lower than the amount provided by Paysera
        if (bankAmountNum < payseraAmountNum) {
            WebElement lossAmount = ObjectRepositoryJsonParser.getObjectLocator("$.exchangeRate.lossAmount");
            elementIsDisplayed(lossAmount);
            String lossAmountText = lossAmount.getText();
            lossAmountText = lossAmountText.replaceAll("[\\[\\](){}]", "");
            double lossAmountNum = Double.parseDouble(lossAmountText);
            System.out.println("The Loss Amount is: " + lossAmountNum);

            //Check that the difference is correct and equal the loss amount displayed in the system
            double differAmount = bankAmountNum - payseraAmountNum;
            String differAmountText = String.format("%.2f", differAmount);
            softAssert.assertEquals(differAmountText, lossAmountText, "The Loss Amount difference isn't correct");

        } else {
            System.out.println("No loss");
        }
        softAssert.assertAll();
    }
}