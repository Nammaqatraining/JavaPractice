package day13;

public class Prog3 {

	//2. Multi-dimensional array
	//2.1 Two-dimensional array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[][] = new int[4][2];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 4;
		arr[1][1] = 5;

		arr[2][0] = 7;
		arr[2][1] = 8;
		
		arr[3][0] = 10;
		arr[3][1] = 11;

		int size = 0;
		for(int j=0;j<arr.length;j++) {
			size += arr[j].length; //size = size + arr[j].length
		}
		
		System.out.println("The array size is "+size);
		
	}

}
