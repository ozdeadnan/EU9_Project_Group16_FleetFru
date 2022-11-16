@FLEETG-1720
Feature: Delete A Car

  Background:
    Given The user is on the login page

  @FLEETG-1715
  Scenario:  users can see the delete sign by hovering over the three dots
    When users log in
    And users hover over Fleet menu
    And user click Vehicles
    And users hover over three dots
    Then users can see the delete sign


  @FLEETG-1716
  Scenario: users see confirmation pop up
    When users log in
    And users hover over Fleet menu
    And user click Vehicles
    And users hover over three dots
    And users click delete sign
    Then users see delete confirmation pop up


  @FLEETG-1717
  Scenario: You don't have permission msg for driver
    When driver logs in
    And users hover over Fleet menu
    And user click Vehicles
    And users hover over three dots
    And users click delete sign
    And driver clicks yes,delete btn
    Then the sign is you don't have permission

  @FLEETG-1718
  Scenario: sales manager and store manager can delete any car
    When users log in
    And users hover over Fleet menu
    And user click Vehicles
    And users hover over three dots
    And users click delete sign
    And sales manager and store manager clicks yes,delete btn
    Then the sign is item deleted

  @FLEETG-1719
  Scenario:  sales manager and store manager can delete by clicking on vehicle row
    When users log in
    And users hover over Fleet menu
    And user click Vehicles
    And sales manager and store manager click on any vehicle row
    And click on delete btn
    Then the sign is car deleted

