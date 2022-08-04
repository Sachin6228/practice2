package classobject;
//Initialization of instance variable by calling that instance variable itself
class Student
{
	int rno;
	String name;
	float marks;
	String address;
}

public class ClassDemo {

	public static void main(String[] args) {
		
		Student ram = new Student();
		Student sham =new Student();
		
		ram.rno=10;		//instance variable initialization by calling itself
		ram.name="Ram";
		ram.marks=98.3f;
		ram.address="Pune";
		
		sham.rno=20;
		sham.name="Sham";
		sham.marks=60.3f;
		sham.address="Mumbai";
		
		System.out.println("Name of Student is : "+ram.name);
		System.out.println("Roll No. of Student is : "+ram.rno);
		System.out.println("Marks of Student is : "+ram.marks);
		System.out.println("Address of Student is : "+ram.address);
	
		System.out.println("\nName of Student is : "+sham.name);
		System.out.println("Roll No. of Student is : "+sham.rno);
		System.out.println("Marks of Student is : "+sham.marks);
		System.out.println("Address of Student is : "+sham.address);
	}

}
