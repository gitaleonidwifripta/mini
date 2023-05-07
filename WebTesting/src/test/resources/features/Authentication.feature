
Feature: Authentication

  @Register
  Scenario: As a user I have successfully registered
    Given me on the register page
    When I enter a full name "Gitaleoniii"
    And I entered a email "Gitale40@gmail.com"
    And I entered a password "gitale908989"
    And I click the register button
    Then I'm on the login page

  @Login
  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter email "Gitale40@gmail.com"
    And I enter password "gitale908989"
    And I click login button
    Then I am on the home page

