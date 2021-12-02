package week1.day2.assignments.mandatory;

public class ReverseEvenWords {
	
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
	 public static void main(String[] args) {
			String str = "I am a software tester";
			String[] splitArr = str.split(" ");
	                for (int i = 0; i < splitArr.length; i++) {
			}
		        for (int i = 0; i < splitArr.length; i++) {
				    	if (i % 2 != 0) {
				    		char arr1[] = splitArr[i].toCharArray();
							for (int j = (arr1.length) - 1; j >= 0; j--) {
								System.out.print(arr1[j]);
							}
							System.out.print(" ");	
					}

					else {
						System.out.print(splitArr[i]);
						System.out.print(" ");
					}

				}
		}
	}

  


			/* Pseudo Code:
			 
			 * Declare the input as Follow
		      		String test = "I am a software tester"; 
			a) split the words and have it in an array
			b) Traverse through each word (using loop)
			c) find the odd index within the loop (use mod operator)
			
			d)split the words and have it in an array
			
			e)print the even position words in reverse order using another loop (nested loop)
			f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
			
			 
		*/

}
