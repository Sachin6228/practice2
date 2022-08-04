package exceptnhandling;
//Program for handling Custom/userdefined Exception USing Try catch

class CustomException1   //with try catch
{ 
 static void checkEligibility(int age, int weight  ) throws  ArithmeticException
	{
		 try
		 {
	        if (age >= 18 && weight < 45)
			{
				System.out.println("Registration Succesfully...");
			}
	        else
			{
				throw new ArithmeticException("Registration failed");
				
			}
		 }  //try close
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 finally
		 {
		 System.out.println("Rgistration Process Completed...");
		 }
	} //method close
} //class close

public class CustomExceptionUSingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	CustomException1 c1= new CustomException1();
		
		System.out.println("welcome to registration Process......");
		CustomException1.checkEligibility(2,33);
	}

}