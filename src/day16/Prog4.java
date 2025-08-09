package day16;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {10,20,0};
		
		
		for(int i=0;i<arr1.length;i++) {
			try {
				System.out.println(arr1[i]/arr2[i]);
			}
			/*catch (RuntimeException e) {
				// TODO: handle exception
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}*/
			/*catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}*/
			catch (Throwable e) {
				// TODO: handle exception
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
	
		
		}
		
	}

}
