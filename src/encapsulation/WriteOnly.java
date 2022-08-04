package encapsulation;
//To make a class as write only class, just provide setters in that class. Do not provide getters
class AccDetails2
{
	private long adhar;

	public void setAdhar(long adhar) 
	{
		this.adhar = adhar;
	}
	
}

public class WriteOnly {

	public static void main(String[] args) {
		AccDetails2  ra1 =new AccDetails2();
		ra1.setAdhar(456787l);
		//System.out.println(g1.getAdhar());	//error=> we can't read the value of adhar bcz,
												//there is no getters in encapsulated class

	}

}
