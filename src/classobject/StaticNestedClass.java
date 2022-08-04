package classobject;
//nested class 				
//1.static nested class	2.Non static nested class
//Program for Static Nested Class
class Emp2	//"Non-Static Outer Class"
{
	int id;
	double sal;
	static String cName="IBM";
	
	void get(int id, double sal)
	{
		this .id =id;
		this.sal=sal;
	}
	void outerDisplay()
	{
		System.out.println("Employee ID is : "+id);
		System.out.println("Employee Salary is : "+sal);
	}
	static class Dept //"Static nested/Inner class"
	{//Static inner class  always accepts static variable of outer class, so using...
		void nestedDisplay()
		{
			System.out.println("Company name is : "+cName);
		}
	}
}
public class StaticNestedClass {

	public static void main(String[] args) {
		
		Emp2 e1 = new Emp2();	//Object creation of outer class Emp
		e1.get(101,4343.74);	//method of outer class emp
		e1.outerDisplay();		//method off outer class emp
		
		Emp2.Dept n1 = new Emp2.Dept();	//Objet creation of nested class Dept
								//Static class can be accessed WITHOUT creating object of outer
		n1.nestedDisplay(); 	//	method of nested class Dept

	}

}
