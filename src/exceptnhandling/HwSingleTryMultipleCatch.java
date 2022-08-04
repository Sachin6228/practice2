package exceptnhandling;
//Program for multiple catch for single try
public class HwSingleTryMultipleCatch {

	public static void main(String[] args) {

		try
		{
			String s1 ="Pooja";
			String s2=null;
			System.out.println(Integer.parseInt(s1));
			System.out.println(s1.charAt(7));
			System.out.println(s2.toLowerCase());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

	}

}


/*				try
{
//String s1 ="Pooja";
String s2=null;
//System.out.println(Integer.parseInt(s1));
//System.out.println(s1.charAt(7));
System.out.println(s2.toLowerCase());
}
catch(NumberFormatException e)
{
System.out.println(e);
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
catch(NullPointerException e)
{
System.out.println(e);
}			*/