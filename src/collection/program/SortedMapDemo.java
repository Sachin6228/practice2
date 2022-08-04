package collection.program;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		
		SortedMap<Integer,String> m1 = new TreeMap<Integer,String>();
		
		m1.put(12,"pooja");
		m1.put(13,"ram");
		m1.put(14,"sham");
		m1.put(15,"geeta");
		m1.put(16,"raj");
		
		System.out.println(m1);
		
	//System.out.println(m1.subMap(13, 16));
	
/*		System.out.println(m1.tailMap(16));//reurns a view of the portion of this map whose keys aregreater than or equal to fromKey. 
		System.out.println(m1.headMap(14));//Returns a view of the portion of this map whose keys arestrictly less 
											//than toKey.		*/
//		System.out.println(m1.firstKey());

	}

}
