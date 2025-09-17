package day38;

import java.util.Iterator;
import java.util.LinkedList;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> li = new LinkedList<String>();
		

		//Addition of elements into the linked list
		//System.out.println(li.size());//0
		li.add("1");
		li.add("2");
		li.add("3");
		
		//2. Retrieval of elements from the linked list
		for(String s : li) {
			System.out.println(s);
		}
		
		Iterator<String> itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//3. Deletion of elements from the linked list
		li.remove(0);//[2, 3]
		System.out.println(li.toString());
				
		li.remove("3");
		System.out.println(li.toString());//[2]
		
		//li.removeAll(li);
		
	
		
		//4. Updating of elements in the linked list
		LinkedList<String> li1 = new LinkedList<String>();
		li1.add("1");
		li1.add("2");
		li1.add("3");
		
		li.addAll(li1);
		System.out.println(li);//[2, 1, 2, 3]
		
		System.out.println(li.removeFirst());//2
		System.out.println(li.removeLast());//3
		
		System.out.println(li);//[1, 2]
		
		//5. Verification of elements from the linked list
		System.out.println(li.containsAll(li1));//false
		
		System.out.println(li.contains("20"));//false
		
		li.add(1, "4");
		System.out.println(li);
		
		
		li.set(1, "5");
		System.out.println(li);
		
	}

}
