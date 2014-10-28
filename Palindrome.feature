As a user of String Magic
I want to be able to test a non-numeric string
So that I can easily determine whether it is a palindrome.

Feature: Test palindrome functionality

@PalindromeString
#This will test if the palindrome feature works for non-numeric strings
Scenario: String is non-numeric and a palindrome
#Given the user enters a string that is not a number and is a palindrome
When the user enters racecar
When the user hits enter
Then the response is "You wrote a palindrome!"

@PalindromeString
#This will test if the palindrome feature works for non-numeric strings
Scenario: String is non-numeric and not a palindrome
#Given the user enters a string that is not a number and is not a palindrome
Given the user enters cars
When the user hits enter
Then the response is "You wrote neither a number nor a palindrome!"

Then the user receives output denying the string as a palindrome

###
private String _word;

@Given("The user enters (.*)$")
public void setWordTo (String s){
	_word = s;
}

private String _output;

@When ("the user hits enter$")
public void runHandlePalindrome() {
	StringMagic magicMaker = new StringMagic();
	_output = magicMaker.handlePalindrome(_word);
}

@Then ("^the response is \"([^\"]*)\"$")
public void theResponseIs(String expected) {
	assertEquals(expected, _output);
}
###


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





