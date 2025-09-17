package day41;

import java.util.ArrayList;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("Nepal");
		al.add("China");
		al.add("USA");
		al.add("UK");
		
		
		if(!al.isEmpty()) {
			
			String firstElement = al.get(0);
			String lastElement = al.get(al.size() - 1);
			
			System.out.println("First element is "+firstElement);
			System.out.println("Last element is "+lastElement);
		}
		else {
			System.out.println("Given array list is empty");
		}
		
		
	}

}
