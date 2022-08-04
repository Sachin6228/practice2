package classobject;
//Program for constructor chaining(calling default constructor inside the Parameterized constructor)

class Sport1
{
	String sName;
	int player;
	String type;
	
	Sport1( )	//default constructor=> the constructor which does not have any args/parameter
	{
		sName="chess";
		player=2;
		type="indoor";
		
		System.out.println("Name of Sport is : "+sName);
		System.out.println("No. of players in "+sName+" is : "+player);
		System.out.println("Type of Sport "+sName+" is : "+type);
		System.out.println();
	}
	
	Sport1(String s,int p,String t)	//parameterized constructor definition=>the constructor
	{								//which consist of some argument/parameter........
		this();		//calling the default constructor
		sName= s;
		player= p;
		type= t;
		
		System.out.println("Name of Sport is : "+sName);
		System.out.println("No. of players in "+sName+" is : "+player);
		System.out.println("Type of Sport "+sName+" is : "+type);
		System.out.println();
	}	
	
	/*void display()
	{
		System.out.println("Name of Sport is : "+sName);
		System.out.println("No. of players in "+sName+" is : "+player);
		System.out.println("Type of Sport "+sName+" is : "+type);
		System.out.println();

	}*/
}
public class ConstructorChainingUsingThis {

	public static void main(String[] args) {
		
		Sport1 v1 =new Sport1("Cricket",11,"OutDoor");	//parameterized constructor calling
	}

}
                  