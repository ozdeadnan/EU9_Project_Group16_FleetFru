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

    @FindBy(xpath = "//a[.='...'][1]")
    public WebElement threeDots;

    @FindBy(xpath = "//i[@class='fa-trash-o hide-text']")
    public WebElement trashBin;



    //*[@id="grid-custom-entity-grid-130660246"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[21]/div/div/ul/li/ul/li[3]/a/i


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

    @FindBy(xpath = "//tr[@class='grid-row row-click-action'][2]")
    public WebElement carRow;

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
