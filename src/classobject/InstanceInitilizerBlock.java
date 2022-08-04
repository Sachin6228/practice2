package classobject;
//1. Instance Initializer Block => Used to initialize the instance variable of the class 
// it is just like the default constructor, but it has no name
//2. If your class consist of block,method and constructor then block should always executes first
// then constructor then method
//3. Instance Initializer Block should always executes first in the program, before the constructor
//4. If your program consist method and constructor then constructor should always executes first then method
///5. Program that shows how to create instance initializer block in java
class Abc
{
	int a,b;
	
	void read ()
	{
		a=80;
		b=90;
		System.out.println("In Method a = "+a);
		System.out.println("In Method b = "+b);
	}
	
	Abc()			//Default Constructor
	{
		a=40;
		b=50;
		System.out.println("In Default Constructor a = "+a);
		System.out.println("In Default Constructor b = "+b);
	}
	
	{		//instance initializer block=> used to initialize the instance variable of the class
		a=10;
		b=20;
		System.out.println("\nIn Block a = "+a);
		System.out.println("In Block b = "+b);
	}
}

public class InstanceInitilizerBlock {

	public static void main(String[] args) {
		
		A111 a1 =new A111();		//constructor calling
		a1.read();				//method calling 
		
		A111 a2 =new A111();
		a2.read();
		
		A111 a3 = new A111();
		a3.read();
	}

}
