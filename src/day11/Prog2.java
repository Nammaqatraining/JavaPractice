package day11;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1;i<6;i++) //outer loop
		{
			for(int j =1;j<=i;j++) //inner loop
			{	
				System.out.print("*"); //printing *
			}
			System.out.println(""); //number of rows
		}
		
		for(int i =5;i >= 1; i--) //outer loop
		{
		
			for(int k =i;k>=1;k--) //inner loop
			{	
				System.out.print("*"); //printing *
			}
			System.out.println(); //number of rows
		}
	}

}
