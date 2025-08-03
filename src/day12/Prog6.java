package day12;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		int arr[] = {10,20,300,40,50};
		
		
		int larestNo = 0;
		
		for(int itr :arr)
		{
			System.out.println(itr); //statement blocks	
			if(larestNo<itr) {
				larestNo = itr;
			}
			
		}
		
		
		System.out.println("Largest number is  "+larestNo);

	}

}
