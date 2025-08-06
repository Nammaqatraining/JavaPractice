package day15;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {100,200,300,400};
		
		try
		{
		  System.out.println(arr[100]);

		}
		finally {
			System.out.println("Inside the finally block");
			System.out.println("DB connection close");
		}
		System.out.println("Outside finally block");
	}

}
