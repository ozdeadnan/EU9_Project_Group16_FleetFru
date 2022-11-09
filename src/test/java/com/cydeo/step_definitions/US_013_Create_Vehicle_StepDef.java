package com.cydeo.step_definitions;

import com.cydeo.pages.FleetVehiclesPages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class US_013_Create_Vehicle_StepDef {

    FleetVehiclesPages fleet_vehiclesPages =new FleetVehiclesPages();
    Actions action = new Actions(Driver.getDriver());

    @When("The user should see Dashboard")
    public void the_user_should_see_dashboard() throws InterruptedException {

        Thread.sleep(5000);

        Assert.assertEquals("Dashboard",Driver.getDriver().getTitle());
    }
    @When("The user hovers over Fleet")
    public void the_user_hovers_over_fleet() throws InterruptedException {

        action.moveToElement(fleet_vehiclesPages.FleetDropdownMenu).perform();

        Thread.sleep(10000);


    }
    @When("The user clicks Vehicles")
    public void the_user_clicks_vehicles() throws InterruptedException {


        fleet_vehiclesPages.VehiclesButton.click();

        Thread.sleep(20000);

    }
    @Then("Create Car button shouldn't be displayed")
    public void create_car_button_shouldn_t_be_displayed() {

        //Assert.assertTrue(!fleet_vehicles.CreateCarButton.isDisplayed());
        //Assert.assertEquals(false,fleet_vehicles.CreateCarButton.isDisplayed());
        try {
           fleet_vehiclesPages.CreateCarButton.isDisplayed();
            Assert.assertTrue(false);
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }


    }

    @Then("Create Car button should be displayed")
    public void create_car_button_should_be_displayed() {
        Assert.assertTrue(fleet_vehiclesPages.CreateCarButton.isDisplayed());
    }

    @When("The user clicks Create Car Button")
    public void the_user_clicks_create_car_button() throws InterruptedException {

        fleet_vehiclesPages.CreateCarButton.click();
        Thread.sleep(5000);

    }
    @Then("The user should see Create Car Page")
    public void the_user_should_see_create_car_page() {

        Assert.assertEquals("Create Car - Entities - System - Car - Entities - System",Driver.getDriver().getTitle());

    }


}
