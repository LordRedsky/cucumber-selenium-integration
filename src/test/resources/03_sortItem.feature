@web
  Feature: Sort Item

    @positive-test
    Scenario: Sort item from high price to low
      Given user is on login page
      When  user already logged in with valid email
      And user redirect to homepage
      And user click sort icon
      And user click options "Price (high to low)"
      And validate that the items are sorted properly