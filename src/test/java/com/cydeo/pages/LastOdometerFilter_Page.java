package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LastOdometerFilter_Page {
    public LastOdometerFilter_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa-filter hide-text']/..")
    public WebElement filtersButton;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "//input[@value='LastOdometer']")
    public WebElement lastOdometerButton;

    @FindBy(xpath = "//div[@style='display: inline-block;']")
    public WebElement lastOdometerButtonAssertion;

    @FindBy(xpath = "//div[@style='display: inline-block;']")
    public WebElement lastOdometerAllButton;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement lastOdometerAllFirstButton;

    @FindBy(xpath = "//a[@class='dropdown-item choice-value']")
    public WebElement methods;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[1]")
    public WebElement between;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[2]")
    public WebElement notBetween;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[3]")
    public WebElement equals;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[4]")
    public WebElement notEquals;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[5]")
    public WebElement moreThan;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[6]")
    public WebElement lessThan;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[7]")
    public WebElement equalsOrMoreThan;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[8]")
    public WebElement equalsOrLessThan;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[9]")
    public WebElement isEmpty;

    @FindBy(xpath = "(//a[@class='dropdown-item choice-value'])[10]")
    public WebElement isNotEmpty;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement firstValue;

    @FindBy(xpath = "//input[@name='value_end']")
    public WebElement endValue;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle']")
    public WebElement secondSearchButton;

    @FindBy(xpath = "//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-LastOdometer']")
    public WebElement betweenSearchResults;




}


