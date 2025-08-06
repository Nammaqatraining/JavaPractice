package day14;


public class Prog2 {

	//Exception handling
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prog started");
		int x = 100;
		int y = 0;
		
		int result = 0;
		
		
		
		try {
			result = x/y;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured"+e);
		}
		
		
		System.out.println("Result is "+result);
		
		System.out.println("Prog ended");
	}

}
