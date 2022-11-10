@gurkan
Feature: US_011_Driver_Filter

  Background:
    Given The user is on the login page

      #AC 1
  Scenario: User can select "Driver" filter under 'Fleet-Vehicles' module
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    Then User click manage filters button and select driver

       #AC 2
  Scenario: User can select "Driver" filter under 'Fleet-Vehicles' module
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    And  User click manage filters button and select driver
    And  User click DriverFilterButton
    Then user should see certain list

      #AC 3/4/5/6/7
  Scenario:user select filter method
    When user selects Contains method with a keyword, the results should contain the specified keyword
    And  user selects Does Not Contain method with a keyword, the results should not contain the specified keyword
    And  user selects Starts-with method with a keyword, the results should start with the specified keyword
    And  user selects Ends With method with a keyword, the results should end with the specified keyword
    Then user selects Is Equal to method with a keyword, the results should match the specified keyword exactly

       # AC 8
  Scenario: Some methods shouldn't accept non-alphabetical characters
    When Contains method shouldn't accept non-alphabetical characters
    And  Does Not Contains method shouldn't accept non-alphabetical characters
    And  Starts With method shouldn't accept non-alphabetical characters
    And  Ends With method shouldn't accept non-alphabetical characters
    And  Is Equal to method shouldn't accept non-alphabetical characters