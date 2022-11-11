package com.cydeo.step_definitions;

import com.cydeo.pages.DriverFilterPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US_011_Driver_Filter_stepDefinitions {

    Actions actions = new Actions(Driver.getDriver());
    DriverFilterPage driverFilterPage = new DriverFilterPage();


    @When("The user should see {string} menu")
    public void the_user_should_see_menu(String string) throws InterruptedException {


        driverFilterPage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(string,Driver.getDriver().getTitle());

    }
    @When("User hover over on fleet menu and click vehicles")
    public void user_hover_over_on_fleet_menu_and_click_vehicles() throws InterruptedException {
        actions.moveToElement(DriverFilterPage.FleetDropdownMenu).perform();
        DriverFilterPage.VehiclesButton.click();

        driverFilterPage.waitUntilLoaderScreenDisappear();
    }
    @When("User click manage filters button and select driver")
    public void user_click_manage_filters_button_and_select_driver() throws InterruptedException {
        DriverFilterPage.FilterIconButton.click();
        driverFilterPage.waitUntilLoaderScreenDisappear();
        DriverFilterPage.ManageFilterButton.click();
        driverFilterPage.waitUntilLoaderScreenDisappear();
        DriverFilterPage.DriverCheckBox.click();
        driverFilterPage.waitUntilLoaderScreenDisappear();
        DriverFilterPage.DriverCheckBox.isSelected();


    }

}
