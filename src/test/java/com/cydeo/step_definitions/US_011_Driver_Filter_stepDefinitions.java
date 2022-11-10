package com.cydeo.step_definitions;

import com.cydeo.pages.DriverFilterPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US_011_Driver_Filter_stepDefinitions {

    Actions actions = new Actions(Driver.getDriver());
    DriverFilterPage driverFilterPage = new DriverFilterPage();


    @When("The user should see {string} menu")
    public void the_user_should_see_menu(String string) throws InterruptedException {


        driverFilterPage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(string, Driver.getDriver().getTitle());

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

    @When("User click DriverFilterButton")
    public void userClickDriverFilterButton() {

        DriverFilterPage.DriverFilterButton.click();

    }

    @Then("user should see method list")
    public void userShouldSeeMethodList() {


    }


    //AC 3-4-5-6-7

    @When("user selects Contains method with a keyword, the results should contain the specified keyword")
    public void user_selects_contains_method_with_a_keyword_the_results_should_contain_the_specified_keyword() {

    }
    @When("user selects Does Not Contain method with a keyword, the results should not contain the specified keyword")
    public void user_selects_does_not_contain_method_with_a_keyword_the_results_should_not_contain_the_specified_keyword() {

    }
    @When("user selects Starts-with method with a keyword, the results should start with the specified keyword")
    public void user_selects_starts_with_method_with_a_keyword_the_results_should_start_with_the_specified_keyword() {

    }
    @When("user selects Ends With method with a keyword, the results should end with the specified keyword")
    public void user_selects_ends_with_method_with_a_keyword_the_results_should_end_with_the_specified_keyword() {

    }
    @Then("user selects Is Equal to method with a keyword, the results should match the specified keyword exactly")
    public void user_selects_is_equal_to_method_with_a_keyword_the_results_should_match_the_specified_keyword_exactly() {

    }

    //AC 8

    @When("Contains method shouldn't accept non-alphabetical characters")
    public void contains_method_shouldn_t_accept_non_alphabetical_characters() {

    }
    @When("Does Not Contains method shouldn't accept non-alphabetical characters")
    public void does_not_contains_method_shouldn_t_accept_non_alphabetical_characters() {

    }
    @When("Starts With method shouldn't accept non-alphabetical characters")
    public void starts_with_method_shouldn_t_accept_non_alphabetical_characters() {

    }
    @When("Ends With method shouldn't accept non-alphabetical characters")
    public void ends_with_method_shouldn_t_accept_non_alphabetical_characters() {

    }
    @When("Is Equal to method shouldn't accept non-alphabetical characters")
    public void is_equal_to_method_shouldn_t_accept_non_alphabetical_characters() {

    }

}






