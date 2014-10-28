Feature: Test wordSum functionality

As a user of String Magic
I want to be able to test a string
So that I can easily determine the sum of the value of its characters, ranging from A = 1 to Z = 26.

@WordSum
#This will test if the wordSum feature works for strings with values a - z (all lowercase)
Scenario: String has all valid lowercase characters
Given the user enters cat wordSum
When the user hits enter
Then the response is "You wrote a string with sum 24!";

@WordSum
#This will test if the wordSum feature works for strings with values A - Z (all uppercase)
Scenario: String has all valid uppercase characters
Given the user enters BAT wordSum
When the user hits enter
Then the response is "You wrote a string with sum 23!";

@WordSum
#This will test if the wordSum feature works for strings with values a - z and A - Z (mixed lowercase and uppercase)
Scenario: String has all valid uppercase characters
Given the user enters HaT wordSum
When the user hits enter
Then the response is "You wrote a string with sum 29!";

@wordSum
#This will test if the wordSum feature works for strings with integer values
Scenario: String has no valid characters
Given the user enters 1234 wordSum
When the user hits enter
Then the response is "You wrote a string that is not valid for this feature!"

@wordSum
#This will test if the wordSum feature works for strings with some valid characters
Scenario: String has same valid characters
Given the user enters bat1234 wordSum
When the user hits enter
Then the response is "You wrote a string that is not valid for this feature!"


