package classobject;

	class Emp 
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
		
		void display()
		{
			System.out.println("Name of Employee is : "+name);
			System.out.println("Id of "+name+" is : "+emp_id);
			System.out.println("Department of "+name+" is : "+dept);
			System.out.println("Salary of "+name+" is : "+salary+"\n");
		}
	}

public class ClassUsingMethodEmp {

	public static void main(String[] args) {
		
		Emp vishal = new Emp();
		vishal.read(12345,"Vishal","Mech",60000);
		vishal.display();
		
		Emp anuroop = new Emp();
		anuroop.read(67890,"Anuroop","ExTc",90000);
		anuroop.display();

	}

}
