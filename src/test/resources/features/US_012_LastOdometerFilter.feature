@FLEETG-1730
Feature: As a user, I should be able to use "Last Odometer" filter under 'Fleet-Vehicles' page


  Background:
    Given The user is on the login page

#  @US-012/AC01
  @FLEETG-1722
  Scenario: User can select "Last Odometer" filter under 'Fleet-Vehicles' page
    When The user logs in as a driver
    And The user hovers over Fleet
    And The user clicks Vehicles
    And The user clicks filters icon
    And The user clicks Manage Filters Dropdown List
    Then The user can select Last Odometer Filter

#  @US-012/AC02
  @FLEETG-1723
  Scenario: Last Odometer filter should provide the methods shown as below
    When The user logs in as a driver
    And The user hovers over Fleet
    And The user clicks Vehicles
    And The user clicks filters icon
    And The user clicks Manage Filters Dropdown List
    And The user select Last Odometer Filter
    And The user clicks Last Odometer: All button
    And The user clicks First Shown Button
    Then The user should see the <methods> shown below
      | Between             |
      | Not Between         |
      | Equals              |
      | Not Equals          |
      | More Than           |
      | Less Than           |
      | Equals Or More Than |
      | Equals Or Less Than |
      | Is Empty            |
      | Is Not Empty        |


#  @US-012/AC03
  @FLEETG-1724
  Scenario Outline: User selects "Between" method with numeric values and results should be between values
    When The user logs in as a driver
    And The user hovers over Fleet
    And The user clicks Vehicles
    And The user clicks filters icon
    And The user clicks Manage Filters Dropdown List
    And The user select Last Odometer Filter
    And The user clicks Last Odometer: All button
    And The user clicks First Shown Button
    And The user selects Between method
    And The user inserts a first "<numericValue1>"
    And The user inserts a last "<numericValue2>"
    Then The user gets results between those values <numericValue1> and <numericValue2>
    Examples:
      | numericValue1 | numericValue2 |
      | 2001          | 18999         |

#  @US-012/AC04
  @FLEETG-1725
  Scenario Outline:User selects "Equals" method with numeric values and results should match value.
    When The user logs in as a driver
    And The user hovers over Fleet
    And The user clicks Vehicles
    And The user clicks filters icon
    And The user clicks Manage Filters Dropdown List
    And The user select Last Odometer Filter
    And The user clicks Last Odometer: All button
    And The user clicks First Shown Button
    And The user selects Equals method
    And The user inserts a "<numericValue>" and clicks update
    Then The user gets results matching <numericValue>
    Examples:
      | numericValue |
      | 2000         |

#  @US-012/AC05
  @FLEETG-1726
  Scenario Outline: User selects "More than" method with numeric values and results should be more than value.
    When The user logs in as a driver
    And The user hovers over Fleet
    And The user clicks Vehicles
    And The user clicks filters icon
    And The user clicks Manage Filters Dropdown List
    And The user select Last Odometer Filter
    And The user clicks Last Odometer: All button
    And The user clicks First Shown Button
    And The user selects More than method
    And The user inserts a "<numericValue>" and clicks update
    Then The user gets results more than <numericValue>
    Examples:
      | numericValue |
      | 44000        |

#  @US-012/AC06
  @FLEETG-1727
  Scenario Outline: User selects "Less than" method with numeric values and results should be less than value.
    When The user logs in as a driver
    And The user hovers over Fleet
    And The user clicks Vehicles
    And The user clicks filters icon
    And The user clicks Manage Filters Dropdown List
    And The user select Last Odometer Filter
    And The user clicks Last Odometer: All button
    And The user clicks First Shown Button
    And The user selects Less than method
    And The user inserts a "<numericValue>" and clicks update
    Then The user gets results Less than <numericValue>
    Examples:
      | numericValue |
      | 5000         |

#  @US-012/AC07
  @FLEETG-1728
  Scenario: User selects "Is Empty" method, only empty values should be displayed.
    When The user logs in as a driver
    And The user hovers over Fleet
    And The user clicks Vehicles
    And The user clicks filters icon
    And The user clicks Manage Filters Dropdown List
    And The user select Last Odometer Filter
    And The user clicks Last Odometer: All button
    And The user clicks First Shown Button
    And The user selects is Empty method
    And The user  clicks update
    Then The user gets results with empty values

#  @US-012/AC08
#
#  Scenario Outline: Methods ("Between","Equals","More Than","Less Than") shouldn't accept non-numeric values
#    When The user logs in as a driver
#    And The user hovers over Fleet
#    And The user clicks Vehicles
#    And The user clicks filters icon
#    And The user clicks Manage Filters Dropdown List
#    And The user select Last Odometer Filter
#    And The user clicks Last Odometer: All button
#    And The user clicks First Shown Button
#    And The user selects Between method
#    And The user inserts a first "<noNumericalValue1>"
#    And The user inserts a last "<nonNumericalValue2>"
#    And The user  clicks update
#
#    Examples:
#      | noNumericalValue1 | nonNumericalValue2 |
#      | abcd154           | cdb164             |

#  Scenario: Login as a sales manager
#    When The user logs in as a sales manager
#    And The user hovers over Fleet
#    And The user clicks Vehicles
#
#
#  Scenario: Login as a store manager
#    When The user logs in as a store manager
#    And The user hovers over Fleet
#    And The user clicks Vehicles




