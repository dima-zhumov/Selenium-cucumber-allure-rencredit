package com.aplana.pages;

import com.aplana.steps.BasePageSteps;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(BasePageSteps.getDriver(),this);
    }


}
