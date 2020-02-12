package com.aplana.steps;

import com.aplana.pages.DepositPage;
import com.google.common.base.Function;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.aplana.steps.BasePageSteps.getDriver;

public class DepositPageSteps {
    DepositPage depositPage = new DepositPage();
    WebDriverWait wait = new WebDriverWait(getDriver(), 30);


    @Step("Выбираем валюту вклада")
    public void selectDepositCurrency(String menuItem){
        depositPage.selectCurrency(depositPage.currencyList,menuItem);
    }

    @Step("Заполняем сумму вклада")
    public void inputAmountOfDeposit(String amount){
        String s = depositPage.getDepositResult();
        depositPage.amountOfDeposit.click();
        depositPage.amountOfDeposit.sendKeys(amount);
        wait.until((Function<? super WebDriver, Boolean>) driver -> !(s.equals(depositPage.getDepositResult())));
    }

    @Step("Выбираем срок вклада")
    public void selectPeriodOfDeposit(String period){
        String s = depositPage.getDepositResult();
        depositPage.periodOfDepositCurrent.click();
        depositPage.selectCurrency(depositPage.periodOfDepositList,period);
        wait.until((Function<? super WebDriver, Boolean>) driver -> !(s.equals(depositPage.getDepositResult())));
    }

    @Step("Заполняем сумму ежемесячного пополнения")
    public void inputAmountOfEveryMonthPayment(String amount){
        String s = depositPage.getDepositResult();
        depositPage.amountOfEveryMonthPayment.click();
        depositPage.amountOfEveryMonthPayment.sendKeys(amount);
        wait.until((Function<? super WebDriver, Boolean>) driver -> !(s.equals(depositPage.getDepositResult())));
    }

    @Step("Отмечаем ежемесячную капитализацию")
    public void selectCapitalization(){
        String s = depositPage.getDepositResult();
        depositPage.capitalization.click();
        wait.until((Function<? super WebDriver, Boolean>) driver -> !(s.equals(depositPage.getDepositResult())));
    }

    @Step("Проверяем какая сумма будет по истечению срока вклада")
    public void assertDepositResult(){
        Assert.assertEquals("Результат по сумме вклада не совпадает","561 383,43",depositPage.depositResult.getText());
    }

    @Step("Проверяем процентную ставку по вкладу")
    public void assertDepositRate(){
        Assert.assertEquals("Процентная ставка по вкладу не совпадает","5.35%",depositPage.depositRate.getText());
    }

}
