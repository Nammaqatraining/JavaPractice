package day10;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for(int i =1;i<5;i++) //outer loop
		{
			char ch = 'A';
			for(int j =1;j<=i;j++) //inner loop
			{	
				System.out.print(ch); //printing *
				ch++;
			}
			System.out.println(""); //number of rows
		}
		
	}

}
