package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCarPages extends BasePage {

public DeleteCarPages(){

    PageFactory.initElements(Driver.getDriver(),this);


}
    @FindBy(xpath = "//span[contains(text(),'Fleet')and@class = 'title title-level-1']")
    public WebElement FleetDropdownMenu;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesButton;


    @FindBy(xpath = "//div[@class='dropdown']")
    public WebElement threeDots;

    ////a[.='...'])[1]
    @FindBy(xpath = "//i[@class='fa-trash-o hide-text']")
    public WebElement trashBin;

    //i[@class='fa-trash-o hide-text']


    @FindBy(xpath = "//div[@class='modal oro-modal-danger in']")
    public WebElement DeleteConfPopup;

    @FindBy(xpath = "//a[.='Yes, Delete']")
    public WebElement DeleteYes;


    @FindBy(xpath = "//h3[.='Delete Confirmation']")
    public WebElement deleteConfMsg;

    @FindBy(xpath = "//div[@class='flash-messages-holder']")
    public WebElement itemDeletedMsg;

    //text=Item deleted

    @FindBy(xpath = "//div[@class='flash-messages-holder']")
    public WebElement noPermissionMsg;

    //text=You do not have permission to perform this action.
    //You do not have permission to perform this action.

    @FindBy(xpath = "(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Location'])[1]")
    public WebElement carRow;

    ////tr[@class='grid-row row-click-action'][2]
    @FindBy(xpath = "//a[@title='Delete Car']")
    public WebElement deleteCarBtn;


    @FindBy(xpath = "//div[@class='modal oro-modal-danger in']")
    public WebElement DeleteConfMsgBox2;

    @FindBy(xpath = "//h3[.='Delete Confirmation']")
    public WebElement deleteConfMsg2;

    @FindBy(xpath = "//div[@class='flash-messages-holder']")
    public WebElement carDeletedMsg;


    //text=Car deleted

}
