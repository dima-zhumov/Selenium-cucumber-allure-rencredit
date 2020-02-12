package com.aplana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {
    @FindBy(xpath = "//div[@class='service__title']")
    public List<WebElement> mainMenuList;


    public void selectMainMenu(List<WebElement> list, String name) {
        for (WebElement element : list) {
            if (element.getText().contains(name)){
                element.click();
                return;
            }
        }
    }
}
