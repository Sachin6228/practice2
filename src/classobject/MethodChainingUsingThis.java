package classobject;
//program for calling one method inside another method using this keyword(method chaining)

class Student2
{
	int rno;
	String name;
	float marks;
	String address;
	
	void accept(int rno,String name,String address,float marks)	///function definition & formal parameter
	{
		this.rno=rno;
		this.name=name;
		this.address=address;
		this.marks=marks;
	}
	
	void display()
	{
		System.out.println("\nName of Student is : "+this.name);
		System.out.println("Roll No. of "+name+" is : "+this.rno);
		System.out.println("Marks of "+name+" is : "+this.marks);
		System.out.println("Address of "+name+" is : "+this.address);
		
	}
	
	void avgMarks(double math, double sci)
	{
		this.display();// this refer current class instance method
		double avg=(math+sci)/2;
		System.out.println("Avg of "+name+" is : "+avg);
	}
}
public class MethodChainingUsingThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 ram =new Student2();
		ram.accept(45,"Ram","Pune",69.03f);//fun calling//actual parameter
		ram.avgMarks(70.3, 60.3);
				
		Student2 sham =new Student2();
		sham.accept(50,"Sham","Mumbai",80.03f);
		sham.avgMarks(45.8,64.4);
	}

}
