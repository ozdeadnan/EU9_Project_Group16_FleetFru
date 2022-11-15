Feature: As a store manager and sales manager, I should be able to add an event

  Background:
    Given The user is on the login page

  @yunus
  Scenario Outline:User can access the "Add Event" page from the
  "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    And User click on any vehicle and land on general information page
    Then User can click add event button and access the page
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
