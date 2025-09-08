package day33;

import java.util.Arrays;

public class Prog5 {

	
	
	public static void sepearateChars(String str) {
		
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();
		
		for(Character ch : str.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				lowerCase.append(ch);
			}
			else {
				upperCase.append(ch);
			}
			
		}
		System.out.println("Lower case is "+lowerCase);
		System.out.println("Lower case is "+upperCase);
		
        char[] charArray_LowerCase = lowerCase.toString().toCharArray();
        Arrays.sort(charArray_LowerCase);
        lowerCase.setLength(0); // Clear existing content
        lowerCase.append(charArray_LowerCase);
		System.out.println("Lower case is "+lowerCase);
		

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aBACbcEDed";
		
		sepearateChars(s1);
		
	}

}
