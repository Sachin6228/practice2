package collection.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//set is exactly opposite to list in i.e in don;t allow duplication

//1. Set is a un-order type of collection. means it does not preserve the insertion order
//2. It does not allows the duplicate values

//LinkedHashSet=follows one property of List(preserv insertion order) and one propety of Set(does not allows duplicate)
//LinkedHashSet= LinkedList +LinkedHash + set

public class SetDemo {

	public static void main(String[] args) {
// hash table is table (in which values are store in the form of key and value pair) + set		
		//Set<Integer> s1 = new HashSet<Integer>(); //HashSet= hash table + set
		
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>();
		
		s1.add(56);
		s1.add(16);
		s1.add(45);
		s1.add(78);
		s1.add(45);
		s1.add(24);
		
		System.out.println(s1);
	
LinkedHashSet<Integer> s2= new LinkedHashSet<Integer>();
		
		s2.add(100);
		s2.add(111);
		s2.add(20);
		s2.add(400);
		s2.add(45);
		
		System.out.println(s2);
		
/*//intersection=> means finding common element between tow sets
		s1.retainAll(s2);
		System.out.println("intersections1 and s2");
		System.out.println("After retaina s1 is : "+s1);
		System.out.println("After addAll s1 is : "+s2);*/
		
		
/*// union=> it merge 2 set by avoiding duplicate elements), intersection , difference
		s1.addAll(s2);
		System.out.println("un ion of s1 and s2");
		System.out.println("After addAll s1 is : "+s1);
		System.out.println("After addAll s1 is : "+s2);	*/
		

	}

}
