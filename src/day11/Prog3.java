package day11;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while loop with break stmt
		
		int i =0;
		while(i<100) {
			if(i==10) {
				System.out.println("Entered if condition because i = "+i);
				break;
			}
			System.out.println("i value is "+i);
			i++;
		}
		
		
	}

}
