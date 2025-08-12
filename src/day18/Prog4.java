package day18;

public class Prog4 {

	public int twiceCalculation(int num1, int num2) {
		if(num1 == num2) {
			//return 2 * (num1+num2);
			int res = 2 * (num1+num2);
			return res;
		}
		else {
			return num1+num2;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog4 obj = new Prog4();
		System.out.println("Result is "+obj.twiceCalculation(20, 20)); //80
		System.out.println("Result is "+obj.twiceCalculation(10, 20)); //30
		System.out.println("Result is "+obj.twiceCalculation(30, 40)); //70
		System.out.println("Result is "+obj.twiceCalculation(2, 2)); //8
		System.out.println("Result is "+obj.twiceCalculation(25, 27)); //52
		
		
	}

}
