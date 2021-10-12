@web-ui
Feature: Weborder app should work as expected
  # Enter feature description here

  Scenario:User should see all product from the list according to available products
    Given we are at the web order login page
    And we provide valid credentials
    When we select "Order" tab from side bar
    Then I should see below options in product dropdown list
      | MyMoney |
      | FamilyAlbum |
      | ScreenSaver |