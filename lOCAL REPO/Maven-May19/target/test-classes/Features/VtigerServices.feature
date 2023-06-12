Feature: Create Nes Sales Service

  Background: 
    Given user is already on login page
    And user has logged In successfully with correct data
    And click on Navigation Bar
    And go to sales and select services
Scenario Outline: add new Service
    When click on add new service
    And Enter serviceName as <CName> , webSite as <website> and Click on Save Button
    And click on Services Header link
    Then Verify if services created or not
    	And close the browser

    Examples: 
      | CName      			   | website             |
      | JayConstruction    | www.jayghodekar.com |
      | SameerConstruction | www.sameerbude.com  |
Scenario: delete created Service
		When click on all services check box
		And click on delete logo button
		And click on confirmation popUp
		Then verify if services deleted or not
		And close the browser