Feature: Login to Orange HRM and Validate Title

  Scenario Outline: Login to Orange HRM with <flow> and Validate Title
    Given user already on OrangeHRM login Page
    When user type <username> in uesername field
    And user type <password> in password field
    And user click on login button
    Then user validate Title with <title>
    And user close Orange HRM Browser

    Examples: 
      | flow    | username | password | title     |
      | valid   | Admin    | admin123 | OrangeHRM |
      | invalid | Admin    | ""       | OrangeHRM |
      | invalid | ""       | admin123 | OrangeHRM |
