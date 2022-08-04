package classobject;
//Initialize the the value of Instance Variable by calling Instance Variable
//Program to show the use of class and object by calling instance variables

//Initialize the object by Instance Variable
public class Rectangle {
          
	     int length;
	     int width;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle r1= new Rectangle();
        r1.length=10;			//calling instance variables and assigning values to them
        r1.width=20;
        
         int area= r1.length*r1.width;
         System.out.println("Area of Rectangle : "+area);
        		
		    
	}

}