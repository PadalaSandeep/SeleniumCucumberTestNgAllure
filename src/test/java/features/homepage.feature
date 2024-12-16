@Smoke
Feature: Youtube homepage

  Scenario: Verify that youtube homepage is able to open
    Given When user open url: "https://tutorialsninja.com/demo/"
    Then validate youtube page is loaded properly
