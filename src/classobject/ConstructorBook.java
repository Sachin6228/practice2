package classobject;
//initialization of instance variable by calling the constructor
public class ConstructorBook {

	  String bName;
	  String aName;
	  int price;
	  
	  ConstructorBook()						//default constructor
	  {
		  bName= "java";
		  aName="Jarvej";
		  price= 500;
	 }
	  ConstructorBook(String b,String a,int p)        //parameterized constructor
	  {
		  bName=b;
		  aName=a;
		  price= p;
	  }
	 void display()
	  {
		 
System.out.println("Name of Book is : "+bName+"\n"+"Author of Book is : "+aName+"\n"+"Book Price is : "+price);
System.out.println();
	  }
	  
	  public static void main(String[] args) {  
	  
	     ConstructorBook b1= new ConstructorBook();
	     ConstructorBook b2=new ConstructorBook("Space","Astronut",300);
	          
	     b1.display();
	     b2.display();
	  }
}
