package day12;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		double marks[] = {100.0,89.0,75.0,80.0,99.0};
		
		
		double sum = 0;
		
		for(double itr :marks)
		{
			System.out.println(itr); //statement blocks	
			
			sum += itr; 
			
		}
		
		
		System.out.println("Sum of all the numbers is "+sum);
		
		double avg = sum/marks.length;
		
		System.out.println("Avg marks is "+avg);
		

	}

}
