Feature: Test palindrome functionality

As a user of String Magic
I want to be able to test a string or integer
So that I can easily determine whether it is a palindrome.

@PalindromeString
#This will test if the palindrome feature works for non-numeric strings
Scenario: String is non-numeric and a palindrome
Given the user enters racecar
When the user hits enter
Then the response is "You wrote a palindrome!"

@PalindromeString
#This will test if the palindrome feature works for non-numeric strings
Scenario: String is non-numeric and not a palindrome
Given the user enters cars
When the user hits enter
Then the response is "You wrote neither a number nor a palindrome!"

@PalindromeInteger
#This test will determine if the palindrome feature works for numeric strings
Scenario: String is an integer and a palindrome
Given the user enters 12321
When the user hits enter
Then the response is "You wrote a number that is a palindrome!"

@PalindromeInteger
#This test will determine if the palindrome feature works for numeric strings
Scenario: String is an integer but is not a palindrome
Given the user enters 12345
When the user hits enter
Then the response is "You wrote a number but not a palindrome!"




