#Assignment 1:
#Requirement: Write a WebDriver script to navigate to a website and click on a specific link
Feature: Click a link function
  Scenario: Validate About link function
    Given User has opened "https://www.google.com/"
    And user has clicked About link
    Then About page should be displayed