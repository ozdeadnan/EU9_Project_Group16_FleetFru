
Feature:Login Functionality Text Execution


  Background:
    Given user is on the login page


  Scenario: Login as a driver
    When user enters to username "user1"
    And user enters to password "UserUser123"
    And user clicks login button
    Then user should not see "createButton"