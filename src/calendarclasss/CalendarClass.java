package calendarclasss;//6-4-22
import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		
   //	here getInstance method is used to create object as in calendar we can't use new keyword to create object
		
		Calendar cal=Calendar.getInstance();
		
		System.out.println(cal.getTime());
		
//		*1] Calendar.DATE=> Used to know date as DATE IS constant
//          Calendar.MONTH=> Used to Know Month
//          Calendar.YEAR => Used to Know year	
//		    Calendar.HOUR => USed to know hour
		
		cal.add(Calendar.DATE, -2); // -2 is 2 days before date 
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 5);
		System.out.println(cal.getTime());
		cal.add(Calendar.YEAR, 10);
		System.out.println(cal.getTime());
		cal.add(Calendar.HOUR, -10);
		System.out.println(cal.getTime());
		
//       *2] get(Calendar.DAY_OF_MONTH)=>
//		        (Calendar.MINUTE))=>
//		        (Calendar.HOUR))=>
//		        (Calendar.DAY_OF_WEEK))=>
//  		    (Calendar.WEEK_OF_MONTH))=>
			
		          System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		          System.out.println(cal.get(Calendar.MINUTE));
		          System.out.println(cal.get(Calendar.HOUR));
		          System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		          System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		

//       	*3] getMaximum(Calendar.DAY_OF_YEAR)=>
//		        getMinimum(Calendar.DAY_OF_YEAR =>
//		         getCalendarType() =>
		          
		           System.out.println(cal.getMaximum(Calendar.DAY_OF_YEAR));
		           System.out.println(cal.getMinimum(Calendar.DAY_OF_YEAR));
		           System.out.println(cal.getCalendarType());
	

	}

}

