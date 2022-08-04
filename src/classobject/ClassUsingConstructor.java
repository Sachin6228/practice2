package classobject;
//initialization of instance variable by calling the constructor
	class Sport
	{
		String s_name;
		int player;
		String type;
		
		Sport( )	//default constructor=> the constructor which does not have any args/parameter
		{
			s_name="chess";
			player=2;
			type="indoor";
		}
		
		Sport(String s,int p,String t)	//parameterized constructor definition=>the constructor
		{								//which have parameter/args
			s_name= s;
			player= p;
			type= t;
		}	
		
		void display()
		{
			System.out.println("Name of Sport is : "+s_name);
			System.out.println("No. of players in "+s_name+" is : "+player);
			System.out.println("Type of Sport "+s_name+" is : "+type);
			System.out.println();

		}
	}

public class ClassUsingConstructor {

	public static void main(String[] args) {
		
		Sport s1 = new Sport("Cricket",11,"OutDoor");	//parameterized constructor calling
		s1.display();
		
		Sport s2 = new Sport();
		s2.display();
		
		Sport s3 =new Sport();
		s3.display();
	}

}
