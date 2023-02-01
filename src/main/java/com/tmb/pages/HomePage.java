package com.tmb.pages;

import com.tmb.driver.DriverManager;
import com.tmb.pages.pagecomponents.FooterMenuComponent;
import com.tmb.pages.pagecomponents.MainMenuComponent;

public class HomePage {

    //HomePage has MainMenu --> composition
    //HomePageTest IS A Test --> inheritance

    private MainMenuComponent mainMenuComponent;
    private FooterMenuComponent footerMenuComponent;
    public HomePage()
    {
        mainMenuComponent = new MainMenuComponent();
        footerMenuComponent = new FooterMenuComponent();

    }


    public String getHomePageTitle()
    {
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnAdmin()
    {
        mainMenuComponent.clickAdmin("Admin link");
    }

    public String getFooterText(){
        return footerMenuComponent.getFooterLabel();
    }
}
