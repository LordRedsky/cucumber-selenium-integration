@web
Feature: Chekout

  @positive-test
  Scenario: Chekout with valid payment data for one product
    Given user is on login page
    When  user already logged in with valid email
    And user click add to cart for one item "Sauce Labs Bolt T-Shirt"
    And user vaidate number of item shows correct number with "1"
    And user click cart icon
    And use chick chechout button
    And user fill in the shipping address with:
    | First name  | Lord   |
    | Last name   | Redsky |
    | Zip code    | 232425 |

    And user click continue
    And user click finish
    Then user transaction is successfully and there will appear icon Pony Express
