package classobject;

class Student1
{
	int rno,a,b;
	String name;
	float marks;
	String address;
	
	//void accept();	fun declaration
	void accept(int r,String n,String a,float m)	///fun defination & formal parameter
	{
		rno=r;
		name=n;
		address=a;
		marks=m;
	}
	
	void display()
	{
		System.out.println("Name of Student is : "+name);
		System.out.println("Roll No. of "+name+" is : "+rno);
		System.out.println("Marks of "+name+" is : "+marks);
		System.out.println("Address of "+name+" is : "+address);
		System.out.println();
	}

}
	

public class ClassObjectUsingMethod {

	public static void main(String[] args) {
		
		Student1 vishal = new Student1();
		Student1 anuroop =new Student1();
		
		vishal.accept(56,"Vishal","Wardha",95.6f);
		anuroop.accept(60,"Anuroop","Pune",99.98f);
		
		vishal.display();
		anuroop.display();
	}

}