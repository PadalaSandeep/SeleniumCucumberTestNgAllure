@Smoke
Feature: Google homepage

  Scenario: Verify that user is able to type in Google search
    Given When user open url: "https:www.google.com"
    Then type "Enjoy" in search box
