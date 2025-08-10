package day17;

public class Prog3 {

	static void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("number1 " +num1);
		System.out.println("number2 " + num2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 30;
		System.out.println("number1 " +num1);
		System.out.println("number2 " + num2);
		Prog3.swap(num1, num2);
		
	}

}
