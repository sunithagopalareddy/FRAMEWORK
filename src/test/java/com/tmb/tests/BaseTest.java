package com.tmb.tests;


import com.tmb.driver.Driver;
import com.tmb.reports.ExtentReport;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class BaseTest {
    protected WebDriver driver;


    @BeforeMethod
    public void setUp(Method method)
    {

        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown()
    {
        Driver.quitDriver();
    }

}
