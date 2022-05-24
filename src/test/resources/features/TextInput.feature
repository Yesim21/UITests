@Regression
Feature:UI tests for "uitestingplayground.com" website

  Background:
    Given User is on home

  @TextInput
  Scenario: Checking Text Input Event
    Given user clicks on Text Input
    When user writes text "me" into the input field and pressing the button
    Then user verifies the button name is changing as "me"