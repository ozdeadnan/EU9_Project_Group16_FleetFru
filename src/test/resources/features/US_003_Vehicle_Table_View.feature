@caner
Feature: As a user, I should be able to see all vehicle information in a table under Fleet-Vehicle page

  Background:
    Given The user is on the login page

    @canerTC1
  Scenario Outline: All user types can see all vehicle information under 'Fleet-Vehicles' module

      When "<userType>" land on home page using valid credentials
      And User hover over fleet tab and clicks Vehicles module
      Then User can see all vehicle information

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |

  @canerTC2
  Scenario Outline: User can see the total page number
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    Then User can see the total page number

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |

  Scenario Outline: User can go to next page clicking ">" button and can go to previous page clicking "<" button
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    And User can go to next page after clicking ">" button
    Then User can go to previous page clicking "<" button

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |


  Scenario Outline: User can see total recordings of vehicles
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    And User can see total recordings of vehicles

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |


  Scenario Outline: User can download table data in XLS format from "Export Grid"
    When "<userType>" land on home page using valid credentials
    And User hover over fleet tab and clicks Vehicles module
    And User click "Export Grid" modul
    Then User can download table data in XLS

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |
