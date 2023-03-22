Feature: feature to test login functionality

  Scenario: Is Login successful with valid credentials?
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then verify that succesfull login



