Feature: Test reverse functionality

As a user of String Magic
I want to be able to reverse a string or number
So that I can easily obtain a backwards version of any string or number.

@ReverseString
#This will test if the reverse string feature works
Scenario: Reverse String
Given the user enters a hello reverse
When the user hits enter
Then the response is olleh

@ReverseInteger
#This test will determine if reverse an integer works
Scenario: Reverse Integer reverse
Given the user enters 2001
When the user hits enter
Then the response is 1002

#This test will determine if the reverse feature can detect palindromes
@ReversePalindrome
Scenario: Reverse Palindrome
Given the user enters racecar reverse
When the user hits enter
Then the response is racecar

