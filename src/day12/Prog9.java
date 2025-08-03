package day12;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		int arr[] = {10,20,300,40,50};

		int sum =0;
		for(int itr :arr)
		{
			System.out.println(itr); //statement blocks	
			if(itr%2 ==0) {
				sum = sum +itr;
			}
			
		}
		System.out.println("Sume of even numbers is "+sum);
	}

}
