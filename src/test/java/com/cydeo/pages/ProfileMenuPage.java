package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileMenuPage {

    public ProfileMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a/text()")
    public WebElement profileMenu;

    @FindBy(id = "user-menu")
    public WebElement userMenu;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutButton;

}


