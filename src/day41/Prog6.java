package day41;

public class Prog6 {

	
	
	public static boolean isPalandrome(String s1) {
		
		
		int start = 0;
		int end = s1.length()-1;
		
		while(start<end) {
			if(s1.charAt(start) != s1.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "madam";
		boolean b = isPalandrome(s1);
		if(b == true) {
			System.out.println("Given string is palandrome");
		}
		else {
			System.out.println("Given string is not palandrome");
		}
	}

}
