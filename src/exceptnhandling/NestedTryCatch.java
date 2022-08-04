package exceptnhandling;
//Programs that handles  Multiple exception using nested try catch
public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a[] = {78,56,89,0,34};
			
			try
			{
				System.out.println(a[-4]);	//arrayIndex
			}
			catch(ArrayIndexOutOfBoundsException e)		//catch of inner try
			{
				System.out.println(e); 	//array
			}
			finally
			{
				System.out.println("Inner finally...");
			}
			
			
			System.out.println(a[1]/a[3]);	//Arithmatic
		
		}
		catch(ArithmeticException e)	//catch of outer try
		{
			System.out.println(e);		//by zero
		}
		
		finally
		{
			System.out.println("Outer finally...");
		}
	}

}
