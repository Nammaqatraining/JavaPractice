package day16;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try {
				int[] arr1 = new int[-2];
				System.exit(0);
			}
			catch (Throwable e) {
				// TODO: handle exception
				System.exit(0);
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Finally block is executed");
			}
		
	}

}
