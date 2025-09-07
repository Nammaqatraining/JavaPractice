package day32;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "India has many states? karnataka is one^ of them";
		
		//System.out.println(s1.substring(6));
		
		//String arr[] = s1.split("\\?");
		String arr[] = s1.split("\\^");
		
		
		for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i].trim());
		}
		
	}

}
