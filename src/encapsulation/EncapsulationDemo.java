package encapsulation;

//Program for Encapsulation To achieve Encapsulation in java
//1.Make the all instance variable of Encapsulated class as a private
//2.Provide setters and getters for all the instance variable to modify(setter) & view(getter)
// Encapsulation is used to provide security to data 
class AccDetails
{
	private long adhar;
	private String pan;
	private long accNo;
	
	public void setAdhar(long adhar) 
	{
		this.adhar = adhar;
	}
	public void setPan(String pan) 
	{
		this.pan = pan;
	}
	public void setAccNo(long accNo)
	{
		this.accNo = accNo;
	}
	public long getAdhar()
	{
		return adhar;
	}
	public String getPan() 
	{
		return pan;
	}
	public long getAccNo() 
	{
		return accNo;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		AccDetails a1 = new AccDetails();
		
		a1.setAccNo(12345l);
		System.out.println("Account No. of Costumer is : "+a1.getAccNo());
	
		a1.setAdhar(67890l);
		System.out.println("Adhar No. of Costumer is : "+a1.getAdhar());
		
		a1.setPan("124D65A");
		System.out.println("Pan  No. of Costumer is : "+a1.getPan());
	}

}
