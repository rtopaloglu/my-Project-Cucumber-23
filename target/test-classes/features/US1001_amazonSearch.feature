@US1001 @smoke
Feature: US1001 Amazon Search

  Background: TC01 User search a word in Amazon
    Given user goes to the Amazon page

  Scenario: TC01 User search Nutella
    Then user search for Nutella
    And user tests the results contains Nutella
    And user close the page

  Scenario: TC02 User search Java
    Then user search for Java
    And user tests the results contains Java
    And user close the page
