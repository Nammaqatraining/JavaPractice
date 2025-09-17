package day41;

import java.util.HashSet;
import java.util.Set;

public class Prog3 {

	
	public static Set<Integer> removeDuplicates(int[] array) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		for(int elements : array) {
			set1.add(elements);
		}
		
		return set1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {1,2,3,4,5,5,7,4,2,1};
		
		Set<Integer> afterRemovingDuplicateElements = removeDuplicates(array);
		System.out.println("After removing duplicate elements from array "+afterRemovingDuplicateElements);
		
		
	}

}
