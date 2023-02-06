package com.tmb.tests;


import com.tmb.annotations.FrameworkAnnotations;
import com.tmb.driver.DriverManager;

import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentManager;
import org.testng.Assert;

import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {



    @FrameworkAnnotations
    @Test(description = "validate the title of login page")
    public void validateLoginPageTitle()
    {
        // ExtentManager.getExtentTest().assignAuthor("Sunitha").assignCategory("Smoke Test").assignCategory("Regression Test");
        Assert.assertEquals(DriverManager.getDriver().getTitle(),"OrangeHRMr");
        ExtentLogger.pass("tiltle validation is done");

    }
}



