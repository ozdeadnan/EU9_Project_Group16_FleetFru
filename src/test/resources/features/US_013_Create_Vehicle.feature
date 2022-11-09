Feature: Create Vehicle

  Background:
    Given The user is on the login page


  Scenario:"Create Car" button shouldn't be displayed for the driver
    When The user logs in as a driver
    And  The user should see Dashboard
    And  The user hovers over Fleet
    And  The user clicks Vehicles
    Then Create Car button shouldn't be displayed



  Scenario:"Create Car" button should be displayed for Sales Manager on the "All Cars" page
  and clicking the button should refer the user "Create Car Page"

    When The user logs in as a sales manager
    And  The user should see Dashboard
    And  The user hovers over Fleet
    And  The user clicks Vehicles
    And  Create Car button should be displayed
    And The user clicks Create Car Button
    Then The user should see Create Car Page

  @wip
  Scenario:"Create Car" button should be displayed for Store Manager on the "All Cars" page
  and clicking the button should refer the user "Create Car Page"

    When The user logs in as a store manager
    And  The user should see Dashboard
    And  The user hovers over Fleet
    And  The user clicks Vehicles
    And  Create Car button should be displayed
    And The user clicks Create Car Button
    Then The user should see Create Car Page


