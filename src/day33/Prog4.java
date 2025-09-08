package day33;

public class Prog4 {

	
	public static String dobleChars(String str) {
		StringBuilder result = new StringBuilder();
		for(int i =0;i<str.length();i++)
        {
			
				char ch = str.charAt(i);
				result.append(ch).append(ch);
			
		}
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "India is good in collecting tax";
		System.out.println("Before printing each letter twice "+s1);
		String s2 = dobleChars(s1);
		System.out.println("After printing each letter twice  "+s2);
		
	}

}
