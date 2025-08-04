package day13;

public class Prog6 {

	//2. Multi-dimensional array
	//2.1 Jagged array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[4][]; //Don't declare the column size
		
		arr[0]= new int[3];
		arr[1] = new int[5];
		arr[2] = new int[5];
		arr[3] = new int[3];
	

		arr[0][0] =1;
		arr[0][1] =2;
		arr[0][2] =3;
		
		arr[1][0] =4;
		arr[1][1] =5;
		arr[1][2] =6;
		arr[1][3] =7;
		arr[1][4] =8;
		
		
		arr[2][0] =7;
		arr[2][1] =8;
		arr[2][2] =9;
		arr[2][3] =10;
		arr[2][4] =11;
		
		arr[3][0] =10;
		arr[3][1] =11;
		arr[3][2] =12;
		
		

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
