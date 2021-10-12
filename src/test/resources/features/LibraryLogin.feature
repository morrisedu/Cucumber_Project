@library_login @web-ui
Feature: Logging in to the library app
  A user
  Should be able to login to the library app

  Scenario Outline: Login with valid credentials
    Given user is at library login page
    When user uses username "<email>" and passcode "<password>"
    Then user should be at dashboard page
    Examples:
      | email               |  password   |
      | student30@library   |  Sdet2022*  |
      | student31@library   |  Sdet2022*  |
      | student32@library   |  Sdet2022*  |
      | librarian46@library |  Sdet2022*  |
      | librarian13@library |  Sdet2022*  |