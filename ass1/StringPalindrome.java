package week3.day1.ass1;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str="madam"; // len=5
		String rev=""; //null
		for(int i=str.length()-1;i>=0;i--) {
			
			//index[4='m'] and + for concadination of char
			        rev=rev+str.charAt(i);
			        
			        
			        
		}System.out.println("reverse word: " +rev);

		if(str.equals(rev)) {
			System.out.println("the given string is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
