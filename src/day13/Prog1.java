package day13;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr1[] = {"India", "England"};
		String arr2[] = {"US", "UK"};
		String result[] =  new String[arr1.length+arr2.length];
		
		
	    int i =0;
		while(i<arr1.length)
		{
			result[i] = arr1[i]; //statement blocks			
			i++;
		}
		
		/*int k =arr1.length;
		while(k-2<arr2.length)
		{
			result[k] = arr2[k-2]; //statement blocks			
			k++;
		}*/
		int k = 0;
		while(k<arr2.length)
		{
			result[i] = arr2[k]; //statement blocks			
			k++;
			i++;
		}
		
		int j  =0;
		while(j<result.length)
		{
			System.out.println(result[j]); //statement blocks			
			j++;
		}
	}

}
