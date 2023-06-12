Feature: Create and Delete ActiTime Task

  Scenario: User create task as Automation Tester
    Given User already on ActiTime Login Page
    And User login with valid username and password
    And User goes to Task Creattion Window and click on add new task
    And user click on new task
    When User select Customer as Galaxy Corporation and Project as Android Testing
    And User enter task name as Automation Tester
    And User click on create task buton
    Then User should verify Task created or not
    And click on check box and click on delete logo
    And click on delete permanently popUp
    And user should verify task deleted or not
    And close the browser
