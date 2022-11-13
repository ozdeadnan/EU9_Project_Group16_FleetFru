@FLEETG-1657
Feature: As a store manager and sales manager, I should be able to add an event

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


  @FLEETG-1686  #AC2
  Scenario Outline: User can mark the event with any colour
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    And User click on any vehicle and land on general information page
    And User can click add event button and add event page should pop up
    Then User can click  any colour

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |

  @FLEETG-1687  #AC3
  Scenario Outline: User can click  "All-day event" check box and after click time boxes will disappear
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    And User click on any vehicle and land on general information page
    And User can click add event button and add event page should pop up
    Then User can click  all day event checkbox and after click time boxes will disappear

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |


  @FLEETG-1688  #AC4
  Scenario:  User can repeat the action by specifying occurrence periods and ending time:
    When The user logs in as a sales manager
    And User hover over fleet tab and clicks Vehicles module
    And User click on any vehicle and land on general information page
    And User can click add event button and add event page should pop up
    And User can click repeats button
    And Verify that should see following orders
      | Daily   |
      | Weekly  |
      | Monthly |
      | Yearly  |
    And User can  click ending options
    Then Verify that should be see following orders
      | Never       |
      | After       |
      | occurrences |
      | By          |

  @FLEETG-1689 #AC5
  Scenario: All Users can see all events on the General information page
    When The user logs in as a sales manager
    And User hover over fleet tab and clicks Vehicles module
    And User click on any vehicle and land on general information page
    And User can click add event button and add event page should pop up
    And User enters add event title
    And User click save button
    Then Verify that should see add event information






