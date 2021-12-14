package week1.day2.classroom.arrays;
import java.util.ArrayList;

import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> val=new ArrayList<Integer>();
		for(int var:arr)
		{
			val.add(var);
		}
		
		System.out.println(val);
		
		
		for(int i=1;i<val.size();i++)
		{
			if(val.get(i-1)!=i)
				{System.out.println(i);
			break;
				}
		}

	}

}

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
				
		

	}

}
