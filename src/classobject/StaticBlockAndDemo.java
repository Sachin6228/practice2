package classobject;
//static keyword( var, method, block, class)
// var(automatically), method(class name), block(automatically)
class Acc
{	
	long accno,a,b;
	String hName;
	static double roi;//Static variable can be initialized only once in the program(while de...
				//Static variable call automatically at the time of object creation
	static	//static block is used to initialize only static variable of class
	{
		System.out.println("In a Static Block...");
		roi=8.5;
	}
	
	void getData(long accno,String hName)
	{
		this.accno =accno;
		this.hName =hName;
	}
	
	{						//instance Initializer Block
		System.out.println("Instance Initializer Block...");
	}
	
	void show()
	{
		System.out.println("Acc holder name is : "+hName);
		System.out.println("Acc No. is : "+accno);
		System.out.println("ROI is : "+roi);
	}
	
	static void change()	//static methods accepts only static variables
	{
		roi=9.6;
		System.out.println("In a Static Method...");
	}
}
public class StaticBlockAndDemo {

	public static void main(String[] args) {
		
		Acc ram = new Acc();
		ram.getData(50000,"Ram");
		ram.show();
		
		Acc.change();	//static methods are always called by the class name instead of object name
		
		Acc sham = new Acc();
		sham.getData(8000,"Sham");
		sham.show();
	}

}
