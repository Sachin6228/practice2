package casting_;
//Programme for Downcasting =>

public class DownCasting {

	public static void main(String[] args) {
		
		// Conversion of larger data type to smaller is Downcasting
		// Performs automatically by using casting operator=> (type)exp;
		
		double a=98.8; // double(8 byte) to int(4 byte)
		int i=(int)a;
		System.out.println(i);
		
		double r=78.2; // double(8 byte) to long(8 byte)
		long l=(long)r;
		System.out.println(l);
		
		int j=70; // int(4 byte) to char(2 byte)
		char t=(char)j;
		System.out.println(t);
		
		float y=98.9f; // Float(4 byte) to char(2 byte)
		char u=(char)y;
		System.out.println((char)y);
		
		
		


	}

}
