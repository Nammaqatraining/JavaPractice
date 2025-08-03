package day12;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		int marks[] = {100,89,75,80,99};
		
		
		int sum = 0;
		
		for(int itr :marks)
		{
			System.out.println(itr); //statement blocks	
			
			sum += itr; 
			
		}
		
		
		System.out.println("Sum of all the numbers is "+sum);
		
		int avg = sum/marks.length;
		
		System.out.println("Avg marks is "+avg);
		

	}

}
