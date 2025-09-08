package day33;

public class Prog3 {

	
	public static String removeSpace(String str) {
		StringBuilder result = new StringBuilder();
		for(int i =0;i<str.length();i++)
        {
			
			if(str.charAt(i) != ' ') {
				result.append(str.charAt(i));
			}
			
		}
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "India is good in collecting tax";
		System.out.println("Before removing space "+s1);
		String s2 = removeSpace(s1);
		System.out.println("After removing space "+s2);
		
	}

}
