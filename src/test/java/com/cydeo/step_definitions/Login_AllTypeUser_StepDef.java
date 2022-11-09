package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_AllTypeUser_StepDef {
    LoginPage loginPage = new LoginPage();


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login.url"));
    }

    @When("The user logs in as a driver")
    public void the_user_logs_in_as_a_driver() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("driver.username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver.pw"));
        loginPage.logInButton.click();
    }



    @When("The user logs in as a sales manager")
    public void the_user_logs_in_as_a_sales_manager() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("salesManager.username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("salesManager.pw"));
        loginPage.logInButton.click();

    }



    @When("The user logs in as a store manager")
    public void the_user_logs_in_as_a_store_manager() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("storeManager.username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("storeManager.pw"));
        loginPage.logInButton.click();

    }



}