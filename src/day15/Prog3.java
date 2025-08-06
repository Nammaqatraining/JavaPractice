package day15;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {100,200,300,400};
		
		try
		{
		  System.out.println(arr[100]);
		  System.out.println("DB connection");
		  System.out.println("Run some select command");
		}
		catch(ArrayIndexOutOfBoundsException var) {
			var.printStackTrace();
			System.out.println("Select command failed");
		}
		finally {
			System.out.println("Inside the finally block");
			System.out.println("DB connection close");
		}
	}

}
