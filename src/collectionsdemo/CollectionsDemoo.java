package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemoo {

	public static void main(String[] args) {
		
	//disjoint() method	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(78);
		a1.add(8);
		a1.add(18);
		a1.add(67);
		a1.add(3);
		
		System.out.println(a1);
		
ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		a2.add(6);
		a2.add(2);
		a2.add(0);
		a2.add(0);
		a2.add(0);
		
		System.out.println(a2);
		
		System.out.println(Collections.disjoint(a1, a2));//elements common nhi means true hai, agar yek bhi elemrnts common hai to false
		
		
		
		
/*		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(78);
		a1.add(8);
		a1.add(18);
		a1.add(67);
		a1.add(3);
		
		System.out.println(a1);
		
ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		a2.add(6);
		a2.add(2);
		a2.add(0);
		a2.add(0);
		a2.add(0);
		
		copy method of collections class
		System.out.println("Before copy"+a2);//Before copy[6, 2, 0, 0, 0]
		
		Collections.copy(a2, a1);
		System.out.println("After copy"+a2);//After copy[78, 8, 18, 67, 3]		*/
		
	
/*		Collections.sort(a1);
		System.out.println(Collections.binarySearch(a1, 18));//18 is present on second index position in sorted index list*/
		
		
/*		Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);*/
		
/*		Collections.addAll(a1, 100,200,300,400);
		System.out.println(a1);		*/

	}

}
