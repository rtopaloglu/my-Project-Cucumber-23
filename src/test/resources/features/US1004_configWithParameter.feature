@US1004 @smoke
  Feature: US1004
    
    Scenario: TC01
      
      Given user is in the "facebookUrl"
      Then user waits 2 sn
      And user asserts that url contains "facebook"
      Then user close the page

