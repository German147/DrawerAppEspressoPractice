

Feature: Enter Login Details

  Scenario Outline: Successful Login

    Given I start the application
    When I enter valid email <email>
    And I enter valid password <password>
    And I close the keyboard
    And I click sign in button
    Then I expect to see successful login message
    Examples:
      | email | password |