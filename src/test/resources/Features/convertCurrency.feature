Feature: Verify user able to convert currency

  Scenario Outline: Verify user convert currency from USD to INR
    Given User is on xe website
    When User enter "<amount>" select currency from and to country
    And User click convert button
    Then User should print the converted amount

    Examples: 
      | amount | 
      |      5 | 
