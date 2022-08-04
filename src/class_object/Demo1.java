package class_object;

public class Demo1 extends Demo2
{
	static int dem = 10;
	
	public void m1()
	{
		m2();
		m22();
		System.out.println("Running in m1()... Method");
	}
	
	public static void m11() 
	{
		//m1();		In static method we can't call non-static method
		//m2();		In static method we can't call non-static method
		m22();
		System.out.println("Running in m11()... Static Method");
	}
	
	public static void main(String[] args) {
		
		m11();
		m22();
		System.out.println(dem);
		
		Demo1 d1 = new Demo1();
		d1.m1();

		Demo2 d2 = new Demo2();
		d2.m2();
		
	}

}
