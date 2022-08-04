package exceptnhandling;

class Error1
{
	void m1()
	{
		this.m2();
	}
	void m2()
	{
		this.m1();  //here, we wll get a StackOverflowError because we are performing bad recursive call
	}
}

public class ErrorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Error1 e1= new Error1();
		e1.m1();
		
		
	
	}

}
