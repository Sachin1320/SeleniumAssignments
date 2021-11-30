package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array
		Arrays.sort(arr);
		

		// loop through the array (start i from arr[0] till the length of the array)
		for(int i=0;i<arr.length;i++)
		{

			// check if the iterator variable is not equal to the array values respectively
			if(i!=arr[i-0])
			{
			
				// print the number
				System.out.println(i);
			}
				
				// once printed break the iteration
				break;
				
				
		

	}

  }
}
