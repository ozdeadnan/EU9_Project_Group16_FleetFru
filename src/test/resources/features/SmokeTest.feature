Feature: Fleet-Gru smoke test

  Background:
    Given The user is on the login page

  @FLEETG-1677  #AC1
  Scenario Outline: After clicking on "Add event" button, "Add Event" page should pop up.
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    And User click on any vehicle and land on general information page
    Then User can click add event button and add event page should pop up

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |