package day40;

import java.util.LinkedList;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> li = new LinkedList<String>();

		////Addition of elements into the linked list
		li.add("1");
		li.add("2");
		li.add("3");
		

		System.out.println(li);
		
		//3. Retrieval of elements from the Linked list
		System.out.println(li.peek());

		
		//4. Deletion of elements from the Linked list
		li.poll();
		System.out.println(li);
		
		while(!li.isEmpty()) {
			System.out.println(li.poll());
		}
		
		//5. Verification of elements from the Linked list
		System.out.println(li.contains(82));
	}

}
