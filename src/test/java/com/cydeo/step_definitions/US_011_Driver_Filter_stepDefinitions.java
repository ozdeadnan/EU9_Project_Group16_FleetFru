package com.cydeo.step_definitions;

import com.cydeo.pages.US_011_Driver_Filter_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US_011_Driver_Filter_stepDefinitions {

    Actions actions = new Actions(Driver.getDriver());
   US_011_Driver_Filter_Page us_011_driver_filter_page = new US_011_Driver_Filter_Page();


    @When("The user should see {string} menu")
    public void the_user_should_see_menu(String string) throws InterruptedException {


        Thread.sleep(5000);
        Assert.assertEquals(string,Driver.getDriver().getTitle());

    }
    @When("User hover over on fleet menu and click vehicles")
    public void user_hover_over_on_fleet_menu_and_click_vehicles() throws InterruptedException {
        actions.moveToElement(us_011_driver_filter_page.FleetModule).perform();
        us_011_driver_filter_page.VehicleButton.click();
        Thread.sleep(15000);

    }
    @When("User click manage filters button and select driver")
    public void user_click_manage_filters_button_and_select_driver() throws InterruptedException {
        us_011_driver_filter_page.FilterIconButton.click();
        Thread.sleep(3000);
        us_011_driver_filter_page.ManageFilterButton.click();
        Thread.sleep(3000);
        us_011_driver_filter_page.DriverCheckBox.click();
        Thread.sleep(3000);
        us_011_driver_filter_page.DriverCheckBox.isSelected();


    }

}
