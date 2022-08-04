package collection.program;//6-4-22

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		//SortedSet<Integer> s1 = new TreeSet<Integer>();
		TreeSet<Integer> s1 = new TreeSet<Integer>();
		
		s1.add(34);
		s1.add(89);
		s1.add(2);
		s1.add(5);
		s1.add(8);
		s1.add(90);
		
	//	[2, 5, 8, 34, 89, 90]
		System.out.println(s1);	//by default it prints the element in the ascending order
		
		
/*		System.out.println(s1.pollFirst());	//Retrieves and removes the first (lowest) element
		System.out.println(s1);
		
		System.out.println(s1.pollLast()); 	//Retrieves and removes the last (highest) element	
		System.out.println(s1);		*/
		
/*		System.out.println(s1.higher(56));
		System.out.println(s1.lower(5));	*/
	
		
/*		System.out.println(s1.headSet(34));//Returns the set whose elements are strictly less than toElement
		
		System.out.println(s1.tailSet(34));//Returns the whose elements are greater than or equal to fromElement	*/		
	
		
		System.out.println(s1.floor(9));//8//Returns the in this set less than or equal to the given element
		System.out.println(s1.floor(8));//8
		
		System.out.println(s1.ceiling(9));//Returns the least element in this set greater than or equal tothe given element
	}

}
