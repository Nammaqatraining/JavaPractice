package day32;

public class Prog9 {

	
	public static void vowelsConsonentsCount(String str) {
		
		int vowels = 0, consonents = 0;
		
		str = str.toLowerCase();
		
		for(char c:str.toCharArray()) {
		    	
			if(c >= 'a' && c<='z') {
			   if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u') {
				   vowels ++;
			   }
			   else {
				   consonents ++;
			   }
			}
		}
		System.out.println("Vowels : "+vowels);
		System.out.println("Consonents : "+consonents);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1243 How are you";
		vowelsConsonentsCount(str);
		
	}

}
