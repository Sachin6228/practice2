package classobject;
//Program for Non Static Nested Class
class Student3	//Outer class
{
	int rno;
	String name;
	
	Student3(int rno,String name)	//constructor of outer class 
	{
		this.rno = rno;
		this.name = name;
	}
	
	void outerDisp()
	{
		System.out.println("Outer Consstructor Name : "+name);
		System.out.println("Outer Constructor Roll No : "+rno);
	}
	
	class Lib	//Non Static nested class (inner class)
	{
		int nosBook;
		
		Lib (int nosBook)	//constructor of inner class
		{
			this.nosBook = nosBook;
		}
		
		void innerDisp()
		{
			System.out.println("Inner Construuctor nosBooks : "+nosBook);
		}
	}	//inner class close
}		//outer class close

public class NonStaticNestedClass {

	public static void main(String[] args) {
		
		Student3 s1 = new Student3(23,"Priya");
		s1.outerDisp();
		
		Student3.Lib I1 = s1.new Lib(2000);
		I1.innerDisp();
	}
}
