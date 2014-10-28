public class StringMagic {
	
	// This function tests if a string is an int for the palindrome feature
	public boolean isNumber(String word){
		try
		{
			Integer.parseInt(word) ;
			
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	// This function tests if a string is a palindrome for the palindrome feature
	public boolean isPalindrome(String word){
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1) {
			if (word.charAt(i1) != word.charAt(i2)) {
				return false;
			}
			++i1;
			--i2;
		}
		return true ;
	}
	
	// This feature reverses a string, if it is not a palindrome (and thus, already reversed)
	public String reverseString(String word){
		
		if(isPalindrome(word)){
			return "Your string was already reversed!" ;
		}
		
		int i1 = word.length() - 1;
		String temp = "";
		while( i1 >= 0){
			temp += word.charAt(i1) ;
			i1--;
		}
		return "Your reversed string is " + temp ;
	}
	
	// This feature determines whether a string is an integer number and/or a palindrome
	public String handlePalindrome (String word) {	
		if(isNumber(word) && isPalindrome(word)){
			return("You wrote a number that is a palindrome!");
		}
		else if(isPalindrome(word)){
			return("You wrote a palindrome!");
		}
		else if(isNumber(word)){
			return("You wrote a number but not a palindrome!");
		}
		else{
			return("You wrote neither a number nor a palindrome!") ;
		}
	}
	
	private boolean isPrime (int n) {
		for (int i = 2; i < n; i ++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	
	// This feature tells you if a word is "prime" 
	// If the input string is an integer, the integer itself will be tested for primality
	// If the input string is not an integer, the number of characters in the string will be tested for primality
	public String isStringPrime (String word) {
		
		if (isNumber(word)) {
		// The input string is an int, so test if the number is prime
			if (isPrime(Integer.parseInt(word))) {
				return "You wrote a number that is prime!";
			}
			else {
				return "You wrote a number that is not prime!";
			}
		}
		
		// The input string is not an int, so test if the number of characters is prime
		if (isPrime(word.length())) {
			return("You wrote a string that is prime!");
		}
		else {
			return("You wrote a string that is not prime!");
		}
	}
	
	// This function determines whether every char in the given word falls between (a and z) or (A and Z)
	private boolean charsAreInAlphabet(String word) {
		if (word.length() == 0)
			return false;
		
		for (char c : word.toCharArray()) {
			if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) return false;
		}
		return true;
	}
	
	// This function helps the wordSum feature
	// It assumes that all chars are in the a-z || A-Z alphabet
	private int getCharValue (char c) {
		c = Character.toLowerCase(c);
		return c - 96;
	}
	
	// This feature takes a string of all chars that are a-z || A-Z and adds their numeric values
	// Num values are assigned in alphabetic order, capitalization ignored
	// A is 1, B is 2 ... Z is 26
	public String handleWordSum (String word) {
		if (!charsAreInAlphabet(word))
			return "You wrote a string that is not valid for this feature!";
		
		int sum = 0;
		
		for (char c : word.toCharArray()) {
			sum += getCharValue(c);
		}
		
		return "You wrote a string with sum " + sum + "!";
	}
	
	
	
	
	
	
	
	
	// This feature determines 
	/*public String substringPalindrome (String word, int x) {
		
	}*/
}