package day31;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rv1 = "dad";
		
		System.out.println("Original string is "+rv1);
		
		String rv2 = "";
		
		for(int i=rv1.length()-1;i>=0;i--) {
			rv2 = rv2+rv1.charAt(i);
		}
		
		System.out.println("Reversd string is "+rv2);
		if(rv1.equals(rv2)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
		
	}

}
