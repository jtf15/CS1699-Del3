Feature: Test prime functionality

As a user of String Magic
I want to be able to test a string
So that I can easily determine whether it is a prime integer, or, if it is not an integer, whether it has a prime number of letters.

@Prime
#This will test if the prime feature works for strings that are not integers
Scenario: String has a prime number of letters
Given the user enters fishing
When the user hits enter
Then the response is "You wrote a string that is prime!"

@Prime
#This will test if the prime feature works for strings that are not integers
Scenario: String does not have a prime number of letters
Given the user enters cars
When the user hits enter
Then the response is "You wrote a string that is not prime!"

@Prime
#This will test if the prime feature works for strings that are integers
Scenario: String is a prime number
Given the user enters 17
When the user hits enter
Then the response is "You wrote a number that is prime!"

@Prime
#This will test if the prime feature works for strings that are integers
Scenario: String is not a prime number
Given the user enters 18
When the user hits enter
Then the response is "You wrote a number that is not prime!"


