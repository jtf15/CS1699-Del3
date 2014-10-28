import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;

import static org .junit.Assert.assertEquals;

public class ReverseStepDefs {

	@Given("the user enters (.*)")
	public void setWordTo (String s){
		_word = s;
	}

	private String _output;

	@When ("the user hits enter$")
	public void runIsWordPrime() {
		StringMagic magicMaker = new StringMagic();
		_output = magicMaker.reverseString(_word);
	}

	@Then ("^the response is (?!" + _word + ").{" + _word.length() + "}$")
	public void theResponseIs(String expected) {
		assertEquals(expected, _output);
	}	


}