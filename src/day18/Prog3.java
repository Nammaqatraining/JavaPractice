package day18;

public class Prog3 {

	
	static boolean calculate(int num1, int num2) {
		if(num1+num2 == 30 | num1 == 30 | num2 ==30) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Result is "+Prog3.calculate(10,20)); //true
		 
		System.out.println("Result is "+Prog3.calculate(30,20)); //true
		System.out.println("Result is "+Prog3.calculate(13,20)); //false
		System.out.println("Result is "+Prog3.calculate(19,200)); //false
	}

}
