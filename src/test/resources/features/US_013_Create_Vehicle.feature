@FLEETG-1675
Feature: Create Vehicle

  Background:
    Given The user is on the login page


  @FLEETG-1669
  Scenario:"Create Car" button shouldn't be displayed for the driver
    Given The user logs in as a driver
    When  The user should see Dashboard
    And  The user hovers over Fleet
    And  The user clicks Vehicles
    Then Create Car button shouldn't be displayed


  @FLEETG-1671
  Scenario:"Create Car" button should be displayed for Sales Manager on the "All Cars" page
  and clicking the button should refer the user "Create Car Page"

    Given The user logs in as a sales manager
    When  The user should see Dashboard
    And  The user hovers over Fleet
    And  The user clicks Vehicles
    And  Create Car button should be displayed
    And The user clicks Create Car Button
    Then The user should see Create Car Page


  @FLEETG-1672
  Scenario:"Create Car" button should be displayed for Store Manager on the "All Cars" page
  and clicking the button should refer the user "Create Car Page"

    Given The user logs in as a store manager
    When  The user should see Dashboard
    And  The user hovers over Fleet
    And  The user clicks Vehicles
    And  Create Car button should be displayed
    And The user clicks Create Car Button
    Then The user should see Create Car Page



  @FLEETG-1673
  Scenario Outline: Verify form data structures
    Given The user logs in as a store manager
    When The user should see Dashboard
    And The user hovers over Fleet
    And The user clicks Vehicles
    And Create Car button should be displayed
    And The user clicks Create Car Button
    And The user should see Create Car Page
    Then User should see below info in tags checkBoxes
      | Junior       |
      | Senior       |
      | Employee Car |
      | Purchased    |
      | Compact      |
      | Sedan        |
      | Convertible  |
    Then User should see "<entries>" in "<determinedStructure>"
    Then User should see below info in transmission dropdown
      | Manual    |
      | Automatic |
    Then User should see below info in fuelType dropdown
      | Gasoline |
      | Diesel   |
      | Electric |
      | Hybrid   |
    Then Image is uploaded in JPEG or PNG format

    Examples:
      | entries             | determinedStructure |
      | LicensePlate        | alpha-numerical     |
      | Driver              | alphabetical        |
      | Location            | alphabetical        |
      | ChassisNumber       | alpha-numerical     |
      | ModelYear           | numerical           |
      | LastOdometer        | numerical           |
      | ImmatriculationDate | date                |
      | FirstContractDate   | date                |
      | CatalogValue        | numerical           |
      | SeatNumber          | numerical           |
      | DoorsNumber         | numerical           |
      | Color               | alphabetical        |
      | Co2Emission         | numerical           |
      | Horsepower          | numerical           |
      | HorsepowerTaxation  | numerical           |
      | Power               | numerical           |

  @FLEETG-1673
  Scenario: Verify  saving options and entity saved message

    Given The user logs in as a store manager
    When The user should see Dashboard
    And The user hovers over Fleet
    And The user clicks Vehicles
    And Create Car button should be displayed
    And The user clicks Create Car Button
    And The user clicks saving options button
    And User should see below info in saving options dropdown
      | Save And Close |
      | Save And New   |
      | Save           |
    And The user clicks save option
    Then User should see Entity Saved message  after successful saving




