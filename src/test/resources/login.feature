@Login
Feature: Login

  @valid-login
  Scenario: Login with valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user redirect to homepage

    @invalid-login
  Scenario: Login with valid username and invalid password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid_password"
    When user click login button
    Then user stays on the login page
      And user see error message