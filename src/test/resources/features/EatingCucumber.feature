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

  @inp
  Scenario Outline: eating
    Given there are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

    Examples:
      | start | eat |  left  |
      |   12  |  5  |    7   |
      |   20  |  12 |    10  |
      |   33  |  5  |    15  |
      |   44  |  12 |    32  |