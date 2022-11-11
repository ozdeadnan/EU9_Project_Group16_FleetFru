package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FleetVehiclesPages extends BasePage{

    public FleetVehiclesPages() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//span[contains(text(),'Fleet')and@class = 'title title-level-1']")
    public WebElement FleetDropdownMenu;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement VehiclesButton;

    @FindBy (xpath= "//a[@title='Create Car']")
    public WebElement CreateCarButton;

    @FindBy (xpath= "//a [@class='btn-success btn dropdown-toggle' ]")
    public WebElement SavingOptionsButton;

    @FindBy(xpath = "(//ul [@class='dropdown-menu' ])[3]")
    public WebElement SavingOptionsDropdownMenu;

    @FindBy(xpath = "// input [@name='custom_entity_type[Driver]']")
    public WebElement DriverInput;

    @FindBy(xpath = "//div[@class='btn-group pull-right open']//ul//li//button")
    public List<WebElement> SavingOptions;


}
