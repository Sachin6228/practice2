package encapsulation;
class Facebook
{
	private String userName;
	private String password;
	private String captcha;
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getCaptcha()
	{
		return captcha;
	}
	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	public void setCaptcha(String captcha) 
	{
		this.captcha=captcha;
	}
}
public class EncapsulationFacebook {

	public static void main(String[] args) {
	
		Facebook g1 = new Facebook();
		g1.setUserName("vishalram");
		System.out.println("User name is : "+g1.getUserName());
		
		g1.setPassword("Vishal@123");
		System.out.println("Password is : "+g1.getPassword());
							
		g1.setCaptcha("Cx25zBf");
		System.out.println("Captcha is : "+g1.getCaptcha());
	}

}
