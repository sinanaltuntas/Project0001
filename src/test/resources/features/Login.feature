@wip
Feature: Login

  Scenario: As a user, I should be able to login with valid credentials
    Given User should open login page
    When User should enter valid username and password
    Then User should see main page


  Scenario: As a user, I should not be able to login with invalid credentials
    Given User should open login page
    When User should enter invalid username and password
    Then User should see error



