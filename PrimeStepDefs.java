import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;

import static org .junit.Assert.assertEquals;

public class PrimeStepDefs {

	// These step definitions map to the Prime feature file. Each test is utilized in each scenario
	private String _word;

	@Given("the user enters (.*) prime$")
	public void setWordTo (String s){
		_word = s;
	}

	private String _output;

	@When ("the user hits enter$")
	public void runIsWordPrime() {
		StringMagic magicMaker = new StringMagic();
		_output = magicMaker.isStringPrime(_word);
	}

	@Then ("^the response is \"([^\"]*)\"$")
	public void theResponseIs(String expected) {
		assertEquals(expected, _output);
	}	
}