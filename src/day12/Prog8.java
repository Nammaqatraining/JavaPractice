package day12;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		int arr[] = {10,20,300,40,50};
		
		
		int search = 40;
		boolean b = false;
		
		for(int itr :arr)
		{
			System.out.println(itr); //statement blocks	
			if(search == itr) {
				b = true;
				System.out.println("Element "+itr+" is present in the given array");
				break;
			}
			
		}
		
		if(b == false) {
			System.out.println("Element "+search+" not found in the given array");	
		}

	}

}
