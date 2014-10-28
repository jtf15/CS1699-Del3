public class StringMagic {
	public boolean isNumber(String word){
		try
		{
			Integer.parseInt(word) ;
			
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
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
	
	public String handlePalindrome (String word) {	
			if(isNumber(word) && isPalindrome(word)){
				return("You wrote a number that is a palindrome!");
			}else if(isPalindrome(word)){
				return("You wrote a palindrome!");
			}else if(isNumber(word)){
				return("You wrote a number but not a palindrome!");
			}else{
				return("You wrote neither a number nor a palindrome!") ;
			}
	}
}