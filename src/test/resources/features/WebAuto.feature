@Web
Feature: Login

  Background:
    Given User open Bukalapak website

  @Manual
  Scenario Outline: Check login feature
    Given User is on Bukalapak homepage
    When User choose to login
    And User is on Login Page
    And User input username "<userName>"
    And User input password "<password>"
    And User click login button
    And Profile button is available
    And User click profile button
    Then User log out
    And User is on Bukalapak homepage
    Examples:
      | userName                  | password      |
      | nauval.shafiq17@gmail.com | @elinsUGM2015 |
#      | nauvalshafiq              | @elinsUGM2015 |
#      | 085799212089              | @elinsUGM2015 |
