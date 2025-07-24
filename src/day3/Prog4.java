package day3;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20;
		int y = 10;
		
		
		//System.out.println(x & y);
		//System.out.println(x | y);
		
		
		boolean result = x<y && y>x; //false && false = false
		System.out.println(result);
		
		boolean result1 = x<y && x>y; //false && true = false
		System.out.println(result1);
		
		
		boolean result2 = x<y || x>y; //false && true = true
		System.out.println(result2);
	}

}
