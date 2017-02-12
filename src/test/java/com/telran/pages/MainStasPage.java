package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Sample page
 */
public class MainStasPage extends Page {

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement header;

  @FindBy(id="login")
  public WebElement loginField;

  @FindBy(id="pass")
  public WebElement passField;

  @FindBy(id="button")
  public WebElement loginButton;

  public MainStasPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  //methods
  //vvodit text v loginfield
  public void fillLoginField(String text){
    setElementText(loginField, text);
   }
  //vvodit text v password
  public void fillPassField(String text){
    setElementText(passField, text);
  }
  //press on the button
  public void clickOnLoginButton() {
    clickElement(loginButton);
  }



}
