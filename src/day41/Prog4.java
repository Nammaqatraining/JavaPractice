package day41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Prog4 {

	
	public static ArrayList<String> removeDuplicates(ArrayList<String> al) {
		
		Set<String> set1 = new HashSet<String>();
		set1.addAll(al);
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.addAll(set1);
		return al1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("India");
		al.add("Nepal");
		al.add("China");
		al.add("China");
		al.add("USA");
		al.add("UK");
		
		
		System.out.println("Array list with duplicates "+al);
		
		
		ArrayList<String> removedDuplicates = removeDuplicates(al);
		System.out.println("Array list with duplicates"+removedDuplicates);
	}

}
