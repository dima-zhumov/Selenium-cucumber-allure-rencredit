package com.aplana.steps;

import cucumber.api.java.ru.Когда;

public class CucumberSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    DepositPageSteps depositPageSteps = new DepositPageSteps();


    @Когда("^Выбран пункт главного меню (.*)$")
    public void selectMainMenu(String menuItem){
        mainPageSteps.selectMainMenu(menuItem);
    }

    @Когда("^Выбрана валюта вклада (.*)$")
    public void selectDepositCurrency(String menuItem){
        depositPageSteps.selectDepositCurrency(menuItem);
    }

    @Когда("^Заполнена сумма вклада (.*)$")
    public void inputAmountOfDeposit(String amount) {
        depositPageSteps.inputAmountOfDeposit(amount);
    }

    @Когда("^Выбран срок вклада (.*)$")
    public void selectPeriodOfDeposit(String period) {
        depositPageSteps.selectPeriodOfDeposit(period);
    }

    @Когда("^Заполнена сумма ежемесячного пополнения вклада (.*)$")
    public void inputAmountOfEveryMonthPayment(String amount) {
        depositPageSteps.inputAmountOfEveryMonthPayment(amount);
    }

    @Когда("^Отмечена ежемесячная капитализация$")
    public void checkCapitalization() {
        depositPageSteps.selectCapitalization();
    }

    @Когда("^Проверена сумма по истечению срока вклада$")
    public void assertDepositResult(){
        depositPageSteps.assertDepositResult();
    }

    @Когда("^Проверена процентная ставка по вкладу$")
    public void assertDepositRate(){
        depositPageSteps.assertDepositRate();
    }

}
