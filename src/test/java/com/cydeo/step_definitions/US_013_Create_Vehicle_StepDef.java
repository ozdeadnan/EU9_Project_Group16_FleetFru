package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.FleetVehiclesPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.Text;

import java.util.List;

public class  US_013_Create_Vehicle_StepDef {

    FleetVehiclesPages fleet_vehiclesPages =new FleetVehiclesPages();
    Actions action = new Actions(Driver.getDriver());

    @When("The user should see Dashboard")
    public void the_user_should_see_dashboard() throws InterruptedException {

        fleet_vehiclesPages.waitLoadingBar();

        Assert.assertEquals("Dashboard",Driver.getDriver().getTitle());
    }
    @When("The user hovers over Fleet")
    public void the_user_hovers_over_fleet() throws InterruptedException {

        BrowserUtils.waitFor(3);
        action.moveToElement(fleet_vehiclesPages.FleetDropdownMenu).perform();





        fleet_vehiclesPages.waitUntilLoaderScreenDisappear();

        try {
            fleet_vehiclesPages.addEventPopUp.isDisplayed();
            BrowserUtils.waitForClickablility(fleet_vehiclesPages.popUpCloseButton, 10);
            fleet_vehiclesPages.popUpCloseButton.click();

            action.moveToElement(fleet_vehiclesPages.FleetDropdownMenu).perform();


        } catch (Exception e) {
            action.moveToElement(fleet_vehiclesPages.FleetDropdownMenu).perform();
      




    }
    @When("The user clicks Vehicles")
    public void the_user_clicks_vehicles() throws InterruptedException {


        fleet_vehiclesPages.VehiclesButton.click();

        fleet_vehiclesPages.waitUntilLoaderScreenDisappear();
        fleet_vehiclesPages.waitLoadingBar();

    }
    @Then("Create Car button shouldn't be displayed")
    public void create_car_button_shouldn_t_be_displayed() {

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
       fleet_vehiclesPages.waitUntilLoaderScreenDisappear();

    }
    @Then("The user should see Create Car Page")
    public void the_user_should_see_create_car_page() {

        Assert.assertEquals("Create Car - Entities - System - Car - Entities - System",Driver.getDriver().getTitle());

    }


    @When("The user clicks saving options button")
    public void the_user_clicks_saving_options_button() throws InterruptedException {

        fleet_vehiclesPages.SavingOptionsButton.click();

        Thread.sleep(10000);

    }
    @When("User should see below info in saving options dropdown")
    public void user_should_see_below_info_in_saving_options_dropdown(List<String> expectedOptions) throws InterruptedException {


        List<WebElement> actualoptions= fleet_vehiclesPages.SavingOptions;

        Assert.assertEquals(expectedOptions.get(0), actualoptions.get(0).getText());
        Assert.assertEquals(expectedOptions.get(1), actualoptions.get(1).getText());
        Assert.assertEquals(expectedOptions.get(2), actualoptions.get(2).getText());

        actualoptions.forEach(i->System.out.println(i.getText()));
        System.out.println("expectedOptions = " + expectedOptions);


    }
    @When("The user clicks save option")
    public void the_user_clicks_save_option() {

    }
    @Then("User should see Entity Saved message  after successful saving")
    public void user_should_see_entity_saved_message_after_successful_saving() {

    }




    @Then("User should see below info in tags checkBoxes")
    public void user_should_see_below_info_in_tags_check_boxes(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }






    @Then("User should see {string} in {string}")
    public void user_should_see_in(String string, String string2) {

           //   fleet_vehiclesPages.DriverInput.sendKeys("a1");
           //   System.out.println("fleet_vehiclesPages.DriverInput.getText() = " + fleet_vehiclesPages.DriverInput.getText());

           //   String alphaNumerical="text";
           //   String numerical="number";

           //    Assert.assertEquals(fleet_vehiclesPages.LicencePlateInput.getAttribute("type"),alphaNumerical);

           //   if (string=="LicensePlate"){
           //   fleet_vehiclesPages.LicencePlateInput.sendKeys("a1");
           //   }


            switch (string){
                case "LicensePlate": case "ChassisNumber":
                    fleet_vehiclesPages.LicencePlateInput.sendKeys("a1");
                    fleet_vehiclesPages.ChassisNumberInput.sendKeys("a1");
                case "Driver": case "Location":  case "Color":
                    fleet_vehiclesPages.DriverInput.sendKeys("a");
                    fleet_vehiclesPages.LocationInput.sendKeys("a");
                    fleet_vehiclesPages.ColorInput.sendKeys("a");
                case "ModelYear": case "LastOdometer": case "CatalogValue":case "SeatNumber":case "DoorsNumber":case "Co2Emission":case "Horsepower":case "HorsepowerTaxation":case "Power":
                    fleet_vehiclesPages.ModelYearInput.sendKeys("1");
                    fleet_vehiclesPages.LastOdometerInput.sendKeys("1");
                    fleet_vehiclesPages.CatalogValueInput.sendKeys("1");
                    fleet_vehiclesPages.SeatsNumberInput.sendKeys("1");
                    fleet_vehiclesPages.DoorsNumberInput.sendKeys("1");
                    fleet_vehiclesPages.Co2EmissionsInput.sendKeys("1");
                    fleet_vehiclesPages.HorsepowerInput.sendKeys("1");
                    fleet_vehiclesPages.HorsepowerTaxationInput.sendKeys("1");
                    fleet_vehiclesPages.PowerInput.sendKeys("1");


            }




            BrowserUtils.waitForClickablility(fleet_vehiclesPages.SaveAndCloseButton,10);

            fleet_vehiclesPages.SaveAndCloseButton.click();

            fleet_vehiclesPages.waitUntilLoaderScreenDisappear();



            Assert.assertFalse(fleet_vehiclesPages.InvalidValue.isDisplayed());

        System.out.println("fleet_vehiclesPages.InvalidValue.isDisplayed() = " + fleet_vehiclesPages.InvalidValue.isDisplayed());


    }








    @Then("User should see below info in transmission dropdown")
    public void user_should_see_below_info_in_transmission_dropdown(io.cucumber.datatable.DataTable dataTable) {
    }
    @Then("User should see below info in fuelType dropdown")
    public void user_should_see_below_info_in_fuel_type_dropdown(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Then("Image is uploaded in JPEG or PNG format")
    public void image_is_uploaded_in_jpeg_or_png_format() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
