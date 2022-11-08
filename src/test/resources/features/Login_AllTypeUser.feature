
Feature: Login without Scenario Outline - Without any parameter

  All users can log in with valid credentials
  (We have 3 types of users: sales manager, store manager, truck driver).


  Background:
    Given The user is on the login page


  Scenario: Login as a driver
    When The user logs in as a driver



  Scenario: Login as a sales manager
    When The user logs in as a sales manager



  Scenario: Login as a store manager
    When The user logs in as a store manager



