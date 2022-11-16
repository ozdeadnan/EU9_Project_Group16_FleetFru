@FLEETG-1729
Feature: Fleet-Gru SmokeTest

  Background:
    Given The user is on the login page

  @FLEETG-1677  #AC1 YUNUS KARAHAN
  Scenario Outline: After clicking on "Add event" button, "Add Event" page should pop up.
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    And User click on any vehicle and land on general information page
    Then User can click add event button and add event page should pop up

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |

          #AC1  GURKAN ARSLAN
  @FLEETG-1709
  Scenario: User can select "Driver" filter under 'Fleet-Vehicles' module
    When The user logs in as a driver
    And  The user should see Dashboard
    And  User hover over on fleet menu and click vehicles
    Then User click manage filters button and select driver

     #AC1  ERTUGRUL ERCIN
  @FLEETG-1669
  Scenario:"Create Car" button shouldn't be displayed for the driver
    Given The user logs in as a driver
    When  The user should see Dashboard
    And  The user hovers over Fleet
    And  The user clicks Vehicles
    Then Create Car button shouldn't be displayed

    #AC1  ERSIN INCI
  @FLEETG-1715
  Scenario:  users can see the delete sign by hovering over the three dots
    When users log in
    And users hover over Fleet menu
    And user click Vehicles
    And users hover over three dots
    Then users can see the delete sign
