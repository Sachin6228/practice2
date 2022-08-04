package collection.program;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List v1 = new Vector();

		Vector<Character> v1 = new Vector<Character>();
		
		v1.add('h');
		v1.add('e');
		v1.add('l');
		v1.add('l');
		v1.add('o');
	
		System.out.println(v1);
	
		
		
		
		
		
/*		Vector<Character> v1 = new Vector<Character>();
		
			v1.add('h');
			v1.add('e');
			v1.add('l');
			v1.add('l');
			v1.add('o');
		
			System.out.println(v1);
			
		System.out.println(v1.size());
			System.out.println(v1.capacity());
			System.out.println("Before trimToSize() v1 is : "+v1.capacity());
			v1.trimToSize();//it trim the capacity of a vector to its size
			System.out.println("after trimToSize v1 capacity : "+v1.capacity());	*/
			
			
			/*System.out.println(v1.firstElement());
			System.out.println(v1.lastElement());
			System.out.println(v1.elementAt(3)); */
						
			
/*			Character ch[] = new Character[5];
			ch[0]='t';
			ch[1]='o';
			v1.copyInto(ch);
			System.out.println(ch);//hm directly initialize nhi kr skte
			System.out.println("After copying an element of vector into an array is : ");
			for( Character a : ch )//one by one visit krke element ko print krta hai
			{
				System.out.println(a);
			}						*/
			
			
			
			
			
			
			
			/*System.out.println(v1.capacity());//10
			
			v1.ensureCapacity(50);// we can set our own capacity of vector by using ensure Capacity method()
			System.out.println(v1.capacity());			*/
		
		
		
		
		/*		Vector<Character> v1 = new Vector<Character>();
		
		v1.add('h');
		v1.add('e');
		v1.add('l');
		v1.add('l');
		v1.add('o');
		
		System.out.println(v1);
		
		
		
		System.out.println(v1.capacity());// increases ===> capacity*2	default capacity is 10
		v1.add('h');
		v1.add('e');
		v1.add('l');
		v1.add('l');
		v1.add('o');
		v1.add('h');
		v1.add('e');
		v1.add('l');
		v1.add('l');
		v1.add('o');
		v1.add('a');
		System.out.println(v1.capacity());// increases ===> capacity*2		*/
	}

}
