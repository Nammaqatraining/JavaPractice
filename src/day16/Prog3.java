package day16;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {10,20,0};
		
		
		for(int i=0;i<arr1.length;i++) {
			try {
				System.out.println(arr1[i]/arr2[i]);
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
				// TODO: handle exception
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
		}
		
	}

}
