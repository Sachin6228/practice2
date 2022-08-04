//program to show the use of encapsulation concept(i.e binding of data members/instance var or function(method)together )

package encapsulation;

class Stud12
{
	  private int amout;		//in case of encapsulation program you must have to declared all the instance var 
	  private String name;		//with private access modifier and use setters and getters
	  
	
	  public void setAmout(int amout)		//setters and getters are the methods provided by java in case of 
      {										//encapsulation to set and read/view the values of PRIVATE instance var
		this.amout = amout;
	   }

		    
		public int getAmout() 
		{
		return amout;
	    }
		
		public String getName() 
         {
		return name;
	     }

       public void setName(String name) 
       {
		this.name = name;
	   }
}

public class MainStud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud12 s1= new Stud12();
		
		//s1.amout=1222;		//we have declared this instance var as private so we can't asign values to that 
		//s1.name="ggsgs;//instance var by using instance var name itself. we have to use methods to access the values
		
		//s1.getdata(1222,"ggsgs");
		
		
	       s1.setAmout(10111);						//called setters and getters
	       System.out.println("amount is ="+s1.getAmout());
	       
	       s1.setName("dddddd");
	       System.out.println("name is="+s1.getName());
	}

}