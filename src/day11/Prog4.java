package day11;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nested for loops with break stmt
		for(int i =0;i<3;i++) {
			
			System.out.println("i value is "+i);
			for(int j=0;j<100;j++) {
				if(j==5) {
					break;
				}
			}
			System.out.println("");
		
		}
	
		
		
	}

}
