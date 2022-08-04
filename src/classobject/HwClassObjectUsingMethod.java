package classobject;
//initialization of instance variable by instance method
class Family
{
	int member_no;
	String surname;
	String name;
	
	void read(int no,String nam,String suname)
	{
		member_no = no;
		name = nam;
		surname= suname;
	}
	
	void disp()
	{
		System.out.println("Name is : "+name);
		System.out.println("Surname of "+name+" is : "+surname);
		System.out.println("In "+surname+" Family, member is : "+member_no);
		System.out.println("******************");
	}
}

public class HwClassObjectUsingMethod {

	public static void main(String[] args) {
		
		Family g1 = new Family();
		g1.read(5,"Gaurav","Pohane");
		g1.disp();
		
		Family g2 =new Family();
		g2.read(10,"Anuroop","Mallik");
		g2.disp();
	}

}
