package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DriverFilterPage extends BasePage {

    public DriverFilterPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//span[contains(text(),'Fleet')and@class = 'title title-level-1']")
    public static WebElement FleetDropdownMenu;

    @FindBy(xpath = "//span[.='Vehicles']")
    public static WebElement VehiclesButton;

    @FindBy (xpath = "//a[@class='action btn mode-icon-only']")
    public static WebElement FilterIconButton;

    @FindBy(xpath = "//a[@class=\"add-filter-button\"]")
    public static WebElement ManageFilterButton;


    @FindBy(xpath = "//*[@id='ui-multiselect-0-0-option-2']")
    public static WebElement DriverCheckBox;



    @FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public static WebElement DriverFilterButton;


    @FindBy(xpath =  "//a[normalize-space()='contains']")
    public static WebElement ContainsFilterButton;


    @FindBy(xpath =  "//a[normalize-space()='does not contain']")
    public static WebElement DoesNotContainFilterButton;


    @FindBy(xpath =  "//a[normalize-space()='starts with']")
    public static WebElement StartswithFilterButton;


    @FindBy(xpath =  "//a[normalize-space()='ends with']")
    public static WebElement EndsWithFilterButton;


    @FindBy(xpath =  "//a[normalize-space()='is equal to']")
    public static WebElement IsEqualToFilterButton;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public static WebElement FilterDropdownButton;

    @FindBy(css = ".filter-criteria.dropdown-menu a")
    public List<WebElement> DriverFilterOptions;

    @FindBy(xpath = "//input[@name=\"value\"]")
    public WebElement DriverFilterInput;

    @FindBy(css = ".grid-body-cell-Driver")
    public List<WebElement> ContainsButton;




















}
