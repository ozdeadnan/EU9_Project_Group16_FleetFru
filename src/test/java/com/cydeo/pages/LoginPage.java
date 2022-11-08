package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement submitButton;


    @FindBy(css = ".oro-subtitle")
    public WebElement header;

    @FindBy(xpath = "//div[text()='Invalid user name or password.']")
    public WebElement alertMessage;

    @FindBy(xpath = "//h2[@class='title']")
    public WebElement loginPageHeader;

    @FindBy(linkText ="Forgot your password?")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//h2[@class='title']")
    public  WebElement forgotHeader;

    @FindBy(css = ".custom-checkbox__text")
    public WebElement rememberText;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberCheckbox;



}
