package collectionframeworkk;

import java.util.StringJoiner;

public class SetEmptyy {

	public static void main(String[] args) {
		
		StringJoiner s1 = new StringJoiner(",");
		
		System.out.println(s1);
		
		s1.setEmptyValue("Pooja");	//we can set default empty value
		System.out.println("s1 ="+s1);
		
		s1.add("Rahul");	
		s1.add("Rajesh");
		s1.add("Rooja");
		
		System.out.println(s1);
		
		int length = s1.length();	///System.out.println(length);
		System.out.println("Length : "+length);

		String str = s1.toString();//here toString() converts StringJoiner into the String
		System.out.println("String ="+str);
		
		System.out.println("Character at index 10 : "+str.charAt(10));
		
		s1.add("Sagar");
		System.out.println(s1);
		
		System.out.println("New Length : "+s1.length());
		
	}

}
