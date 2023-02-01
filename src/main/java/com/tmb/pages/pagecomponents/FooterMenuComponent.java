package com.tmb.pages.pagecomponents;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public class FooterMenuComponent {

    private  By labelFooterMessage = By.xpath("//div[@class=\"oxd-layout-footer\"]/p[1]");

    public String getFooterLabel()
    {
        return DriverManager.getDriver().findElement(labelFooterMessage).getText();

    }
}
