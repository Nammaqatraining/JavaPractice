package day10;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for(int i =1;i<5;i++) //outer loop
		{
			for(int j =0;j<i;j++) //inner loop
			{	
				System.out.print((i+j)%2); //printing *
			}
			System.out.println(""); //number of rows
		}
		
	}

}
