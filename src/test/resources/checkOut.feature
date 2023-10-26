@web
Feature: Checkout

  @positive-test
  Scenario: Checkout with input valid shipping address
    Given user is on login page
    When  user already logged in with valid email
    And user click add to cart for one item "Sauce Labs Bolt T-Shirt"
    And user validate number of item shows correct number with "1"
    And user click cart icon
    And use click checkout button
    And user fill in the shipping address with:
      | First name | Lord   |
      | Last name  | Redsky |
      | Zip code   | 232425 |

    And user click continue
    And user click finish
    Then user transaction is successfully and there will appear icon Pony Express

  @negative-test
  Scenario: Checkout with input invalid shipping address
    Given user is on login page
    When  user already logged in with valid email
    And user click add to cart for one item "Sauce Labs Bolt T-Shirt"
    And user validate number of item shows correct number with "1"
    And user click cart icon
    And use click checkout button
    And user fill in the shipping address with empty data
    And user click continue
    Then user user see error message "Error: First Name is required"
