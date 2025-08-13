package day20;

public class Prog2 extends Prog1{

	//child class
	
	double d = 100.56;
	
	public void test2() {
		System.out.println("running test 2 ");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog2 obj = new Prog2();
		System.out.println("Parent class variable "+obj.a);
		System.out.println("Child class variable "+obj.d);
		System.out.println("Parent class method");
		obj.test1();
		System.out.println("Child class method");
		obj.test2();
		
	}

}
