package collectionframeworkk;//8-4-22

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d3 = new Date();
		System.out.println("current date and time : "+d3);
		
		d3.setTime(18045855861l);
		System.out.println(d3);
	
		System.out.println(d3.getDate());
		System.out.println(d3.getDay());
		
/*		Date d1 = new Date(2021,9,29);
		
		Date d2 = new Date(2022,8,7);
		
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));

		System.out.println(d1.compareTo(d2));//0 similler //1 first greater //-1 first smaller
	
		System.out.println(d1.equals(d2));		*/
		
	
		
		
	}

}
