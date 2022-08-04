package classobject;
	//1. Static Keyword can be used with variable, method class in java
	//2. By declaring data members(instance variable,method,block) as a static by using static keyword
	// 	 then to call that static members we do not required to object
	//3. We can call that static members with class name 
	//4. The Static variable are used to refer to the common property of all objects.
	//5. We don't need to call static variable, it can be called automatically by each and every object of the class
	//6. Static block can be used to initialized the static variable of the class

	class Emp55{
		
		int eId;	//states or properties 
		String eName;
		double salary;
		static String cName;
		
		static 
		{
			cName="Infosys";	//IBM
		}
		
		Emp55(int eId,String eName,double salary)
		{
			this.eId=eId;
			this.eName=eName;
			this.salary=salary;
		}
		
		void disp()		//Static method accept/allows only static variable in their defination
		{
			System.out.println("Employee ID is : "+eId);
			System.out.println("Employee Name is : "+eName);
			System.out.println("Salary of Employee is : "+salary);
			System.out.println("Company Name of Employee is : "+cName);
			System.out.println("\n\n");
		}
		
		static void printStaticVar()
		{
			cName="IBM";
		}
		
	}

	public class StaticBlockMethod {

		public static void main(String[] args) {
			
			Emp55.printStaticVar();
			Emp55 raj = new Emp55(101,"Raj",333564.35);
			raj.disp();

			Emp55 geeta = new Emp55(102,"Geeta",78914.3);
			geeta.disp();
		}

	}