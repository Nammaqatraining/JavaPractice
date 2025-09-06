package day31;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String rv1 = "INDIA";
		
		System.out.println("Original string is "+rv1);
		
		String rv2 = "";
		
		for(int i=rv1.length()-1;i>=0;i--) {
			rv2 = rv2+rv1.charAt(i);
		}
		
		System.out.println("Reversed string is "+rv2);
		
	}

}
