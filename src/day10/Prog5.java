package day10;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for(char ch1 = 'A'; ch1<='E'; ch1++) //outer loop
		{
			for(char ch2 = 'A'; ch2<=ch1; ch2++) //inner loop
			{	
				System.out.print(ch1); //printing *
			}
			System.out.println(""); //number of rows
		}
		
	}

}
