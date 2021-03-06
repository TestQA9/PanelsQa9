package com.telran.pages;

import com.telran.LogLog4j;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Sample page
 */
public class LoginIakovV2Page extends Page {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    @FindBy(id = "login")
    WebElement loginField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(id = "button")
    WebElement submitButton;

    public LoginIakovV2Page(WebDriver driver) {
        super(driver);//наследуем от супер-класса
        PageFactory.initElements(driver, this);

    }

    //actions
    public void fillUsername(String text) {
        setElementText(loginField, text);
    }

    public void fillPassword(String text) {
        setElementText(passwordField, text);
    }

    public void clicktoLogin() {
        clickElement(submitButton);
    }

//waits

    public void waitLoginPagetoload() {
        waitUntilIsLoaded(submitButton);
    }

    //verifcations
    public boolean isOnLoginPage() {
        return exists(submitButton);
    }
}
