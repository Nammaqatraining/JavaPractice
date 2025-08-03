package day12;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		int arr[] = {10,20,300,40,50};
		
		
		int smallerNo = arr[0];
		
		for(int itr :arr)
		{
			System.out.println(itr); //statement blocks	
			if(smallerNo>itr) {
				smallerNo = itr;
			}
			
		}
		
		
		System.out.println("Smaller number is  "+smallerNo);

	}

}
