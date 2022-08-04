package encapsulation;
//To make a class as read only class, just provide getters in that class. Do not provide setters
class AccDetails1
{
	private long adhar = 12345l;

	public long getAdhar() 
	{
		return adhar;
	}
	
	
}

public class ReadOnly {

	public static void main(String[] args) {
		
		AccDetails1 g1 = new AccDetails1();
		//g1.setAdhar(12345l);	//error=> we can't change the value of adhar bcz, 
									//there is no setters in encapsulated class
		System.out.println(g1.getAdhar());

	}

}
