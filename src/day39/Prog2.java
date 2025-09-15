package day39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Creation of Set
		
		//HashSet<Integer> hs = new HashSet<Integer>();
		Set<Integer> hs = new LinkedHashSet<Integer>();
		//2. Addition of elements into the Set
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(null);
		hs.add(null);
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
		
		
	}

}
