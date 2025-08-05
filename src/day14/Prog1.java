package day14;

public class Prog1 {

	//Exception handling
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prog started");
		int x = 10;
		int y = 0;
		
		int result = 0;
		
		result = x/y;
		
		/*try {
			result = x/y;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception occured");
		}*/
		
		
		System.out.println("Result is "+result);
		
		System.out.println("Prog ended");
	}

}
