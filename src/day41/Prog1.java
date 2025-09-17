package day41;

import java.util.HashSet;
import java.util.Set;

public class Prog1 {

	
	public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
		
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> commonSet = new HashSet<Integer>();
		
		for(int elements : array1) {
			set1.add(elements);
		}
		
		for(int elements : array2) {
			if(set1.contains(elements)) {
				commonSet.add(elements);
			}			
		}
		return commonSet;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {1,2,3,4,5};
		int array2[] = {4,5,6,7,8};
	
		Set<Integer> commonElements = findCommonElements(array1, array2);
		System.out.println("Common elements between 2 arrays are "+commonElements);
		
	
	}

}
