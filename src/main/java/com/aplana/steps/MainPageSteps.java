package com.aplana.steps;

import com.aplana.pages.MainPage;
import io.qameta.allure.Step;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Step("Выбираем пункт главного меню {0}")
    public void selectMainMenu(String menuItem) {
        mainPage.selectMainMenu(mainPage.mainMenuList, menuItem);
    }

}
