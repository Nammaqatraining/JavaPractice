package day17;

public class Prog4 {

	static void swap(int a, int b) {
		
		//a = a+b; //40
		//b = a-b; //40-30 = 10
		//a = a-b; //40-10 = 30
		
		a = (b-a)+(b=a); //(30-10)+(30) 
		
		System.out.println("number1 " +a);
		System.out.println("number2 " + b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 30;
		System.out.println("Before swapping");
		System.out.println("number1 " +num1);
		System.out.println("number2 " + num2);
		System.out.println("After swapping");
		Prog4.swap(num1, num2);
		
	}

}
