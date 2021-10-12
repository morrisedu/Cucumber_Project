@calculator @non-web @non-ui
Feature: Calculator data driven test
  Data driven calculator tests

  Scenario Outline: Add 2 numbers multiple examples
    Given calculator app is open
    When I add <num1> and <num2>
    Then I should get the result <expected_result> displayed
    Examples:
      | num1 |  num2 |  expected_result |
      | 3    |  4    |   7              |
      | 4    |  7    |  11              |
      | 6    |  11   |  17              |
      | 10   |  20   |  30              |
      | 6    |  21   |  27              |
      | 70   |  101  |  171             |