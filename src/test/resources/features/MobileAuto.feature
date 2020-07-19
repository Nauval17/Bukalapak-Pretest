@Android
Feature: Login

  @Positive
  Scenario Outline: Checking login function
    Given User is on app login page
    When User input registered username "<username>"
    And User input registered password "<password>"
    And User click app login button
    Then User is on app home page
    Examples:
      | username                 | password    |
      | nauval@dummy.com         | 123456      |
#      | jarwokuat123@dummy.com   | jarwo123    |
#      | cilacap.santai@dummy.com | cilacap@123 |