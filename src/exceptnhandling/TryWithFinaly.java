package exceptnhandling;

public class TryWithFinaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

                 //0 1 2 3 4
		int a[]= {67,8,34,2,1};
		
		try
		{
			System.out.println(a[7]); 
			System.out.println("bye");   //this 2 statements will does not get execute, bcz it is written after exceptional line
			                            //so the control will directly transfer onto the catch block after this line
			System.out.println("thank you");
		}
		
		finally
		{
			System.out.println("finally block will always gets execute in the program whether an exception occurred or not..");
			System.out.println("we can use finally to put important code of the program..");
		}
	}
}
