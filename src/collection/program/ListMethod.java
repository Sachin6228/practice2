package collection.program;

import java.util.ArrayList;
import java.util.Collections;

public class ListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Pune"); //integer 	
		 l1.add("Nagpur"); //float 
		 l1.add("Wardha"); //double
		  l1.add("Mumbai"); 	//String
		  l1.add("Ajandoh"); //Boolean 
		 l1.add("Karanja"); //char
		 l1.add("Pune");
		 
		 System.out.println("List : "+l1); 
		 
		 
		 
		 
		 
			/*
			 * Collections.sort(l1); //sort(); by sorts the elements in ascending order
			 * System.out.println("After ascending sort "+l1);//[Ajandoh, Karanja, Mumbai,
			 * Nagpur, Pune, Pune, Wardha]
			 * 
			 * Collections.sort(l1,Collections.reverseOrder());
			 * System.out.println("\n after sort l1 in reverse order"+l1);
			 * //ascending(smaller to larger) // descending(larger to smaller)
			 */		 
		 
			/* System.out.println(l1.size()); */
		 
		 
			/*
			 * l1.set(1, "Deccan"); System.out.println(l1);//replace
			 */		 
		 
			/*
			 * System.out.println(l1.subList(1, 3));//in this it includes the elements of
			 * fromIndex in output //but it exclude the toIndex in output
			 */		 
		 
			/*
			 * Object newArr[] =l1.toArray();//toArray coNverts list into an array for(
			 * Object a : newArr ) //for each loop is used to traverse(i.e. reach one by
			 * one) the COLLECTION and prints its elements one by one {
			 * System.out.println(a); }
			 */
		 
			/*
			 * System.out.println(l1.remove(2));//it will remove present at index 2
			 * System.out.println("List : "+l1);
			 */
		 
		 
			/* System.out.println(l1.isEmpty()); */
		 
		 
			/*
			 * System.out.println(l1.indexOf("Pune"));//indexOf() returns first occurrence
			 * of given object/element
			 * System.out.println(l1.lastIndexOf("Pune"));//lastindexOf() returns last
			 * occurrence of given object/element
			 */		 
			/* System.out.println(l1.hashCode()); */
		 
		 
			/*
			 * System.out.println(l1.get(3));//on which index which data is there
			 */		 
		
		 
		/*
		 * ArrayList<String> l1 = new ArrayList<String>();
		 * 
		 * l1.add("Pune"); //integer l1.add("Nagpur"); //float l1.add("Wardha");
		 * //double // l1.add("Mumbai"); //String l1.add("Ajandoh"); //Boolean
		 * l1.add("Karanja"); //char l1.add("Pune");
		 * 
		 * System.out.println("List : "+l1);
		 * 
		 * ArrayList<String> l2 = new ArrayList<String>();
		 * 
		 * l2.add("Pune"); //integer l2.add("Nagpur"); //float l2.add("Wardha");
		 * //double l2.add("Mumbai"); //String l2.add("Ajandoh"); //Boolean
		 * l2.add("Karanja"); //char l2.add("Pune");
		 * 
		 * System.out.println(l1.equals(l2));
		 * 
		 */		
		/*
		 * ArrayList<String> l1 = new ArrayList<String>();
		 * 
		 * l1.add("Pune"); //integer l1.add("Nagpur"); //float l1.add("Wardha");
		 * //double // l1.add("Mumbai"); //String l1.add("Ajandoh"); //Boolean
		 * l1.add("Karanja"); //char l1.add("Pune");
		 * 
		 * System.out.println("List : "+l1);
		 * 
		 * ArrayList<String> l2 = new ArrayList<String>(); l2.add("Pune"); //integer
		 * l2.add("Nagpur"); //float l2.add("Wardha"); //double l2.add("Mumbai");
		 * //String l2.add("Ajandoh"); //Boolean l2.add("Karanja"); //char
		 * l2.add("Pune");
		 * 
		 * System.out.println(l1.containsAll(l2));// it checks whether l1 contains all
		 * the elements of specified collections //means L2, now it will return false...
		 * mumbai is contain in l2 but not in L1
		 */		 
		 
		 
			/* System.out.println(l1.contains("nasik")); */
		 
			/*
			 * l1.clear(); System.out.println(l1);
			 */
		 
			/*
			 * l1.add(3,"sangli"); //add method khud ke array list ki thi
			 * System.out.println("new listv : "+l1);
			 */		
		
	}

}
