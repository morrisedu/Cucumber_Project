# Created by miro at 11/10/2021
@web-ui @google
Feature: Google Search
  As a user, I should be able to search keyword, & get my results

  Background:
    Given user is at google search-page

  Scenario: User search by keyword
    When user search for keyword "Selenium"
    Then we should see result page
    And the title should start with "Selenium"

  Scenario: User search by java
    When user search for keyword "java"
    Then we should see result page
    And the title should start with "java"