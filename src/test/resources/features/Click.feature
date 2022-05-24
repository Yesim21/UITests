@Regression
Feature:UI tests for "uitestingplayground.com" website

  Background:
    Given User is on home

  @Click
  Scenario: Checking Click Event
    Given user clicks on Click
    When user clicks on Button
    Then user verifies Button That is green color