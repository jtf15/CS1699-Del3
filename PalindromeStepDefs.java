import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;

import static org .junit.Assert.assertEquals;

public class PalindromeStepDefs {

	private String _word;

	@Given("the user enters (.*) palindrome")
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
}