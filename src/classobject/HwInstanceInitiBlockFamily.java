package classobject;
//Instance Initializer Block should always executes first in the program, before the constructor
//If your program consist of block,method and constructor then block should always executes first
class Family1
{
	String name;
	int noOfMember;
	int income;
	
	void read()
	{
		name="Dupare";
		noOfMember=3;
		income=100000;this.show();/*
		System.out.println("Name of Family : "+name);
		System.out.println("No. of Member : "+noOfMember);
		System.out.println("Income of "+name+" Family : "+income);*/
	}
	
	Family1()
	{
		name="Waghmare";
		noOfMember=4;
		income=500000;this.show();/*
		System.out.println("Name of Family : "+name);
		System.out.println("No. of Member : "+noOfMember);
		System.out.println("Income of "+name+" Family : "+income);*/
	}
	
	{
		name="Dhande";
		noOfMember=3;
		income=800000;this.show();/*
		System.out.println("Name of Family : "+name);
		System.out.println("No. of Member : "+noOfMember);
		System.out.println("Income of "+name+" Family : "+income);*/
	}
	
	void show()
	{
		System.out.println("Name of Family : "+name);
		System.out.println("No. of Member : "+noOfMember);
		System.out.println("Income of "+name+" Family : "+income);
		System.out.println();
	}
}
public class HwInstanceInitiBlockFamily {

	public static void main(String[] args) {
		
		Family1 t1 =new Family1();
		t1.read();

	}

}
