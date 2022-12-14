@FLEETG-1713
Feature: US_011_Driver_Filter

  Background:
    Given The user is on the login page

      #AC 1
  @FLEETG-1709
  Scenario: User can select "Driver" filter under 'Fleet-Vehicles' module
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    Then User click manage filters button and select driver


       #AC 2
  @FLEETG-1710
  Scenario: "Driver" filter should provide the methods shown as below:
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    And  User click manage filters button and select driver
    And  User click DriverFilterButton
    Then user should see method list
      | Contains         |
      | Does Not Contain |
      | Is Equal To      |
      | Starts With      |
      | Ends With        |
      | Is Any Of        |
      | Is Not Any Of    |
      | Is Empty         |
      | Is Not Empty     |



       #AC 3/4/5/6/7

  @FLEETG-1711
  Scenario:user select filter method
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    And  User click manage filters button and select driver
    And  User click DriverFilterButton
    And  user selects Contains method with a keyword, the results should contain the specified keyword
    And  user selects Does Not Contain method with a keyword, the results should not contain the specified keyword
    And  user selects Starts-with method with a keyword, the results should start with the specified keyword
    And  user selects Ends With method with a keyword, the results should end with the specified keyword
    Then user selects Is Equal to method with a keyword, the results should match the specified keyword exactly


       # AC 8

  @FLEETG-1712
  Scenario: Some methods shouldn't accept non-alphabetical characters
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    And  User click manage filters button and select driver
    And  User click DriverFilterButton
    And  Contains method shouldn't accept non-alphabetical characters
    And  Does Not Contains method shouldn't accept non-alphabetical characters
    And  Starts With method shouldn't accept non-alphabetical characters
    And  Ends With method shouldn't accept non-alphabetical characters
    Then Is Equal to method shouldn't accept non-alphabetical characters