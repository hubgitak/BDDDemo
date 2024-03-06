Feature: To test login functionality

  Scenario Outline: Check the login is successful with valid credentials
    Given browser is open
    And user is on login page
    When User enters <login name> and <password>
    And click on login button
    Then User is navigated to the home page

    Examples:
      | login name | password |
      | kundan     | 12345    |
      | varsha     | 12345    |