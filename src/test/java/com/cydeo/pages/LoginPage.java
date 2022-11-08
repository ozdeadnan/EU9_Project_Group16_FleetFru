package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() { PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(id = "prependedInput")
    public WebElement userNameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement logInButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement invalidUsernameOrPassword;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public  WebElement  forgotYourPasswordLink;

    @FindBy(xpath = "//span[@class='custom-checkbox__text']")
    public WebElement rememberMeText;

    @FindBy(xpath = "//input[@id='remember_me']")
    public WebElement rememberMeClickable;

    @FindBy(xpath = "//h2[@class='title']")
    public WebElement loginPageText;



}
