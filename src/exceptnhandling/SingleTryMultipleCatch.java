package exceptnhandling;
//Program for multiple catch for single try
public class SingleTryMultipleCatch {

	public static void main(String[] args) {
		
//for single try we can write multiple catch blocks but among that multiple catch only one will get execute at a time
		
		try
		{
			int a[] = {78,56,89,0,34};
			
			System.out.println(a[-4]);	//arrayIndex
			System.out.println(a[1]/a[3]);	//Arithmetic
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);		//by zero
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e); 	//array
		}
		finally
		{
			System.out.println("Always get execute...");
		}
	}

}
