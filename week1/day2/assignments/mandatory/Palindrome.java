package week1.day2.assignments.mandatory;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
	public static void main(String[] args) {
		String str="madam";
		String rev = "";
		 int length = str.length(); 
		 for ( int i = length - 1; i >= 0; i-- )  
	         rev = rev + str.charAt(i);  
			System.out.println(rev);
		   if (str.equalsIgnoreCase(rev))  
		         System.out.println("Given string is a palindrome"); 
		   else
			   System.out.println("Given string is not a Palindrome");
	}
		
	}
     
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

}
