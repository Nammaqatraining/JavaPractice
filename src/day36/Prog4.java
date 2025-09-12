package day36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> al = new Vector<String>();
		al.add("Bengaluru");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Agra");
		//al.add(10);
		
		//Before sorting - insertion order
		System.out.println(al); //[Bengaluru, Pune, Mumbai, Agra]
		
		//Sorting
		Collections.sort(al);
		
		
		//After sorting
		System.out.println(al); //[Agra, Bengaluru, Mumbai, Pune]
		
	}

}
