package com.tmb.driver;

import com.tmb.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public final class Driver {

private Driver(){}
    private static WebDriver driver;
    //common for all the tests. when we run tests in sequence there is no problem
    // but when we run in parallel with more than one thread, it wont work.
    //ThreadLocal is the solution - it helps to create objects that are read and write by same thread.

    public static void initDriver()
    {
        String browser = ConfigFactory.getConfig().browser();
        if(DriverManager.getDriver()==null) {
            driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }
    }


    public static void quitDriver()
    {

        if(DriverManager.getDriver()!=null)
        {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
