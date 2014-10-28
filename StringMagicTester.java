public class StringMagicTester {
	public static void main(String[] args){
	StringMagic sM = new StringMagic ();	
	
	// First arg handles word to be tested
	// Second arg handles functionality to be tested
	
		if (args.length > 1) {
		
			if(args[1].equalsIgnoreCase("Palindrome")){
				sM.handlePalindrome(args[0]);
			}
			else if(args[1].equalsIgnoreCase("Reverse")){
				sM.reverseString(args[0]);
			}
		}
		else {
			System.out.println("fail");
		}
		
	}
}