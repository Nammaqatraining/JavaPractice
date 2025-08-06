package day15;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {100,200,300,400};
		
		try
		{
		  System.out.println(arr[1]);
		}
		catch(ArrayIndexOutOfBoundsException var) {
			var.printStackTrace();
		}
		finally {
			System.out.println("Inside the finally block");
		}
	}

}
