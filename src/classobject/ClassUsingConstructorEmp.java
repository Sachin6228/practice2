package classobject;
//initialization of instance variable by calling the constructor
class Emp1
{
	int emp_id;
	String name;
	String dept;
	int salary;
	
	Emp1()
	{
		emp_id=12345;
		name="Vishal";
		dept="Mech";
		salary=60000;
	}
	
	Emp1(int id,String n,String dpt,int sal)
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

public class ClassUsingConstructorEmp {

	public static void main(String[] args) {
			
		Emp1 anuroop = new Emp1(67890,"Anuroop","ExTc",90000);
		anuroop.display();
		
		Emp1 vishal = new Emp1();
		vishal.display();
	}

}
