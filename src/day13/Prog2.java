package day13;

public class Prog2 {

	//2. Multi-dimensional array
	//2.1 Two-dimensional array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[][] = new int[4][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		arr[3][0] = 10;
		arr[3][1] = 11;
		arr[3][2] = 12;
		
		//System.out.println(arr[0][0]);
		//System.out.println(arr[0][1]);
		
		//Row size
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
