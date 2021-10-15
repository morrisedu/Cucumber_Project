# Created by miro at 12/10/2021
@datatable @non_ui @non-web
Feature: Demonstrating data tables

  Cucumber provides the ability to organize repeating steps with different data using data table feature & automatically
  convert the table into a known java data type supported by Cucumber

  Scenario: Petting zoo
    Given I have a "horse"
    And I have a "dog"
    And I have a "turtle"
    And I have a "zebra"
    When I call their names
    Then they come

  Scenario: Petting zoo with data tables
    Given I have the following animals
      | horse   |
      | dog     |
      | turtle  |
      | zebra   |
    When I call their names as below
      | Kira    |
      | Doru    |
      | Tito    |
      | Zemfira |
    Then they come to me with the sounds
      | horse   |   Neigh |
      | dog     |   Bark  |
      | turtle  |   Snap  |
      | zebra   |   Neigh |

  @web-ui
  Scenario: Login to weborder app by providing username and password in 2 column table
    Given we are at the web order login page
    When we provide the credentials below
      | username  | Tester  |
      | password  | test    |
    Then we should see the all order page

  Scenario: Representing table with header and more than 2 columns with list of map
    Given This is the product reference
      | Product     | Price | Discount |
      | MyMoney     | 100   | 0.08     |
      | FamilyAlbum | 20    | 0.15     |
      | ScreenSaver | 80    | 0.1      |

  Scenario: Representing table with no first column header
    Given I have this names
      |             | firstName | lastName | heroName     |
      | group1      | Clark     | Kent     | Superman     |
      | group2      | Bruce     | Wayne    | Batman       |
      | group3      | Diana     | Prince   | Wonder Woman |
      | group4      | Barry     | Allen    | Flash        |
    And I have another table without a header
      | MyMoney     | 100   | 0.08     |
      | FamilyAlbum | 20    | 0.15     |
      | ScreenSaver | 80    | 0.1      |