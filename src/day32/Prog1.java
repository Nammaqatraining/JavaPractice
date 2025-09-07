package day32;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rv = "MALAYALAM";
		
		int count = 0;
		
		for(int i=0;i<rv.length();i++) {
			System.out.println(rv.charAt(i));
			if(rv.charAt(i) == 'L') {
				count++;
			}
		}
		
		System.out.println("Number of occurence of char L is "+count);
		
	}

}
