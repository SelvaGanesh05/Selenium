Feature: To validate facebook functionality using diffrent credentials

  Scenario Outline: To validate login using diffrent crendentials
    Given User should be in facebook login page
    When User enter values to emailfeild "<emailfeild>" and passwordfeild "<passfeild>"
    And User enter the login button
    Then User quit the browser

    Examples: 
      | emailfeild | passwordfeild |
      | Selva      | Selva@123     |
      | Sam        | Sam@123       |
      | Prakash    | Prakash@123   |
