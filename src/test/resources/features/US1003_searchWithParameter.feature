@US1003 @smoke

  Feature: US1003 searching with parameter

    Scenario: TC01 User search with parameter
      Given user goes to the Amazon page
      Then user search for "Java"
      And user tests the results contains "Java"
      And user waits 1 sn
      And user close the page

