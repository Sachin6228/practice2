package classobject;
//Non static nested class can be access with the help of object of Outer class 
//The property of the non static nested class is that it allows us to access the static as well as non static members of outer class
class Outer
{
	static int a=90;
	int c=78;
	
	void outerInfo()
	{
		System.out.println("a = "+a);
	}
	class Inner
	{
		int b=56;
		
		void innerInfo()
		{
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("c + "+c);
		}
	}
}

public class NonStaticNestedClass1 {

	public static void main(String[] args) {
		
		Outer o1 = new Outer();
		//o1.outerInfo();
		
		Outer.Inner i1 = o1.new Inner();
		i1.innerInfo();

	}

}
