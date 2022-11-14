package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    public WebElement popUpCloseButton;
    @FindBy(xpath = "//div[contains(@style,'position: absolute; width: 1000px;')]")
    public WebElement addEventPopUp;

    @FindBy(id = "ui-id-6")
    public WebElement startAddEventPopup;

    @FindBy(xpath = "//span[@id='ui-id-4']")
    public WebElement addEventPopUpHeader;

    @FindBy(xpath = "//span[@title='#51B749']")
    public WebElement  colorButton;

    @FindBy(name = "oro_calendar_event_form[allDay]")
    public WebElement alldayCheckBox;

    @FindBy(xpath = "//div[@class='control-group start control-group-datetime']")
    public WebElement startDate;

    @FindBy(xpath = "//div[@class='control-group end control-group-datetime']")
    public WebElement endDate;

    @FindBy(xpath = "time_selector_oro_calendar_event_form_end-uid-636feb57f22e1")
    public WebElement timeOne;

    @FindBy(xpath = "//input[@placeholder='time']")
    public List<WebElement> a;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public  WebElement repeatCheckbox;

    @FindBy(xpath = "//select[@data-name='recurrence-repeats']")
    public  WebElement repeatsDropDown;

    @FindBy(xpath = "(//div[@class='control-group'])[8]//input[@type='radio']")
    public  List<WebElement> endingOptions;

    @FindBy(xpath = "(//div[@class='control-group'])[8]//span[@class='recurrence-subview-control__text']")
    public  List<WebElement> endingText;

    @FindBy(xpath = "(//div[@class='controls'])[23]//input")
    public WebElement titleInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='list-item']")
    public WebElement eventList;



















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
