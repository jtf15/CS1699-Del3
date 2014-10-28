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
	
	public static String reverseString(String word){
		
		if(isPalindrom(word)){
			return "Your string was already reversed!" ;
		}
		
		int i1 = word.length() - 1;
		String temp = "";
		while( i1 >= 0){
			temp += word.charAt(i1) ;
			i1--;
		}
		return temp ;
	}
	
	
	public static void main(String[] args){
		
		if(args[1].equalsIgnoreCase("Palindrome")){
		
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
		if(args[1].equalsIgnoreCase("Reverse")){
			System.out.println("Your reversed string is " + reverseString(args[0])) ;
		}
		
	}
}