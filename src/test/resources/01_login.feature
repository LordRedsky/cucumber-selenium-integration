@web
Feature: Login


  @positive-test
  Scenario: Login with valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user redirect to homepage

  @negative-test
  Scenario: Login with valid username and invalid password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid_password"
    When user click login button
    Then user see error message "Epic sadface: Username and password do not match any user in this service"