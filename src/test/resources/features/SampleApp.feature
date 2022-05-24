@Regression
Feature:UI tests for "uitestingplayground.com" website

  Background:
    Given User is on home

  @SampleApp
  Scenario: Checking Sample App Event
    Given user clicks on Sample App
    When user provides user name "yesim"
    And user provides password as "pwd"
    And user clicks on login in button
    Then user verifies "Welcome, yesim!" text