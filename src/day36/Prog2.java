package day36;

import java.util.ArrayList;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(10.5); //appends the objects at the end of the array list [10,10.5,Hi,A]
		al.add("Hi"); 
		al.add('A');
		
		System.out.println(al);
		al.add(1, 90); //inserts the given element based on the provided index [10,90,10.5,Hi,A]
		System.out.println(al);
		
		al.set(0, "Bye"); //modifies/replace the given index element with new object [Bye,90,10.5,Hi,A]
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
	}

}
