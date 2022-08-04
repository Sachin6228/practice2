package classobject;

class Animal
{
	int age;
	String name;
	String colour;
	
	void read (int a,String n,String c)
	{
		age=a;
		name=n;
		colour=c;
	}
	
	void disp()
	{
		System.out.println("Name of Animal is : "+name);
		System.out.println("Age of Animal is : "+age);
		System.out.println("Colour of Animal is : "+colour);
		System.out.println();
	}
}

public class HwClassObjectUsingMethod1 {

	public static void main(String[] args) {
		
		Animal ra1 =new Animal();
		ra1.read(5, "Dog", "White");
		ra1.disp();
		
		Animal g1 = new Animal();
		g1.read(2,"Cat","Brown");
		g1.disp();

	}

}
