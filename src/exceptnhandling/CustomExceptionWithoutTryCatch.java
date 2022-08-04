package exceptnhandling;
//program for generating user define or costume exceptions (without try catch)

class Registration
{
	void checkEligibility(int studeAge, int studWeight)
	{
		if(studeAge > 12 && studWeight <50)
		{
			System.out.println("You are eligible for Registration...");
		}
		else
		{
			System.out.println("You are not eligible for Registration...");
		}

		System.out.println("Registration Process Completed...");
	
	}
}

public class CustomExceptionWithoutTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registration r1 = new Registration();
		System.out.println("Welcome to Registration process...");
		r1.checkEligibility(15,67);
		
	}

}
