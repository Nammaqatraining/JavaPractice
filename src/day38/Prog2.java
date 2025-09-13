package day38;

import java.util.LinkedList;
import java.util.List;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List li = new LinkedList();
		

		//Addition of elements into the linked list
		//System.out.println(li.size());//0
		li.add("1");
		li.add("2");
		li.add("3");
		li.add(10);
		li.add(20);
		li.add("1");
		
		//2. Retrieval of elements from the linked list
		for(Object s : li) {
			System.out.println(s);
		}
		
		
	}

}
