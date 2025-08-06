package day15;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {100,200,300,400};
		
		try
		{
		  System.out.println(arr[100]);
		}
		catch(ArrayIndexOutOfBoundsException var) {
			//System.out.println(var.toString());
			var.printStackTrace();
			//System.out.println(var.getMessage());
			//System.out.println(var.getCause());
		}
	}

}
