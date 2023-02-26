@US1011
  Feature: US1011 cookie

    Scenario: TC01 accept cookies

      Given user is in the "guruUrl"
      And user waits 3 sn
      And user does not accept cookies
      Then user close the page


