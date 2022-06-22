Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
    And click on Account
    When I sign-in as John_filson@hotmail.co.uk and 123filson



