package day33;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Prog5 {

	
	
	public static void sepearateChars(String str) {
		
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();
		
		//aBACbcEDed
		for(Character ch : str.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				lowerCase.append(ch); //abced
			}
			else {
				upperCase.append(ch);//BACED
			}
			
		}
		System.out.println("Lower case before sorting "+lowerCase);
		System.out.println("Lower case before sorting "+upperCase);
		
        char[] charArray_LowerCase = lowerCase.toString().toCharArray(); //abced -> [a,b,c,e,d]
        Arrays.sort(charArray_LowerCase); //[a,b,c,e,d]
        lowerCase.setLength(0); // Clear existing content //lowerCase = 0
        lowerCase.append(charArray_LowerCase); //abcde
		System.out.println("Lower case after sorting "+lowerCase);  //abcde
		
		
		
		char[] charArray_UpperCase = upperCase.toString().toCharArray();
		Arrays.sort(charArray_UpperCase);
		upperCase.setLength(0);
		upperCase.append(charArray_UpperCase);
		System.out.println("Upper case after sorting "+upperCase);

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aBACbcEDed";
		
		sepearateChars(s1);
		
	}

}
