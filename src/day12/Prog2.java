package day12;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		int arr[] = {10,20,30,40,50};
		
		
		int sum = 0;
		
		for(int itr :arr)
		{
			System.out.println(itr); //statement blocks	
			
			sum += itr; //sum = sum+itr //10+20=30//30+30=60//60+40=100//100+50=150
			
		}
		
		
		System.out.println("Sum of all the numbers is "+sum);

	}

}
