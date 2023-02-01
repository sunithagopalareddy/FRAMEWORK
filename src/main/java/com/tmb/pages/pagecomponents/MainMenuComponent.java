package com.tmb.pages.pagecomponents;


import org.openqa.selenium.By;

import static com.tmb.utils.SeleniumUtils.*;

public class MainMenuComponent {

    By lnkAdmin = By.xpath("//span[text()='Admin']");

    public void clickAdmin( String elementName)
    {
        click(lnkAdmin, elementName);
    }
}
