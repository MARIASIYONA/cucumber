Feature: Test login functionality

  Scenario Outline: Check login using valid crendentials
    Given browser is open
    And user is on loginpage
    When user enters <username> and <password>
    And user clicks login page
    Then user is navigated to home page

    Examples: 
      | username | password |
      | maria    |    12345 |
      | rima     |    12345 |
