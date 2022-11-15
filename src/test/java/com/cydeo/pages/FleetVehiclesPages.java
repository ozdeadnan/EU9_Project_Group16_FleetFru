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

    @FindBy(xpath = "//div[@class='btn-group pull-right open']//ul//li//button")
    public List<WebElement> SavingOptions;

    @FindBy(xpath = "//div[@class='pull-right pinned-dropdown']")
    public WebElement SaveButton;


    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement SaveAndCloseButton;






    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_LicensePlate')]")
    public WebElement LicencePlateInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_Driver')]")
    public WebElement DriverInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_Location')]")
    public WebElement LocationInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_ChassisNumber')]")
    public WebElement ChassisNumberInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_ModelYear')]")
    public WebElement ModelYearInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_LastOdometer')]")
    public WebElement LastOdometerInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_ImmatriculationDate')][@placeholder='Choose a date']")
    public WebElement ImmatriculationDateInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_FirstContractDate')] [@placeholder='Choose a date']")
    public WebElement FirstContractDateInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_CatalogValue')]")
    public WebElement CatalogValueInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_SeatsNumber')]")
    public WebElement SeatsNumberInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_DoorsNumber')]")
    public WebElement DoorsNumberInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_Color')]")
    public WebElement ColorInput;

    @FindBy (xpath = "//div [contains(@id,'custom_entity_type_Transmission')]")
    public WebElement TransmissionDropdown;

    @FindBy (xpath = "//div [contains(@id,'custom_entity_type_FuelType')]")
    public WebElement FuelTypeDropdown;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_CO2Emissions')]")
    public WebElement Co2EmissionsInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_Horsepower-')]")
    public WebElement HorsepowerInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_HorsepowerTaxation')]")
    public WebElement HorsepowerTaxationInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_Power')]")
    public WebElement PowerInput;

    @FindBy (xpath = "//input [contains(@id,'custom_entity_type_Logo')]")
    public WebElement LogoInput;

    @FindBy (xpath = "//span[.='This value is not valid.']")
    public WebElement InvalidValue;

    @FindBy(xpath = "//div[contains(@style,'position: absolute; width: 1000px;')]")
    public WebElement addEventPopUp;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement popUpCloseButton;


    


}
