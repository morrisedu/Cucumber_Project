@web-ui @google
Feature: Google search data driven
  Search multiple google keywords

  Scenario Outline: Search multiple "<keyword>"
    Given user is at google search-page
    When user search for keyword "<keyword>"
    Then the title should start with "<keyword>"
    Examples: 
      |  keyword      |
      |  cybertruck   |
      |  selenium     |
      |  Steve Jobs   |
      |  SDET Jobs    |
      |  How to make money             |