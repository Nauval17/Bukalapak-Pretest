@Web
Feature: Login

  Background:
    Given User open Bukalapak website

  @Manual
  Scenario: Check login feature
    Given User is on Bukalapak homepage
    When User choose to login
    And User is on Login Page
    And User input username "username"
    And User input password "password"
    And User click login button
    And Profile button is available
    And User click profile button
    Then User log out
    And User is on Bukalapak homepage

  @Facebook
  Scenario: Login via Facebook
    Given User is on Bukalapak homepage
    When User choose to login
    And User is on Login Page
    And User choose to login via facebook
    And User is on facebook login page
    And User input facebook username "username"
    And User input facebook password "password"
    And User confirm facebook account
    And Profile button is available
    And User click profile button
    Then User log out
    And User is on Bukalapak homepage

  @Google-1
  Scenario: Login via google account that have been opened in the device
    Given User is on Bukalapak homepage
    When User choose to login
    And User is on Login Page
    And User choose to login via google
    And User is on google account choosing
    And User choose google account "account"
    And Profile button is available
    And User click profile button
    Then User log out
    And User is on Bukalapak homepage

  @Google-2
  Scenario: Login via google account by entering new google account
    Given User is on Bukalapak homepage
    When User choose to login
    And User is on Login Page
    And User choose to login via google
    And User choose another account "account"
    And User input google email "email"
    And User input google password "password"
    And Profile button is available
    And User click profile button
    Then User log out
    And User is on Bukalapak homepage