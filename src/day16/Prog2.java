package day16;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {10,20,0};
		
		
		for(int i=0;i<arr1.length;i++) {
			try {
				System.out.println(arr1[i]/arr2[i]);
			}
			catch (ArithmeticException e) {
				// TODO: handle exception
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
			catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		
	}

}
