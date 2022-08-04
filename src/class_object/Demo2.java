package class_object;

public class Demo2
{

	public void m2() 
	{
		//m1();		without extending the class we can't call methods directly
		//m11();	without extending the class we can't call methods directly
		System.out.println("Running in m2()... Method");
	}
	
	public static void m22() 
	{
		// 	m2();		In static method we can't call non-static method
		//m11(); 	we can't call m11(); static method into another static method bcz not extended
		Demo1.m11(); //class is not extended thats why we call cls_name.method_name
		System.out.println("Running in m22()... Static Method");
	}
	
	public static void main(String[] args) {

		Demo2 d2 = new Demo2();
		d2.m2(); 	//calling non static method from same class the help of object of that class
		System.out.println(Demo1.dem);	//calling static variable from different class	
		m22();	//static method in same class
		Demo1.m11();//static method from different class
		
		Demo1 d1 = new Demo1();
		d1.m1();
	}

}
