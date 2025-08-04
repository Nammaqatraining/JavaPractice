package day13;

public class Prog7 {

	//2. Multi-dimensional array
	//2.1 Jagged array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{1,2,3},
				{4,5,6,7,8},
				{7,8,9,10,11},
				{10}
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
