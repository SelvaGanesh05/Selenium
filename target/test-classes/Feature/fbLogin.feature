Feature: To validate the login functionality of facebook

  Scenario: To validate login function using invalid credentials
    Given User must be in the facebook login page
    When User enter the valid username and invalid password
      | userKey | passKey     | emailKey                 | mobileKey  |
      | Selva   | Selva@123   | Selvaganesh123@gmail.com | 9876543210 |
      | Sam     | Sam@123     | Sam123@gmail.com         | 1234567890 |
      | Prakash | Prakash@123 | Prakash123@gmail.com     | 0987654321 |
    And User click the login button
    Then User must be in invalid page
