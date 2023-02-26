@US1007

Feature: US1007 User searchs some words in Amazon

  Scenario Outline: TC12 searcing some words in Amazon

    Given user is in the "amazonUrl"
    Then user search for "<requested word>"
    And user assert that the result contains "<control word>"
    And user close the page

    Examples:
      | requested word | control word |
      | nutella        | nutella      |
      | java           | java         |

