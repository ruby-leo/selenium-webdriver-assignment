#Assignment:3
#Requirement: Write a WebDriver script to handle a dropdown and select an option based on specific criteria.
Feature: Dropdown functionality check
    Scenario: Select dropdown option based on specific criteria
      Given I am on the Test page
      When the value is set randomly
      Then the dropdown should have corresponding dropdown option
