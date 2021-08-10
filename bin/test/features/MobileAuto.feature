@Android
Feature: Login

  @Positive
  Scenario Outline: Positive Login Feature
    Given User is on app login page
#    registered user name and password
    When User input app username "<username>"
    And User input app password "<password>"
    And User click app login button
    Then User is on app home page
    Examples:
      | username         | password |
      | nauval@dummy.com | 123456   |

  @Negative-1
  Scenario Outline: Username and password not registered
    Given User is on app login page
#    username and password not registered
    When User input app username "<username>"
    And User input app password "<password>"
    And User click app login button
    Then User see toast message
    Examples:
      | username               | password |
      | jarwokuat123@dummy.com | jarwo123 |

    @Negative-2
    Scenario Outline: Wrong email format
      Given User is on app login page
      When User input app username "<username>"
      And User input app password "<password>"
      And User click app login button
      Then User see warning message
      Examples:
      |username|password|
      |nauval  |123456  |

