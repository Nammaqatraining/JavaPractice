package day39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prog3 {

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
		
		//3. Retrieval of elements from the Set 
		for(Integer ele : hs) {
			System.out.println(ele);
		}
		
		//4. Deletion of elements from the Set
		hs.remove(20);
		System.out.println(hs); //[null, 10]
		
		//hs.removeAll(hs);
		//System.out.println(hs); //[]
		
		//hs.clear();
		//System.out.println(hs); //[]
		
		//5. Verification of elements from the Set 
		System.out.println(hs.contains(10));//false
		
		System.out.println(hs.first());//10
		System.out.println(hs.last());//50
		System.out.println(hs.pollFirst());//10 -- removed
		System.out.println(hs);//[30, 40, 50]
		System.out.println(hs.pollLast()); //50 -- removed
		System.out.println(hs);//[30, 40]
	}

}
