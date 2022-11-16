package com.cydeo.step_definitions;

import com.cydeo.pages.AddEventPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class US_005_AddEvent1_StepDef {
    AddEventPage addEventPage = new AddEventPage();

    @When("Driver land on home page using valid credentials")
    public void driverLandOnHomePageUsingValidCredentials() {
        addEventPage.loginAsUserType("Driver");
        addEventPage.waitLoadingBar();
        addEventPage.waitUntilLoaderScreenDisappear();
    }

    // there's a bug
    @Then("User should not see the Add Event button")
    public void userShouldNotSeeTheAddEventButton() {
        assertFalse(addEventPage.addEventButton.isDisplayed());
    }
}
