package week1.day2.classroom.arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSe

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
			Set<Integer> val=new TreeSet<Integer>();
			for(int var:data)
			{
				val.add(var);
			}
			
			List<Integer> val2=new ArrayList<Integer>();
			val2.addAll(val);
			System.out.println(val2);
			System.out.println(val2.get(val2.size()-2));
		}

	
}


		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		

		
