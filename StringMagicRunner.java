public class StringMagicRunner {
// This provides a usable front-end to our system

	public static void main(String[] args){
	StringMagic sM = new StringMagic ();	
	
	// First arg handles word to be tested
	// Second arg handles functionality to be tested
	
		if (args.length > 1) {
		
			if(args[1].equalsIgnoreCase("palindrome")){
				System.out.println(sM.handlePalindrome(args[0]));
			}
			else if(args[1].equalsIgnoreCase("reverse")){
				System.out.println(sM.reverseString(args[0]));
			}
			else if(args[1].equalsIgnoreCase("prime")){
				System.out.println(sM.isStringPrime(args[0]));
			}
			else if(args[1].equalsIgnoreCase("wordSum")){
				System.out.println(sM.handleWordSum(args[0]));
			}
		}
		else {
			System.out.println("You did not provide valid input. Program will exit.");
		}
	}
}