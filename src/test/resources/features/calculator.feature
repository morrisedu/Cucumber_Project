# Created by miro at 04/10/2021
Feature: Calculator
  As a user,
  I should be able to use the calculator to do arithemetic operations

  Scenario: Add 2 numbers
    Given calculator app is open
    When I add 2 and 2
    Then I should get the result 4 displayed

  Scenario: Add 2 numbers second test
    Given calculator app is open
    When I add 5 and 7
    Then I should get the result 12 displayed