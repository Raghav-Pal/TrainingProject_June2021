Feature: test login functionality

  Scenario Outline: test login with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Admin    | hUKwJTbofgPU9eVlw/CnDQ== |
      | Admin123 | hUKwJTbofgPU9eVlw/CnDQ== |
