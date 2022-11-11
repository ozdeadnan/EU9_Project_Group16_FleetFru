package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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



    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-695393704\"]/div[1]/div/span/div[3]/div[2]/div/div[1]/button")
    public static WebElement DriverFilterButton;











}
