package classobject;
//Program for constructor chaining(calling Parameterized constructor inside the default constructor)

class Shape 
{
	int sides;
	String name;
	
	Shape()
	{
		this(4, "Rectangle");
		sides=3;
		name="Triangle";
		
		System.out.println("Sides are : "+sides);
		System.out.println("Name of Shape is : "+name);
	}
	
	
	Shape(int sides, String name)
	{
		this.sides=sides;
		this.name=name;
		
		System.out.println("Sides are : "+sides);
		System.out.println("Name of Shape is : "+name);
	}
}


public class ConstructorChainingUsingThis1 {

	public static void main(String[] args) {

		Shape s1 = new Shape();		//default constructor calling

	}

}
