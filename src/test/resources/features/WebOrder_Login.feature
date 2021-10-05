Feature: Web order app login
  As a user, I should be able to login

  Scenario: User successful login
    Given we are at the web order login page
    When we provide valid credentials
    Then we should see the all order page