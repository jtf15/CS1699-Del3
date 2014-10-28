Feature: Testing isNumber
As a user of String Magic
I want to be able to tell if a string is a number
So that my programs can easily distinguish between the two


#Tests a valid number
@ValidInteger
Scenario: Valid Integer
Given the user enters a valid number
When it is checked
Then the user should see "You wrote a number!"

#Tests not a number
@InvalidInteger
Scenario: Not an integer
Given the user does not enter a number
When it is checked
Then the user should not see anything