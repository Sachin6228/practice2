package collection.program;

import java.util.ArrayList;
import java.util.List;

//Program for creating array list which consist of dffnt type of elements
//1. List is a order type of collection(it preserves the insertion order)
//2. List allows duplicate values
public class ListDemo {

	public static void main(String[] args) {
		
	//List<String> l1 = new ArrayList<String>();//we can apply restriction on collection by using generic means after   
								//applying generic on collection, we can store only one type of object in that collection 
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Pune"); //integer 
		l1.add("Nagpur"); //float 
		l1.add("Wardha"); //double
		l1.add("Mumbai"); 	//String
		l1.add("Ajandoh"); //Boolean 
		l1.add("Karanja"); //char
		 
		 System.out.println(l1);
		
		
		/*
		 * //list which consist pf different type of element
		 * 
		 * List l1 = new ArrayList();
		 * 
		 * l1.add(56); //integer l1.add(6.7f); //float l1.add(6.7); //double
		 * l1.add("Pooja"); //String l1.add(true); //bolean l1.add('d'); //char
		 * 
		 * System.out.println(l1);
		 */
	}

}
