package classobject;
//program to show the use of class and object by calling methods
public class Employee {
	 
	      int id;              //fields and instance variables/class variables
	      String name;
	      double salary;
	     
	      void getData(int i,String n,double s)      //instance method 
	      {
	    	      id= i;
	    	      name =n;
	    	      salary=s;
	    	      
	      }
	       void display()          				//instance method
	       {
	    	   System.out.println("Id of Employee : "+id);
	    	   System.out.println("Name of Employee : "+name); 
	    	   System.out.println("Salary of Employee : "+salary);
	       }
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
      
    	Employee e1=new Employee();           //object creation by new
    	e1.getData(01,"Iron Man",33737.7);//initialize the value of instance var by calling method
    	e1.display();
    }

}