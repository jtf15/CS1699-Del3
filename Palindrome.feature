As a user of String Magic
I want to be able to test a non-numeric string
So that I can easily determine whether it is a palindrome.

Feature: Test palindrome functionality

@PalindromeString
#This will test if the palindrome feature works for non-numeric strings
Scenario: String is a palindrome
Given the user enters a string that is not a number and is a palindrome
When the user enters the string
Then the user receives output confirming the string as a palindrome

@PalindromeString
#This will test if the palindrome feature works for non-numeric strings
Scenario: String is not a palindrome
Given the user enters a string that is not a number and is not a palindrome
When the user enters the string
Then the user receives output denying the string as a palindrome

@PalindromeInteger
#This test will determine if the palindrome feature works
Scenario: String is a palindrome and an integer
Given the user enters a string that is a number and is a palindrome
When the user enters the integer
Then the user receives output confirming the integer as a palindrome and an integer

@PalindromeInteger
#This test will determine if the palindrome feature works
Scenario: String is a palindrome and an integer
Given the user enters a string that is a number and is not a palindrome
When the user enters the integer
Then the user receives output denying the integer as a palindrome and an integer





