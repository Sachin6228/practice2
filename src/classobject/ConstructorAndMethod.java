package classobject;
//Constructor and Method 
class Emp3
{
	int emp_id;
	String name;
	String dept;
	int salary;
	
	void read(int id,String n,String dpt,int sal)
	{
		emp_id=id;
		name=n;
		dept=dpt;
		salary=sal;
	}
	
	Emp3()
	{
		emp_id=24680;
		name="Shaktiman";
		dept="Heaven";
		salary=40000;
	}
	
	Emp3(int id,String n,String dpt,int sal)
	{
		emp_id=id;
		name=n;
		dept=dpt;
		salary=sal;
	}
	
	void display()
	{
		System.out.println("\nName of Employee is : "+name);
		System.out.println("Id of "+name+" is : "+emp_id);
		System.out.println("Department of "+name+" is : "+dept);
		System.out.println("Salary of "+name+" is : "+salary);
	}
}

public class ConstructorAndMethod {

	public static void main(String[] args) {
	
		Emp3 ra1 =new Emp3();
		ra1.display();
		
		Emp3 g1 = new Emp3(13579,"Junior-G","Hell",100000);
		g1.display();
		
		Emp3 vishal = new Emp3();
		vishal.read(12345,"Vishal","Mech",60000);
		vishal.display();

	}
}

