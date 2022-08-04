package collectionframeworkk;//7-4-22
//Program that implements Comparator interface in java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1  
{
	int id;
	String name;
	double sal;
	
	public Employee1(int id, String name, double sal) 
	{
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
}

class SalComparator implements Comparator<Employee1> 
{
	public int compare(Employee1 e1,Employee1 ee)
	{
		 if(e1.sal==ee.sal)
		  {
			  return 0;
		  }
		  else if(e1.sal < ee.sal)
		  {
			  return -1;
		  }
		  else
		  {
			  return 1;
		  }
	}
} //class close
class  IdComparator implements Comparator<Employee1> 
{
	public int compare(Employee1 e1,Employee1 e2)
	{
		 if(e1.id==e2.id)
		  {
			  return 0;
		  }
		  else if(e1.id < e2.id)
		  {
			  return -1;
		  }
		  else
		  {
			  return 1;
		  }
	}
	
} //class close

class  NameComparator implements Comparator<Employee1> 
{
	public int compare(Employee1 e1,Employee1 e2)
	{
		  return e1.name.compareTo(e2.name);	
		
	}
}	
public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Employee1> a1=new ArrayList<Employee1>();

		Employee1 e1=new Employee1(101,"ram",7555.9);
		Employee1 e5=new Employee1(121,"zebra",3242.8);
		Employee1 e2=new Employee1(104,"priya",9494.7);
		Employee1 e3=new Employee1(102,"raj",8511.8);
		Employee1 e4=new Employee1(123,"abhi",1242.8);
		
		a1.add(e1);
		a1.add(e5);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		
		System.out.println("\nSorting based on the salary of the emp");
		SalComparator s1=new SalComparator();
		Collections.sort(a1,s1); 

       for(Employee1 n   :    a1) 
       {
         System.out.println(n.id+" "+n.name+" "+n.sal);

		}
       
       System.out.println("\nSorting based on the id of the emp");
		IdComparator i1=new IdComparator();
		Collections.sort(a1,i1); 

        for(Employee1 n   :    a1) 
        {
          System.out.println(n.id+" "+n.name+" "+n.sal);

		}
        
        System.out.println("\nSorting based on the name of the emp");
        NameComparator n1=new NameComparator();
 		Collections.sort(a1,n1); 

          for(Employee1 n   :    a1) 
          {
            System.out.println(n.id+" "+n.name+" "+n.sal);

 		}
	}

}