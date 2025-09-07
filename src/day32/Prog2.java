package day32;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rv = "MALAYALAM";
		System.out.println("The original string is "+rv);
		
		System.out.println("The replace  string is "+rv.replace('M', 'G'));
		
		
		char arr[] = rv.toCharArray();
		System.out.println(arr[0]);
		arr[1] = 'H';
		System.out.println(arr);
	}

}
