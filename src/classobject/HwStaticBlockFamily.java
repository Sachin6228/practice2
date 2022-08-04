package classobject;
//static keyword( var, method, block, class)
//var(automatically), method(class name), block(automatically)
class Family2
{
	String name;
	int age;
	static String address="Pune";//Static var can be initialized only once in the program
	
	static //static block is used to initialize only static var of class
	{
		address="Wardha";
	}
	
	void getData(String name, int age)
	{
		this.name =name;
		this.age=age;
	}

	void show()
	{
		System.out.println("Name is : "+name);
		System.out.println("Age of "+name+" is : "+age);
		System.out.println("Address is : "+address);
	}
	
	/*static void change()	//static methods accepts only static variables
	{
		address="Pune";
		System.out.println("In a Static Method...");
	}*/
}
public class HwStaticBlockFamily {

	public static void main(String[] args) {
		
		//Family2.change();
		
		Family2 j1 =new Family2();
		j1.getData("Vishal", 25);
		j1.show();
		
		Family2 ja2 =new Family2();
		ja2.getData("Swapnil", 27);
		ja2.show();
	}

}
