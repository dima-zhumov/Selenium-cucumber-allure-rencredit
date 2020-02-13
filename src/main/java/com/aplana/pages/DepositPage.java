package com.aplana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepositPage extends BasePage {
    @FindBy(xpath = "//span[@class='calculator__currency-field-text']")
    public List<WebElement> currencyList;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amountOfDeposit;

    @FindBy(xpath = "//div[@class='jq-selectbox__select-text']")
    public WebElement periodOfDepositCurrent;

    @FindBy(xpath = "//div[@class='jq-selectbox__dropdown']//li")
    public List<WebElement> periodOfDepositList;

    @FindBy(xpath = "//input[@name='replenish']")
    public WebElement amountOfEveryMonthPayment;

    @FindBy(xpath = "//input[@name='capitalization']/..")
    public WebElement capitalization;

    @FindBy(xpath = "//input[@name='partial_out']/..")
    public WebElement partial;

    @FindBy(xpath = "//span[@class='js-calc-result']")
    public WebElement depositResult;

    @FindBy(xpath = "//span[@class='js-calc-rate']")
    public WebElement depositRate;

    public void selectCurrency(List<WebElement> list, String name) {
        for (WebElement element : list) {
            if (element.getText().contains(name)){
                element.click();
                return;
            }
        }
    }

    public String getDepositResult(){
        return depositResult.getText();
    }

}
