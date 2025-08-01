package day10;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		char ch = 'A';
		for(int i =1;i<5;i++) //outer loop
		{
			
			for(int j =1;j<=i;j++) //inner loop
			{	
				System.out.print(ch); //printing *
				ch++;
			}
			System.out.println(""); //number of rows
		}
		
	}

}
