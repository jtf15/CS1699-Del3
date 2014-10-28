As a user of String Magic
I want to be able to reverse a string or number
So that I can easily obtain a backwards version of any string or number.

Feature: Test reverse functionality

@ReverseString
#This will test if the reverse string feature works
Scenario: Reverse String
Given the user enters a string that is not a number
When the user enters the string
Then the string shall be displayed in reverse



#This test will determine if reverse an integer works
@ReverseInteger
Scenario: Reverse Integer
Given the user enters an integer
When the user enters the integer
Then the integer shall be displayed in reverse


