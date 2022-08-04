package casting_;

// Downcasting 2.0 =>

public class DownCastingEg {

	public static void main(String[] args) {
		
		// * Boolean to Integer =>
		boolean b1=true;
		int i=b1 ? 1:0;
		System.out.println(i);
		
		boolean b2=false;
		int i1=b2 ? 1:0;
		System.out.println(i1);
		
		
		
		
		// * Boolean to String =>
		boolean b3=true;
		String s1=String.valueOf(b3);
		System.out.println(s1);
		
		// * String to Boolean =>
		String s2="true";
		boolean b4=Boolean.parseBoolean(s2);
		System.out.println(b4);
		
		
		
		
		// * Integer to String =>
		int i3=98;
		String s4=String.valueOf(i3);
		System.out.println(s4);
		
		// * String to Integer=>
		String s5="546";
		int ii2=Integer.parseInt(s5);
		System.out.println(ii2);
		
		String s6="String";
		int iii2=Integer.parseInt(s6);
		System.out.println(iii2); // Exception occurs
		
	}

}
