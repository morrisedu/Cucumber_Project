@Datatables @web-ui
Feature: Homework
  Datatables practice

  Scenario: User should see product table as expected
    Given we are at the web order login page
    And we provide valid credentials
    When we select "View all products" tab from side bar
    And we should see table with below content
      # for the same of simplicity below table is modified to match exactly to actual table
      | Product name| Price | Discount |
      | MyMoney     | $100  | 8%       |
      | FamilyAlbum | $80   | 15%      |
      | ScreenSaver | $20   | 10%      |