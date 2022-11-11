package com.cydeo.step_definitions;

import com.cydeo.pages.AddEventPage;
import com.cydeo.pages.DriverFilterPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class US_006_AddEvent_StepDefinitions {

    AddEventPage addEventPage = new AddEventPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("{string} land on home page using valid credentials")
    public void land_on_home_page_using_valid_credentials(String string) throws InterruptedException {
        addEventPage.loginAsUserType(string);
        addEventPage.waitLoadingBar();
        addEventPage.waitUntilLoaderScreenDisappear();
        Thread.sleep(3000);




    }

    @When("User hover over fleet tab and clicks Vehicles module")
    public void user_hover_over_fleet_tab_and_clicks_vehicles_module() {

        actions.moveToElement(addEventPage.FleetDropdownMenu).perform();
        addEventPage.VehiclesButton.click();
        addEventPage.waitUntilLoaderScreenDisappear();


    }

    @When("User click on any vehicle and land on general information page")
    public void user_click_on_any_vehicle_and_land_on_general_information_page()  {

        addEventPage.waitUntilLoaderScreenDisappear();

        actions.moveToElement(addEventPage.vehiclesRow1).click().perform();

        addEventPage.waitUntilLoaderScreenDisappear();


        String generalPAge = addEventPage.generalInformationHeader.getText();
        Assert.assertEquals("General Information", generalPAge);
        System.out.println("generalPAge = " + generalPAge);

        //


    }

    @Then("User can click add event button and access the page")
    public void user_can_click_add_event_button_and_access_the_page()  {

        addEventPage.waitUntilLoaderScreenDisappear();
        addEventPage.addEventButton.click();

        BrowserUtils.sleep(9);
        addEventPage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(addEventPage.addEventPopUp.isDisplayed());

        try {
            //BrowserUtils.sleep(15);
            BrowserUtils.waitForVisibility(addEventPage.addEventCloseButton, 15);
            addEventPage.addEventCloseButton.click();
            BrowserUtils.sleep(1);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        // String actualAddEventButton = addEventPage.addEventPopUpHeader.getText();
       // String expectedAddEvent="Add Event";
       // Assert.assertEquals(expectedAddEvent,actualAddEventButton);

      //  System.out.println("actualAddEventButton = " + actualAddEventButton);


    }

    @Then("User can click add event button and add event page should pop up")
    public void user_can_click_add_event_button_and_add_event_page_should_pop_up() {

        addEventPage.waitUntilLoaderScreenDisappear();
        addEventPage.addEventButton.click();

        BrowserUtils.sleep(9);
        addEventPage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(addEventPage.addEventPopUp.isDisplayed());

    }
}
