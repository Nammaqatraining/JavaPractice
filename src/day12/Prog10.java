package day12;

public class Prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Single dimensional array
		int arr[] = {10,20,300,40,50};

		for(int i =0;i<arr.length;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//After sorting
		for(int itr :arr)
		{
			System.out.println(itr); //statement blocks			
		}

	}

}
