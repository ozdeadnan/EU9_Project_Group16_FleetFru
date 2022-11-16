package com.cydeo.step_definitions;

import com.cydeo.pages.AddEventPage;
import com.cydeo.pages.DeleteCarPages;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;


public class US_08_DeleteACar_StepDef {

AddEventPage addEventPage=new AddEventPage();
        DeleteCarPages deleteCarPages=new DeleteCarPages();
        Actions action=new Actions(Driver.getDriver());
        LoginPage loginPage=new LoginPage();


        @When("users log in")
        public void users_log_in() {
            loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("salesManager.username"));
            loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("salesManager.pw"));
            loginPage.logInButton.click();
        }



        @When("users hover over Fleet menu")
        public void users_hover_over_fleet_menu() {

            deleteCarPages.waitUntilLoaderScreenDisappear();
            deleteCarPages.waitLoadingBar();
          //  action.moveToElement(deleteCarPages.FleetDropdownMenu).perform();

            try {
                addEventPage.addEventPopUp.isDisplayed();
                BrowserUtils.waitForClickablility(addEventPage.popUpCloseButton, 10);
                addEventPage.popUpCloseButton.click();

                action.moveToElement(addEventPage.FleetDropdownMenu).perform();


            } catch (Exception e) {
                action.moveToElement(addEventPage.FleetDropdownMenu).perform();

            }


        }
        @When("user click Vehicles")
        public void user_click_vehicles() {
            deleteCarPages.vehiclesButton.click();
            deleteCarPages.waitUntilLoaderScreenDisappear();


        }
        @When("users hover over three dots")
        public void users_hover_over_three_dots() {

            action.moveToElement(deleteCarPages.threeDots).perform();
            BrowserUtils.waitFor(2);
        }
        @Then("users can see the delete sign")
        public void users_can_see_the_delete_sign() {
            Assert.assertTrue(deleteCarPages.trashBin.isDisplayed());

        }

        //2.
        @When("users click delete sign")
        public void users_click_delete_sign() {

            deleteCarPages.trashBin.click();
            BrowserUtils.waitFor(3);
        }
        @Then("users see delete confirmation pop up")
        public void users_see_delete_confirmation_pop_up() {

            //   Alert alert= Driver.getDriver().switchTo().alert();


            Assert.assertTrue(deleteCarPages.DeleteConfPopup.isDisplayed());
        }

        //3

        @When("driver logs in")
        public void driver_logs_in() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("driver.username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver.pw"));
        loginPage.logInButton.click();
    }
        @When("driver clicks yes,delete btn")
        public void driver_clicks_yes_delete_btn() {

            deleteCarPages.DeleteYes.click();
            deleteCarPages.waitUntilLoaderScreenDisappear();
        }

        @Then("the sign is you don't have permission")
        public void the_sign_is_you_don_t_have_permission() {

            System.out.println(deleteCarPages.noPermissionMsg.getText());

           // Assert.assertEquals("You do not have permission to perform this action.",deleteCarPages.noPermissionMsg.getText());

        }

        //4

        @When("sales manager and store manager clicks yes,delete btn")
        public void sales_manager_and_store_manager_clicks_yes_delete_btn() {

            deleteCarPages.DeleteYes.click();

        }
        @Then("the sign is item deleted")
        public void the_sign_is_item_deleted() {

            deleteCarPages.itemDeletedMsg.getText();
            Assert.assertTrue(deleteCarPages.itemDeletedMsg.getText().equals("Item deleted"));
        }

        //5

        @When("sales manager and store manager click on any vehicle row")
        public void sales_manager_and_store_manager_click_on_any_vehicle_row() {

            deleteCarPages.carRow.click();

            deleteCarPages.waitUntilLoaderScreenDisappear();

        }

        @When("click on delete btn")
        public void click_on_delete_btn() {



            BrowserUtils.waitFor(5);
            deleteCarPages.deleteCarBtn.click();


            //  Alert alert= Driver.getDriver().switchTo().alert();

            BrowserUtils.waitFor(2);
            deleteCarPages.DeleteYes.click();
            deleteCarPages.waitUntilLoaderScreenDisappear();
        }

        @Then("the sign is car deleted")
        public void the_sign_is_car_deleted() {


            System.out.println(deleteCarPages.carDeletedMsg.getText());

            Assert.assertEquals("×\n" +
                    "Car deleted",deleteCarPages.carDeletedMsg.getText());


        }


}
