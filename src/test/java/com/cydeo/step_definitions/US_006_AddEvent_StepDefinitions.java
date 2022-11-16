package com.cydeo.step_definitions;

import com.cydeo.pages.AddEventPage;
import com.cydeo.pages.DriverFilterPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.*;


public class US_006_AddEvent_StepDefinitions {


    AddEventPage addEventPage = new AddEventPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("{string} land on home page using valid credentials")
    public void land_on_home_page_using_valid_credentials(String string) throws InterruptedException {
        addEventPage.loginAsUserType(string);
        addEventPage.waitLoadingBar();


    }

    @When("User hover over fleet tab and clicks Vehicles module")
    public void user_hover_over_fleet_tab_and_clicks_vehicles_module() {

        addEventPage.waitUntilLoaderScreenDisappear();

        try {
            addEventPage.addEventPopUp.isDisplayed();
            BrowserUtils.waitForClickablility(addEventPage.popUpCloseButton, 10);
            addEventPage.popUpCloseButton.click();

            actions.moveToElement(addEventPage.FleetDropdownMenu).perform();
            addEventPage.VehiclesButton.click();


        } catch (Exception e) {
            actions.moveToElement(addEventPage.FleetDropdownMenu).perform();
            addEventPage.VehiclesButton.click();
        }


    }

    @When("User click on any vehicle and land on general information page")
    public void user_click_on_any_vehicle_and_land_on_general_information_page() {

        addEventPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(addEventPage.vehiclesRow1, 5);
        actions.moveToElement(addEventPage.vehiclesRow1).click().perform();

        BrowserUtils.waitFor(5);
        addEventPage.waitUntilLoaderScreenDisappear();
        String generalPAge = addEventPage.generalInformationHeader.getText();
        Assert.assertEquals("General Information", generalPAge);
        //System.out.println("generalPAge = " + generalPAge);

        //


    }

    @Then("User can click add event button and access the page")
    public void user_can_click_add_event_button_and_access_the_page() {

        // addEventPage.waitUntilLoaderScreenDisappear();
        // addEventPage.addEventButton.click();

        BrowserUtils.waitFor(10);
        // addEventPage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(addEventPage.addEventButton.isDisplayed());

       /* try {
            //BrowserUtils.sleep(15);
            BrowserUtils.waitForVisibility(addEventPage.addEventCloseButton, 15);
            addEventPage.addEventCloseButton.click();
            BrowserUtils.sleep(1);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }*/
        // String actualAddEventButton = addEventPage.addEventPopUpHeader.getText();
        // String expectedAddEvent="Add Event";
        // Assert.assertEquals(expectedAddEvent,actualAddEventButton);

        //  System.out.println("actualAddEventButton = " + actualAddEventButton);


    }

    @Then("User can click add event button and add event page should pop up")
    public void user_can_click_add_event_button_and_add_event_page_should_pop_up() {

        // addEventPage.waitUntilLoaderScreenDisappear();
        addEventPage.addEventButton.click();

        // BrowserUtils.sleep(10);
        addEventPage.waitUntilLoaderScreenDisappear();
        Assert.assertFalse(addEventPage.addEventPopUp.isDisplayed());

    }

    @Then("User can click  any colour")
    public void userCanClickAnyColour() {

        actions.moveToElement(addEventPage.colorButton).click().perform();
        // addEventPage.colorButton.click();
        addEventPage.colorButton.isSelected();

    }

    @Then("User can click  all day event checkbox and after click time boxes will disappear")
    public void userCanClickAllDayEventCheckboxAndAfterClickTimeBoxesWillDisappear() {
        for (int i = 0; i < addEventPage.a.size(); i++) {
            BrowserUtils.waitForVisibility(addEventPage.a.get(i), 15);
            assertTrue(addEventPage.a.get(i).isDisplayed());

        }
        BrowserUtils.waitForClickablility(addEventPage.alldayCheckBox, 10);
        addEventPage.alldayCheckBox.click();
        for (int i = 0; i < addEventPage.a.size(); i++) {
            // BrowserUtils.waitForVisibility(addEventPage.a.get(i),15);
            BrowserUtils.waitFor(2);
            String timeOuterHtml = addEventPage.a.get(i).getAttribute("outerHTML");
            System.out.println(timeOuterHtml);
            assertTrue(timeOuterHtml.contains("display: none;"));

        }
        // assertFalse(addEventPage.timeOne.isDisplayed());
        //  assertFalse(addEventPage.timeSecond.isDisplayed());


    }

    @And("User can click repeats button")
    public void userCanClickRepeatsButton() {
        BrowserUtils.waitForClickablility(addEventPage.repeatCheckbox, 15);
        addEventPage.repeatCheckbox.click();

    }

    @And("Verify that should see following orders")
    public void verifyThatShouldSeeFollowingOrders(List<String> expectedMenuList) {
        List<String> actualMenuList = BrowserUtils.dropdownOptionsAsString(addEventPage.repeatsDropDown);

        assertEquals(expectedMenuList, actualMenuList);

        System.out.println("expectedMenuList = " + expectedMenuList);
        System.out.println("actualMenuList = " + actualMenuList);


    }

    @Then("User can  click ending options")
    public void usercanclickendingoptions() {


        for (int i = 0; i < addEventPage.endingOptions.size(); i++) {

            BrowserUtils.waitForClickablility(addEventPage.endingOptions.get(i), 10);
            addEventPage.endingOptions.get(i).click();
            assertTrue(addEventPage.endingOptions.get(i).isSelected());


        }
    }

    @Then("Verify that should be see following orders")
    public void verifyThatShouldBeSeeFollowingOrders(List<String> expectedEndingOptions) {

        for (int i = 0; i < addEventPage.endingText.size(); i++) {

            BrowserUtils.waitForClickablility(addEventPage.endingText.get(i), 10);
           String  actualEndingOptions = addEventPage.endingText.get(i).getText();
            assertEquals(expectedEndingOptions.get(i),actualEndingOptions);
            // olmazsa get(i) yap şuna   ^^      , buna değil

            System.out.println("actualEndingOptions = " + actualEndingOptions);

        }


    }

    @And("User enters add event title")
    public void userEntersAddEventTitle() {
        addEventPage.titleInput.sendKeys("Yunus KARAHAN");


    }

    @And("User click save button")
    public void userClickSaveButton() {
        BrowserUtils.waitForClickablility(addEventPage.saveButton,15);
        addEventPage.saveButton.click();
    }

    @Then("Verify that should see add event information")
    public void verifyThatShouldSeeAddEventInformation() {
        BrowserUtils.waitForVisibility(addEventPage.eventList,15);
        assertTrue(addEventPage.eventList.isDisplayed());
    }
}


