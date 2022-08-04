package casting_;

// Up casting Program=>

public class Upcasting {

public static void main(String[] args) {
	
	//Conversion of smaller data type to larger is Upcasting
	// performs automatically bt java compiler 
	
	int a=89;  // int(4 byte) to double(8 byte) conversion
	double f1=a;
	System.out.println(f1);
	
	
	char ch='b'; // ASCII value 98 // char(2 byte) to int(4 byte) conversion
	int f2=ch;
	System.out.println(f2);

}

}
