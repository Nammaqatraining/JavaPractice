package day12;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		int arr[] = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 30;
		arr[3] = 4;
		arr[4] = 5;
		
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		
		//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//System.out.println(arr[5]);
		
		//System.out.println(arr.length);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[2]);
		}
		
		
		for(int itr :arr)
		{
			System.out.println(itr); //statement blocks			
		}

	}

}
