package week1.day2.classroom.string;

public class CharOccurance {
	
	public static void main(String[] args) {
			String str = ("welcome to chennai");
			int count=0;
			
			System.out.println(str);
			
			char charArray[]=str.toCharArray();
			int len=charArray.length;
			
			for(int i=0;i<len-1;i++)
			{
				if(charArray[i]=='e')
					count++;
					
					
			}
			
			if(count>0)
				System.out.println("The number of time 'e' occured is "+count );
		}

	}
		// Check number of occurrences of a char (eg 'e') in a String

			// declare and initialize a variable count to store the number of occurrences
			
			// convert the string into char array
				
			//get the length of the array
				
			// traverse from 0 till the array length 
				
				// Check the char array has the particular char in it 
			
				// if is has increment the count
					 
				
				// print the count out of the loop
					
	}

}
