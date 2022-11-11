package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEventPage  extends BasePage{

    public AddEventPage(){ PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(xpath = "//span[contains(text(),'Fleet')and@class = 'title title-level-1']")
    public WebElement FleetDropdownMenu;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement VehiclesButton;

    @FindBy(xpath = "(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Location'])[1]")
    public WebElement vehiclesRow1;

    @FindBy(xpath = "//span[text()='General Information']")
    public WebElement generalInformationHeader;

    @FindBy(xpath = "//a[@title='Add an event to this record']")
    public WebElement addEventButton;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement addEventCloseButton;
    @FindBy(className = "ui-dialog")
    public WebElement addEventPopUp;

    @FindBy(xpath = "//span[@id='ui-id-4']")
    public WebElement addEventPopUpHeader;





    public void loginAsUserType(String userType){
        LoginPage loginPage = new LoginPage();

        String password = "";
        String username = "";

        if (userType.equals("Driver")) {
            username = ConfigurationReader.getProperty("driver.username");
            password = ConfigurationReader.getProperty("driver.pw");
        }
        else if (userType.equals("Sales Manager")) {
            username = ConfigurationReader.getProperty("salesManager.username");
            password = ConfigurationReader.getProperty("salesManager.pw");
        }
        else if (userType.equals("Store Manager")) {
            username = ConfigurationReader.getProperty("storeManager.username");
            password = ConfigurationReader.getProperty("storeManager.pw");
        }

        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.logInButton.click();
    }



}
