package day32;

import java.util.Arrays;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello how are you doing?";
		
		
		String arr[] = s1.split(" ");
		
		//System.out.println(arr[0]);
		
		for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]);
		}
		

		String arr1[] = s1.split("are");
		
		
		for(int i=0;i<arr1.length;i++) {
		  System.out.println(arr1[i]);
		}
	}

}
