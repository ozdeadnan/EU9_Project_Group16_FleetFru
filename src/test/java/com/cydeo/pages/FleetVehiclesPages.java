package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetVehiclesPages extends BasePage{

    public FleetVehiclesPages() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//span[contains(text(),'Fleet')and@class = 'title title-level-1']")
    public WebElement FleetDropdownMenu;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement VehiclesButton;

    @FindBy (xpath= "//a[@title='Create Car']")
    public WebElement CreateCarButton;

    //hey ersin

}
