Feature: US_011_Driver_Filter

  Background:
    Given The user is on the login page

    # AC1
  Scenario: User can select "Driver" filter under 'Fleet-Vehicles' module
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    Then User click manage filters button and select driver

  @gurkan
      # AC2
  Scenario: "Driver" filter should provide the methods
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    And User click manage filters button and select driver
    And User click driver button
    And user click contains button
    Then user should see certain list
      | Contains         |
      | Does Not Contain |
      | Is Equal To      |
      | Starts With      |
      | Ends With        |
      | Is Any Of        |
      | Is Not Any Of    |
      | Is Empty         |
      | Is Not Empty     |