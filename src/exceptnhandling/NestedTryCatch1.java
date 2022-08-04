package exceptnhandling;
//Program for writing single Try With Multiple Catch Blocks

public class NestedTryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.for single try we can write multiple catches nut among the multiple catches only
	//one catch block will get execute, respective to the exception which is generated first in the program
		
	
//2.for each try block there can be zero or more catch blocks but only one finally block

		
		try
		{        
			String s1=null;
			
            try
			{
			System.out.println(s1.toUpperCase());  //NullPointer
			}
			catch(NullPointerException e1)
			{
				System.out.println(e1);
			}
            finally  //finally block of nested  try
            {
            	System.out.println("nested finally block..");		
            }
            
            System.out.println(Integer.parseInt(s1)); //NumberFormat
			
		} //close of outer try
		
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		finally  //finally block of outer try
		{
		   System.out.println("outer finally block..");	
		}
		
}
	
}
