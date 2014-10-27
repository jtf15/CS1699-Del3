public class StringMagic{



	public static boolean isNumber(String word){
		try
		{
			Integer.parseInt(word) ;
			
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public static boolean isPalindrom(String word){
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
	
	
	
	public static void main(String[] args){
		
		if(isNumber(args[0]) && isPalindrom(args[0])){
			System.out.println("You wrote a number that is a palindrome!");
		}else if(isPalindrom(args[0])){
			System.out.println("You wrote a palindrome!");
		}else if(isNumber(args[0])){
			System.out.println("You wrote a number!");
		}else{
			System.out.println("You wrote neither a number nor a palindrome!") ;
		}
		
	}
}