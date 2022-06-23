Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
    And click on Account
    Then I sign-in as John_filson@hotmail.co.uk and 123filson
    Then Confirm User John is logged in
    Then check the weather
    Then search weather in Newcastle upon Tyne
    Then add to my locations





