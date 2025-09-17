package day41;

import java.util.HashMap;
import java.util.Set;

public class Prog5 {

	
	public static void duplicateCharsCount(String intputString) {
		
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] strArray = intputString.toCharArray();
		
		for(char c : strArray) {
		 if(charCountMap.containsKey(c)) {
			 charCountMap.put(c, charCountMap.get(c)+1);
		 }
			
		 else {
			 charCountMap.put(c, 1);
		 }
		}
		
		
		Set<Character> charInString  = charCountMap.keySet();
		for(Character ch : charInString) {
			if(charCountMap.get(ch) > 1) {
				System.out.println(ch + " : "+ charCountMap.get(ch));
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Learn java program with collections";
		System.out.println("Given string "+s1);
		duplicateCharsCount(s1);
		
		
	}

}
