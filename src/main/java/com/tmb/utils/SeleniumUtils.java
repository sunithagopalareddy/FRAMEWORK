package com.tmb.utils;

import com.tmb.config.ConfigFactory;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitType;
import com.tmb.reports.ExtentLogger;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

        private SeleniumUtils(){}

         public static void click(By by, String elementName) {
             WebElement element =  waitUntilElementPresent(by);
             element.click();
             ExtentLogger.pass(elementName +" clicked");
         }

         public static void click(By by, WaitType waitType,String elementName )
         {
             WebElement element = null;
             if(waitType == WaitType.PRESENCE)
             {
                 element =  waitUntilElementPresent(by);

             }
             else if (waitType == WaitType.CLICKABLE)
             {
                   element =  waitUntilElementToBeClickable(by);
             }
             element.click();
             ExtentLogger.pass(elementName + " clicked succesfully");
         }
         public static void sendKeys(By by, String value,String elementName)
         {
             WebElement element = waitUntilElementPresent(by);
             element.sendKeys(value);
             ExtentLogger.pass(elementName +" entered successfully");

         }


    private static WebElement waitUntilElementPresent(By by)
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    private static WebElement waitUntilElementToBeClickable(By by)
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
