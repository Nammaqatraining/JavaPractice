package day32;

import java.util.Arrays;

public class Prog10 {

	
	public static void uniqueCharacters(String str) {
		//Ascii characters (0-127)
		
		boolean unique[] = new boolean[128];
		char uniq[] = new char[10];
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!unique[ch]) {
				unique[ch] = true;
				System.out.println(ch);
			}
		
		}
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java automation";
		System.out.println(str);
		uniqueCharacters(str);
	}

}
