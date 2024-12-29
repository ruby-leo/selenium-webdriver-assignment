#Assignment 4:
#Requirement: Implement a test case using WebDriver to validate the functionality of a registration form.
Feature: Registration form verification
  Background:
    Given I am on the registration page

  #Happy path
  Scenario: Successful registration
    When I enter a valid email
    And I enter a valid password
    And I check the Terms and Conditions checkbox
    And I click the Sign Up button
    Then I should be redirected to the home page

  #Negative Scenarios
  #Note: The third example below will fail due to a bug in the app
  @scenario2
  Scenario Outline: Registering with invalid input
    When I enter email "<email>"
    And I enter password "<password>"
    And set terms and conditions "<checkbox>"
    And I click the Sign Up button
    Then I should see error message "<error_message>"

    Examples:
      | email           | password  | checkbox  | error_message                                   |
      | invalid@email   | valid123$ | checked   | Error: The email address is badly formatted.    |
      | valid@email.com | pass1     | checked   | Error: Password should be at least 6 characters |
      | valid@gmail.com | valid123$ | unchecked | Error: Please agree to terms and conditions     |