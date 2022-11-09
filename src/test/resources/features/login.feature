
Feature:Login Functionality Text Execution


  Background:
    Given user is on the login page


  Scenario Outline: Login as a Store /Sales Manager
    When user enters to username "<username>"
    And user enters to password "<password>"
    And user clicks login button
    Then user should see "<createButton>"

    Examples: Valid Credentials
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |