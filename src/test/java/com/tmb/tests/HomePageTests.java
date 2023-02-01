package com.tmb.tests;


import com.tmb.driver.DriverManager;

import org.testng.Assert;

import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {




    @Test(description = "validate the title of login page")
    public void validateLoginPageTitle()
    {
        Assert.assertEquals(DriverManager.getDriver().getTitle(),"OrangeHRM");

    }
}
