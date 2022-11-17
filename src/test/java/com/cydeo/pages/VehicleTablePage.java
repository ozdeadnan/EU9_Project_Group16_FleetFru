package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleTablePage extends BasePage{

    public VehicleTablePage () { PageFactory.initElements(Driver.getDriver(), this); }

   // @FindBy(xpath = "//div[@class='oro-datagrid']")
    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-126890420\"]/div[2]/div[2]/div[2]/div/table/thead/tr/th[2]/a/span[1]")
    public static WebElement validPage;

    @FindBy(xpath = "//label[@class='dib'][2]")
    public static WebElement totalPageNum;

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement next;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement previous;




    @FindBy(xpath = "//label[@class='dib'][3]")
    public WebElement totalRecordings;

    @FindBy(xpath = "//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']")
    public WebElement export;

    @FindBy(xpath = "//a[@title='CSV']")
    public WebElement csvBtn;

    @FindBy(xpath = "//a[@title='XLSX']")
    public WebElement xlsBtn;

//caner

}
