package collection.program;//6-4-22

import java.util.Arrays;
import java.util.List;

  // Array Class => This method is part of Collections in java used to create and manipulate java Arrays
          //        Here all methods are satic and can be accessed using class name
         //         We can't crate object of Arrays class
   // Array = data type and Arrays = Class


public class ArrayClass {

	public static void main(String[] args) {
		
		String days[] = {"thu","Wed","Fri","Sat","tue"};
		
//      
//		*1]  Method toString() => Converts array to String using class name itslef
		
		System.out.println(Arrays.toString(days)); 
		
		
//		*2] Method tasList() => Converts array to List
		
		List<String> a1=Arrays.asList(days);
		System.out.println("List: "+a1);

		
		
//     *3] sort() and binarySearch() => Sort for ascending and binary search for searching but it can only be used after sort
		
		Arrays.sort(days); 
		System.out.println(Arrays.toString(days)); // here toString used cause it will only display in string
		System.out.println(Arrays.binarySearch(days, "tue")); // only used after sorting/Ascending order
		
		
		
//    *4] copyof() and copyOfRange() => Both copy the required elements, just copyOfRange() copies from required range we want
		
		String newArr[]=Arrays.copyOf(days, 4); // Starts from 0
		System.out.println(Arrays.toString(newArr));
		
		String ar[]=Arrays.copyOfRange(days, 0, 4); // Starts from 0 and gives length n-1 
		System.out.println(Arrays.toString(ar));
		
		
		
///    *5] equals => Comapres equal or not (boolean)		
		String days1[]= {"thu","Wed","Fri","Sat","tue"};
		
		System.out.println(Arrays.equals(days, days1)); // here false given cause used sort above

		
//     *6] fill => Used to fill required element 
		
		Arrays.fill(days, "Mon");
		System.out.println(Arrays.toString(days)); // here it fills but in prog used many methods so it gives only mon
		
		
		
		
		
	}

}
