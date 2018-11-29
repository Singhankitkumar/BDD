
Feature: Hotel Login Functionality

  Scenario: Username password not entered
    Given User is on login page
    When username password is blank
    Then Display Error message'Please enter Username'
  
  Scenario: password is blank
    Given User is on login page
    When username is given but password is blank
    Then Display Error message'Please enter password'

Scenario: Invalid username and password entered
    Given User is on login page
    When Invalid username and password entered 
    Then Display Alert'Invalid Login'
 
 Scenario: Valid username and password entered
    Given User is on login page
    When username and password entered is correct 
    Then Redirect the user to hotelbooking page