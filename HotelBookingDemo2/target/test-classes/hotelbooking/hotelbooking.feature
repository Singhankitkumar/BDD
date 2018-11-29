
Feature: Hotel Booking details


  
  Scenario: User is on the Booking Page
    Given User is on Booking page
    When First name is blank
    Then Display error message 'Please fill the First Name'
   
    Scenario: User is on the Booking Page
    Given User is on Booking page
    When Last name is blank
    Then Display error message 'Please fill the Last Name'
    
      Scenario: User is on the Booking Page
    Given User is on Booking page
    When Email is blank
    Then Display error message 'Please fill the Email'
    
     Scenario: User is on the Booking Page
    Given User is on Booking page
    When Email is invalid
    Then Display error message 'Please enter valid Email Id.'
    
    Scenario: User is on the Booking Page
    Given User is on Booking page
    When Phone number is blank
    Then Display error message 'Please enter phone number.'
    
    Scenario: User is on the Booking Page
    Given User is on Booking page
    When Phone number is invalid
    Then Display error message 'Please enter valid Contact number'
  
 	Scenario: Select city
    Given User is on Booking page
    When city is blank
    Then Display error message 'Please select city'
 
 		Scenario: Select state
    Given User is on Booking page
    When state is blank
    Then Display error message 'Please select state'
    
    Scenario: Gender not Selected
    Given User is on Booking page
    When user not selected gender
    Then Display alert for Gender Field
    
     
    
    Scenario: RoomType not Selected
    Given User is on Booking page
    When user not selected Roomtype
    Then Display alert for Roomtype Field
    
    Scenario: Cardholder name is empty
    Given User is on Booking page
    When Cardholdername is empty
    Then Display alert for Cardholder Field
    
     Scenario: Debit Card is empty
    Given User is on Booking page
    When DebitCard is empty
    Then Display alert for Debitcard Field
    
     Scenario: CVV is empty
    Given User is on Booking page
    When CVV is empty
    Then Display alert for CVV Field
    
     Scenario: Expiration Month is empty
    Given User is on Booking page
    When Expiration Month is empty
    Then Display alert for CardMonth Field
    
    Scenario: Expiration Year is empty
    Given User is on Booking page
    When Expiration year is empty
    Then Display alert for CardYear Field
    
    Scenario: All Details are correct
    Given User is on Booking page
    When All Details are correct
    Then Display Booking page
    
    
    
    