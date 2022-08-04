package collection.program;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		// List l1 = new LinkedList();

		LinkedList<Integer> l1 = new LinkedList();

		l1.add(67);
		l1.add(3);
		l1.add(7);
		l1.add(27);
		l1.add(7);
		l1.add(9);

		System.out.println(l1);
		
		System.out.println(l1.removeLastOccurrence(7));
		System.out.println(l1);
		
		
		
		/*
		 * System.out.println(l1.poll());//Retrieves and removes the head (first
		 * element) of this list. System.out.println("After poll l1"+l1);
		 * System.out.println(l1.pollFirst());//Retrieves and removes the first element
		 * of this list,or returns null if this list is empty.
		 * System.out.println("After pollfirst l1"+l1);
		 * System.out.println(l1.pollLast());//Retrieves and removes the last element of
		 * this list,or returns null if this list is empty.
		 * System.out.println("After polllast l1"+l1);
		 */
		
		
		/*
		 * System.out.println(l1.offerFirst(100));//Inserts the specified element at the
		 * front of this list. System.out.println(l1);
		 * System.out.println(l1.offer(900));//Adds the specified element as the tail
		 * (last element) of this list. System.out.println(l1);
		 * System.out.println(l1.offerLast(600));//Inserts the specified element at the
		 * end of this list. System.out.println(l1);
		 */

		
		
		// System.out.println(l1.get(3));

		
		/*
		 * System.out.println(l1.element());//retrives, but does not remove,the
		 * head(first element) System.out.println("after element() l1 : "+l1);
		 * System.out.println(l1); System.out.println(l1.getFirst());
		 * System.out.println(l1); System.out.println(l1.peekFirst());
		 * System.out.println("aftre peak first"+l1);
		 */

		/*
		 * Collections.sort(l1); System.out.println("asc order : "+l1);
		 * Collections.sort("desc "+l1, Collections.reverseOrder());
		 * System.out.println(l1.contains(7));
		 */

		// System.out.println(l1.contains(7));

		/*
		 * l1.addFirst(100); System.out.println(l1); l1.addLast(400);
		 * System.out.println(l1);
		 */

		/*
		 * l1.add(2,10); System.out.println(l1);
		 */
	}

}
