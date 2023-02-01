package com.tmb.pages;


import com.tmb.enums.WaitType;


import org.openqa.selenium.By;

import static com.tmb.utils.SeleniumUtils.*;

public class LoginPage {

    private static final By TXT_BOX_USERNAME = By.name("username");//100 thread - 100 times ccreates in heap memory- how to overcome? - make it static - so same for all threads -1 copy for all threads

    private static final By TXT_BOX_PASSWORD = By.name("password");

    private static final By BTN_LOGIN = By.xpath("//button[@type='submit']");

    private LoginPage setUserName(String username)
    {
       sendKeys(TXT_BOX_USERNAME, username,"Username");

       return this;
    }

    private LoginPage setPassword(String password)
    {
       sendKeys(TXT_BOX_PASSWORD,password, "Password");

       return this;
    }

    private HomePage clickLogin(){

        click(BTN_LOGIN, WaitType.CLICKABLE, "LoginButton");

        return new HomePage();//page chaining
    }

    public HomePage loginToApplication(String username, String password)
    {
       return setUserName(username).setPassword(password).clickLogin();//method chaining

    }
}
