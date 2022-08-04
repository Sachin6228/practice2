package collection.program;
//HashMap = hash table + map
//import java.util.HashMap;
//HashMap does not preserve the insertion order
//hashMap does not allows the duplicate values
//LinkedHashMap = Linked list(ordered) +hash table +map
//import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String>  m1 = new LinkedHashMap<Integer,String>();
		
		m1.put(12,"pooja");
		m1.put(13,"ram");
		m1.put(14,"sham");
		m1.put(15,"geeta");
		m1.put(16,"raj");
		
		System.out.println(m1);
		
		
		
/*		m1.remove(15);
		System.out.println(m1);		*/
		
		
/*		System.out.println(m1.keySet());
		System.out.println(m1.values());
		
		System.out.println(m1.containsKey(15));//true
		System.out.println(m1.containsValue("riya"));//false		*/
		
		
/*		m1.computeIfPresent(14, (k,v)-> "Jiya");//computeIfPresent() method adds value onto the 
												//specified key only if it is present
		System.out.println(m1);
		
		m1.computeIfAbsent(4,v-> "sham");//computeAbsent() method adds entry(key,val) 
							//in the map only if specified key is absent
		System.out.println(m1);		*/
		
/*		m1.compute(9,(key,val)-> val.concat("Kapoor"));
		System.out.println();
		
		m1.compute(8,(key,val)-> val.toUpperCase());
		System.out.println(m1);		*/
		
		
/*		MAp. entry Interface
 		for(Map.Entry i1 : m1.entrySet())
		{
			System.out.println(i1.getKey()+" "+i1.getValue());
		}		*/

	}

}
