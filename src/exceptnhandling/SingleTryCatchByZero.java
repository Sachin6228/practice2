package exceptnhandling;

public class SingleTryCatchByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic Exception
			int a=90,b=0;
			try
			{
				System.out.println("Hello...");
				System.out.println(a/b);
				System.out.println("How are you..?");//not in o/p bcz this statement after exceptional statement
			}
			catch (Exception e)
			{
				System.out.println("please change the denominator, except zero");
			}
				
			System.out.println("Good Morning");
			System.out.println("Thanks");			

	}

}