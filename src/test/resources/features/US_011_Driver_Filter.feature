
@gurkan
Feature: US_011_Driver_Filter

  Background:
    Given The user is on the login page

    Scenario: User can select "Driver" filter under 'Fleet-Vehicles' module
      When The user logs in as a driver
      And  The user should see Dashboard
      And  User hover over on fleet menu and click vehicles
      Then User click manage filters button and select driver