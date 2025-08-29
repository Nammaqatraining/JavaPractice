package day22;

public class Prog1 {

	//method overloading
	
	//1. Number of arguments
	public void add(int a, int b) {
		System.out.println("Adding of 2 numbers "+(a+b));
	}
	
	
	public void add(int a, int b, int c) {
		System.out.println("Adding of 2 numbers "+(a+b+c));
	}
	
	//2. Types of arguments
   public void add(int a, float b) {
	   System.out.println("Adding of 2 numbers "+(a+b));
	}
   
   //3. Piston/order of arguments
   public void add(float a, int b) {
	   System.out.println("Adding of 2 numbers "+(a+b));
  	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog1 obj = new Prog1();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10, 12.0f);
		obj.add(20.2f, 10);
		
	}

}
