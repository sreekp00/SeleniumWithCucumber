Feature: Login into account
  Existing user should be able to login to the account with valid credentials

  Scenario: Login to account with correct credentials
    Given User navigates to stackoverflow website
    And User clicks on the login button on home page
    And User enters a valid user name
    And User enters a valid password
    When User clicks on the login button
    Then  User should be taken to the successful login page
