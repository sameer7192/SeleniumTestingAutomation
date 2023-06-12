Feature: Create contact in Vtiger application

Background: 
Given user is in login page
    And user login successfully with correct data
		And click on menu bar
    And go to Marketing and select Contact 
    
    Scenario Outline: Add contacts with <fname>
    When User click on add contact
    And user enter firstname as <fname>, lastname as <lname>, mobilenumber as <number> and click on save button
    And click on contact header link
    Then check contacts is created or not
    And close the browser
    
    
    Examples: 
    |fname		|lname		|number			|
    |sameer		|bude			|9130186316	|
    |jayendra	|ghodekar	|8356042123	|
    
    
   Scenario: Delete all contacts
   When user selects on all contact check box
   And click on delete logo
   And click on confirmation popup
   Then verify if contacts is deleted or not
   And close the browser
   
    
    