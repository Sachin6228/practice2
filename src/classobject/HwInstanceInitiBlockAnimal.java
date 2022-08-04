package classobject;
//Instance Initializer Block should always executes first in the program, before the constructor
//If your program consist of block,method and constructor then block should always executes first
class Animal1
{
	String name;
	int age;
	String color;
	
	void read()
	{
		name = "Dog";
		age=8;
		color="Black";this.show();/*
		System.out.println("Name of Animal : "+name);
		System.out.println("Age of "+name+" is : "+age);
		System.out.println("Color of "+name+" is : "+color);*/
	}
	
	Animal1()
	{
		name = "Horse";
		age=14;
		color="Brown";this.show();/*
		System.out.println("Name of Animal : "+name);
		System.out.println("Age of "+name+" is : "+age);
		System.out.println("Color of "+name+" is : "+color);*/
	}
	
	{		//instance initializer block=> used to initialize the instance variable of the class
		name = "Cat";
		age=3;
		color="White";this.show();/*
		System.out.println("Name of Animal : "+name);
		System.out.println("Age of "+name+" is : "+age);
		System.out.println("Color of "+name+" is : "+color);*/
	}
	void show()
	{
		System.out.println("Name of Animal : "+name);
		System.out.println("Age of "+name+" is : "+age);
		System.out.println("Color of "+name+" is : "+color);
	}
}
public class HwInstanceInitiBlockAnimal {

	public static void main(String[] args) {
		
		Animal1 p1 =new Animal1();
		p1.read();
		

	}

}
