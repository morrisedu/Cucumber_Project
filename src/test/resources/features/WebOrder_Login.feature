@WebOrder @web-ui
Feature: Web order app login
  As a user, I should be able to login

  # Where common lines should be. This is a shared step & will run for all scenarios
  Background:
    Given we are at the web order login page

  @succesful_login @smoke
  Scenario: User successful login
    When we provide valid credentials
    Then we should see the all order page

  @unsuccessful_login @smoke
  Scenario: User login fail
    When we provide invalid credentials
    Then we should still be at the login page
    And login error message should appear

  Scenario: User login with specific credentials
    When user provides username "Tester" and password "test"
    Then we should see the all order page

  Scenario: User login with wrong credentials
    When user provides username "Bla" and password "Bla"
    Then we should still be at the login page
    And login error message should appear
