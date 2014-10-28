Feature: Test prime functionality

As a user of String Magic
I want to be able to test a string
So that I can easily determine whether it has a prime number of letters.

@Prime
#This will test if the prime feature works for strings
Scenario: String has a prime number of letters
Given the user enters fishing
When the user hits enter
Then the response is "You wrote a word that is prime!"

@Prime
#This will test if the prime feature works for strings
Scenario: String does not have a prime number of letters
Given the user enters cars
When the user hits enter
Then the response is "You wrote a word that is not prime!"




