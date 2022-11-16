package com.cydeo.step_definitions;

import com.cydeo.pages.LastOdometerFilter_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class US_012_LastOdometerFilter_StepDef {

    LastOdometerFilter_Page lastOdometerFilter_page = new LastOdometerFilter_Page();

    @When("The user clicks filters icon")
    public void the_user_clicks_filters_icon() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.filtersButton.click();

    }

    @When("The user clicks Manage Filters Dropdown List")
    public void the_user_clicks_manage_filters_dropdown_list() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.manageFiltersButton.click();

    }

    @Then("The user can select Last Odometer Filter")
    public void the_user_can_select_last_odometer_filter() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.lastOdometerButton.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyElementDisplayed(lastOdometerFilter_page.lastOdometerButtonAssertion);
    }


    @When("The user select Last Odometer Filter")
    public void the_user_select_last_odometer_filter() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.lastOdometerButton.click();
    }

    @When("The user clicks Last Odometer: All button")
    public void the_user_clicks_last_odometer_all_button() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.lastOdometerAllButton.click();
    }

    @When("The user clicks First Shown Button")
    public void the_user_clicks_first_shown_button() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.lastOdometerAllFirstButton.click();
    }

    @Then("The user should see the <methods> shown below")
    public void the_user_should_see_the_methods_shown_below(List<String> expectedMethods) {

        List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//a[@class='dropdown-item choice-value']"));
        List<String> actualMethodList = new ArrayList<>();
        for (WebElement listOfElement : listOfElements) {
            actualMethodList.add(listOfElement.getText());
        }

//        System.out.println("actualMethodList = " + actualMethodList);
//        System.out.println("expectedMethods = " + expectedMethods);

        Assert.assertEquals(expectedMethods, actualMethodList);
    }

    @When("The user selects Between method")
    public void the_user_selects_between_method() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.between.click();
    }

    @When("The user inserts a first {string}")
    public void the_user_inserts_a_first(String string) {
        lastOdometerFilter_page.firstValue.sendKeys(string);
    }

    @When("The user inserts a last {string}")
    public void the_user_inserts_a_last(String string) {
        lastOdometerFilter_page.endValue.sendKeys(string);
        lastOdometerFilter_page.updateButton.click();
    }

    @Then("The user gets results between those values {int} and {int}")
    public void the_user_gets_results_between_those_values_and(Integer int1, Integer int2) {
        BrowserUtils.waitFor(2);
        List<WebElement> listOfBetweenElements = Driver.getDriver().findElements(By.xpath("//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-LastOdometer']"));
        //List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//tbody[@class='grid-body']/tr/td[7]"));
        List<String> actualBetweenList = new ArrayList<>();
        for (WebElement listOfElement : listOfBetweenElements) {
            actualBetweenList.add(listOfElement.getText());
        }
        Boolean result = false;
        for (String each : actualBetweenList) {
            each = each.replaceAll(",", "");
            Integer eachInt = Integer.parseInt(each);
            if (eachInt > int1 || eachInt < int2)
                result = true;
        }
        Assert.assertFalse(!result);
    }

    @When("The user selects Equals method")
    public void the_user_selects_equals_method() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.equals.click();
    }

    @When("The user inserts a {string} and clicks update")
    public void the_user_inserts_a_and_clicks_update(String string) {
        lastOdometerFilter_page.firstValue.sendKeys(string);
        lastOdometerFilter_page.updateButton.click();
    }

    @Then("The user gets results matching {int}")
    public void the_user_gets_results_matching(Integer int1) {
        BrowserUtils.waitFor(2);
        List<WebElement> listOfEqualElements = Driver.getDriver().findElements(By.xpath("//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-LastOdometer']"));
        //List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//tbody[@class='grid-body']/tr/td[7]"));
        List<String> actualEqualList = new ArrayList<>();
        for (WebElement listOfElement : listOfEqualElements) {
            actualEqualList.add(listOfElement.getText());
        }
        Boolean result = false;
        for (String each : actualEqualList) {
            each = each.replaceAll(",", "");
            int eachInt = Integer.parseInt(each);
            if (eachInt == int1)
                result = true;
        }
        Assert.assertTrue(result);
    }

    @When("The user selects More than method")
    public void the_user_selects_more_than_method() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.moreThan.click();
    }

    @Then("The user gets results more than {int}")
    public void the_user_gets_results_more_than(Integer int1) {
        BrowserUtils.waitFor(2);
        List<WebElement> listOfEqualElements = Driver.getDriver().findElements(By.xpath("//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-LastOdometer']"));
        //List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//tbody[@class='grid-body']/tr/td[7]"));
        List<String> actualEqualList = new ArrayList<>();
        for (WebElement listOfElement : listOfEqualElements) {
            actualEqualList.add(listOfElement.getText());
        }
        Boolean result = false;
        for (String each : actualEqualList) {
            each = each.replaceAll(",", "");
            int eachInt = Integer.parseInt(each);
            if (eachInt > int1)
                result = true;
        }
        Assert.assertTrue(result);
    }

    @When("The user selects Less than method")
    public void the_user_selects_less_than_method() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.lessThan.click();
    }

    @Then("The user gets results Less than {int}")
    public void the_user_gets_results_less_than(Integer int1) {
        BrowserUtils.waitFor(2);
        List<WebElement> listOfEqualElements = Driver.getDriver().findElements(By.xpath("//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-LastOdometer']"));
        //List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//tbody[@class='grid-body']/tr/td[7]"));
        List<String> actualEqualList = new ArrayList<>();
        for (WebElement listOfElement : listOfEqualElements) {
            actualEqualList.add(listOfElement.getText());
        }
        Boolean result = false;
        for (String each : actualEqualList) {
            each = each.replaceAll(",", "");
            int eachInt = Integer.parseInt(each);
            if (eachInt < int1)
                result = true;
        }
        Assert.assertTrue(result);
    }

    @When("The user selects is Empty method")
    public void the_user_selects_is_empty_method() {
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.lessThan.click();
        lastOdometerFilter_page.firstValue.sendKeys("5000");
        lastOdometerFilter_page.updateButton.click();
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.secondSearchButton.click();
        Driver.getDriver().findElement(By.xpath("//div[@class='btn-group btn-block']")).click();
        BrowserUtils.waitFor(2);
        lastOdometerFilter_page.isEmpty.click();
    }

    @When("The user  clicks update")
    public void the_user_clicks_update() {
        BrowserUtils.waitFor(5);
        lastOdometerFilter_page.updateButton.click();
    }

    @Then("The user gets results with empty values")
    public void the_user_gets_results_with_empty_values() {
        BrowserUtils.waitFor(5);
        List<WebElement> listOfEqualElements = Driver.getDriver().findElements(By.xpath("//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-LastOdometer']"));
        //List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//tbody[@class='grid-body']/tr/td[7]"));
        List<String> actualEqualList = new ArrayList<>();
        for (WebElement listOfElement : listOfEqualElements) {
            actualEqualList.add(listOfElement.getText());
        }
        Boolean result = false;
        for (String each : actualEqualList) {
            System.out.println("each = " + each);
            if (each.isEmpty())
                result = true;
        }
        Assert.assertTrue(result);
    }
}
