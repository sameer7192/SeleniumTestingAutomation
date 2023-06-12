

Feature: Go to pharmacy, select Dolo650, Add and delete from cart
  
  
  Scenario: Go to pharmacy website, add dolo650 in cart and remove it from cart
  
    Given User is already on pharmacy home page
    When user search for Dolo 650 tablet in search field
    And choose 2nd option of strip of 15tablets
    And go to Add to cart
    And choose quantity as 3nos
    Then User validate dolo 650 is added to cart
    And user delete dolo 650 added in cart
    And User close the browser


  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
