package exceptnhandling;
//program for generating user define or costume exceptions (with try catch)
class Registration1
{
	void checkEligibility(int studeAge, int studWeight)	throws ArithmeticException //throws keyword is used to declare the exception
	{
		try
		{
			
			if(studeAge > 12 && studWeight <50)
			{
				System.out.println("You are eligible for Registration...");
			}
			else
			{
				throw new ArithmeticException("You are not eligible for Registration...");
			}
		}	//try closed
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class HandlingCostumeExcptnUsingTryCatch {

	public static void main(String[] args)	 {
		// TODO Auto-generated method stub

		Registration1 r1 = new Registration1();
		System.out.println("Welcome to Registration process...");
		r1.checkEligibility(15,67);
		
	}

}
