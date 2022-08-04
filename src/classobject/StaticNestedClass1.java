package classobject;
	//Nested Classes
	//1. static nested class
	//2. non- static nested class(inner class)
	//Static Nested class can be access without creating object of Outer class 
	//The property of Static Nested class is that it does not allows us to access the non static members of Outer class 
	class Outerr{
			
		static int a= 89;
		static class Nested
		{
			static void msg()
			{
				System.out.println("In Messege a : "+a);
			}
			void info()
			{
				System.out.println("In Information a : "+a);
			}
		}//static class closed 
	}	//Outer class closed


	public class StaticNestedClass1  {

		public static void main(String[] args) {
			
			Outerr.Nested n1 = new Outerr.Nested();
			n1.info();		//calling non static method of nested class using object
			
			Outerr.Nested.msg(); //calling static method of nested class using class name
			
	}
}