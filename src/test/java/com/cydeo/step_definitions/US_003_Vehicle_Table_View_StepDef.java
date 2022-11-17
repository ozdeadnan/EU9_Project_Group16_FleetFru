package com.cydeo.step_definitions;

import com.cydeo.pages.AddEventPage;
import com.cydeo.pages.FleetVehiclesPages;
import com.cydeo.pages.VehicleTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class US_003_Vehicle_Table_View_StepDef {

    @Then("User can see all vehicle information")
    public void user_can_see_all_vehicle_information() {


        BrowserUtils.waitFor(10);
        Assert.assertTrue(VehicleTablePage.validPage.isDisplayed());
    }


    @Then("User can see the total page number")
    public void user_can_see_the_total_page_number() {

        BrowserUtils.waitFor(10);
       // Assert.assertTrue(VehicleTablePage.totalPageNum.isDisplayed());
        Assert.assertEquals("Of 5 |",VehicleTablePage.totalPageNum.getText());
    }

//caner
    }


