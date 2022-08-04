package collectionframeworkk;

import java.util.StringJoiner;

public class MergeJoinerr {

	public static void main(String[] args) {
		
		StringJoiner s1 = new StringJoiner(";",	"[",	"]");//passing semicolon(;) and square-bracket as delimiter
		
		s1.add("Rahul");	
		s1.add("Raj");
		s1.add("Riya");
		s1.add("Ashwin");
		
StringJoiner s2 = new StringJoiner("$",	"{",	"}");//passing colon(;) and curley-bracket as delimiter
		
		s2.add("Rakesh");	
		s2.add("Ram");
		s2.add("Rina");
		s2.add("Vishal");
		
		System.out.println(s1.merge(s2));

	}

}
