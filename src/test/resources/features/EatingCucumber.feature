@cucumber @non_ui @non-web
Feature: Eating too many cucumbers may not be good for you
  Eating too much of anything may not be too good for you

  Scenario: Eating a few is no problem
    Given Alice is hungry
    When he eats 3 cucumbers
    Then she will be full

  Scenario: Eating too much is a problem
    Given Ivan is hungry
    When he eats 10 cucumbers
    Then he faints
