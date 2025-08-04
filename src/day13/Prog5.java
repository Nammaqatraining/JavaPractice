package day13;

public class Prog5 {

	//2. Multi-dimensional array
	//2.1 Two-dimensional array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int arr[][] = {{1,2},{4,5},{6,7},{8,9},{10,11}};
		//int arr[][] = new int[][]{{1,2},{4,5},{6,7},{8,9},{10,11}};
		
		/*int[][] arr = new int[3][2];
		arr[0]= new int[] {1,2};
		arr[1] = new int[] {4,5};
		arr[2] = new int[] {6,8};*/
		
		
		int[][] arr = {
				{1,2},
				{2,6},
				{8,30},
				{50,90}
		};
	

		int size = 0;
		for(int j=0;j<arr.length;j++) {
			size += arr[j].length; //size = size + arr[j].length
		}
		
		System.out.println("The array size is "+size);
		System.out.println("************************");
		for(int i=0;i<arr.length;i++) { //row
			for(int j=0;j<arr[i].length;j++) { //column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
