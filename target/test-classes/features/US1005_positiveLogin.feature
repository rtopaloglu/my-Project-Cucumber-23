@US1005


Feature: US1005 user login with valid credentials

  @smoke @regression
  Scenario: TC01 positive login test
    Given user is in the "HMCUrl"
    And user enters valid username
    And user enters valid password
    And user clicks login button
    Then user asserts that login was successful
    And user close the page


