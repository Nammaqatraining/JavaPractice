package day10;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int k = 1;
		
		for(int i =1;i<5;i++) //outer loop
		{
			for(int j =1;j<=i;j++) //inner loop
			{	
				System.out.print(k); //printing *
				k++;
			}
			System.out.println(""); //number of rows
		}
		
	}

}
