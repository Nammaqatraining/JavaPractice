package day3;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//operators
		int x = 20;
		int y = 10;
		
		int sum = x + y;
		System.out.println("Sum of 2 numbers "+"is "+sum);
		
		
		int diff = x - y;
		System.out.println("Diff of 2 numbers is "+diff);
		
		System.out.println("Mul of 2 numbers is "+x * y);
		
		System.out.println("Div of 2 numbers is "+x / y);
		
		System.out.println("Perf of 2 numbers is "+x % y);
		
		
		System.out.println(x);
		//x++; //x = x + 1
		
		System.out.println(x++); //post increment
		
		System.out.println(x);
		//++x; //x = x + 1
		System.out.println(++x); //pre increment
	}

}
