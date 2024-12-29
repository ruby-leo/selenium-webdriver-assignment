#Assignment 2:
#Requirement: Implement a Page Object Model for a login page using WebDriver.
#Pages are under PageFactories folder
Feature: Login Page function verification with POM

  Scenario: Successful login
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the inventory page

  Scenario Outline: Invalid Login Attempts
    Given I am on the login page
    When I enter username "<username>" and password "<password>"
    And I click on the login button
    Then I should see an error message "<errorMessage>"

    Examples:
      | username        | password         | errorMessage                                                              |
      | locked_out_user | secret_sauce     | Epic sadface: Sorry, this user has been locked out.                       |
      | invalid_user    | secret_sauce     | Epic sadface: Username and password do not match any user in this service |
      |                 | secret_sauce     | Epic sadface: Username is required                                        |
      | standard_user   |                  | Epic sadface: Password is required                                        |
      | standard_user   | invalid_password | Epic sadface: Username and password do not match any user in this service |