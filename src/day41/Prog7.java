package day41;

import java.util.Iterator;
import java.util.LinkedList;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> li = new LinkedList<String>();

		//Addition of elements into the linked list
		//System.out.println(li.size());//0
		li.add("1");
		li.add("2");
		li.add("3");
		
		
		Iterator<String> itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
