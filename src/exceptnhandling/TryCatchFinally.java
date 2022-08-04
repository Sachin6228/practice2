package exceptnhandling;

public class TryCatchFinally {
//handling NumberFormateException using try catch finally
	public static void main(String[] args) {
		
		try
		{
			String s1 = "pooja";
			System.out.println(Integer.parseInt(s1));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			int a=9,b=8;
			System.out.println("final block always gets execute..whether an exception are occured or not");
		}
	}

}
