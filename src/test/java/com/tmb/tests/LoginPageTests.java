package com.tmb.tests;


import com.tmb.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest{
    @DataProvider
    public Object [][] getData()
    {
        return new Object[][]{
                {"Admin","admin123","OrangeHRM"}
        };

    }
   /* @Test(description = "To check whether title of orangehrm homepage",dataProvider = "getData")
    public void titleValidationTest(String username, String password, String expectedTitle) {
        LoginPage loginPage = new LoginPage();
        String actualTitle =loginPage.loginToApplication(username,password).getHomePageTitle();


        Assert.assertEquals(actualTitle, expectedTitle);

    }*/
   @Test(description = "To check whether title of orangehrm homepage",dataProvider = "getData")
   public void titleValidationTest(String username, String password, String expectedTitle) {
       LoginPage loginPage = new LoginPage();
       String actualTitle =loginPage.loginToApplication(username,password).getHomePageTitle();


       Assert.assertEquals(actualTitle, expectedTitle);

   }

}
