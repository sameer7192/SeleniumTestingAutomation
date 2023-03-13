Feature: Create Get Update and Delete User API Testing

  Scenario: Create User API Testing
    Given Create User payload "Rahul Sharma" "rahul.sharma@15ce.com" "male" "active"
    When User calls CreateUser API using POST method
    Then The API call got success with status code 201
    And "email" in response body is "rahul.sharma@15ce.com"
