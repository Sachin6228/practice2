package exceptnhandling;
//Programs that handles  Multiple exception using nested try catch
public class HwNestedTryCatch {

	public static void main(String[] args) {

		try											//outer try
		{
			String s1 ="Pooja";
			try										//middle try
			{
				try									//inner try
				{
					String s2 = null;
					System.out.println(s2.toLowerCase());
				}//close inner try
				catch(NullPointerException e)
				{
					System.out.println(e);
				}
				System.out.println(s1.charAt(7));
			}//close middle try
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(Integer.parseInt(s1));
		}//close outer try
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
