package day39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Creation of Set
		
		//HashSet<Integer> hs = new HashSet<Integer>();
		TreeSet<Integer> hs = new TreeSet<Integer>();
		//2. Addition of elements into the Set
		hs.add(10);
		hs.add(20);
		hs.add(20);
		//hs.add(null);
		//hs.add(null);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println(hs.size()); //3
		System.out.println(hs); //[null, 20, 10]
		
		System.out.println(hs.subSet(0, 100));//[10,20,30,40,50]
	}

}
