package collectionframeworkk;

import java.util.StringJoiner;

public class StringJoinerr {

	public static void main(String[] args) {
		
		//StringJoiner s1 = new StringJoiner("@");	//1st constructor
		
		StringJoiner s1 = new StringJoiner("@"	,"{"	,	"}");//1st constructor	//passing prefix & sufix
		
		s1.add("Rahul");	//adding value to StringJoiner
		s1.add("Raj");
		s1.add("Rakesh");
		s1.add("Vishal");
		
		System.out.println(s1);

	}

}
