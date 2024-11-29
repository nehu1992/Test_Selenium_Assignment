Feature: Testing Feature
  Scenario: Signup on website
    Given I Open the website
    And I click on createAccount Link
    And Enter User Details
    And Click on Create an Account button
    Then Check user account

  Scenario: Login To Website
    Given I Open the website
    And Click on signin link
    And Enter username and password
    And Click on signin button
    Then Check user account