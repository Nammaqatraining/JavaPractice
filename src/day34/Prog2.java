package day34;

public class Prog2 extends Prog1{

	
	void test1() {
		System.out.println("This is a child class method 1");
	}
	
	void test2() {
		System.out.println("This is a child class method 2");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog2 obj = new Prog2();
		obj.test1();
		obj.test2();
		obj.test4();

		//upcasting
		Prog1 obj1 = new Prog2();
		obj1.test1(); //parent class methods will be accessable only
		
		//Downcasting
		Prog1 obj2 = new Prog2();
		Prog2 obj3 = (Prog2) obj2;
		obj3.test1();
		obj3.test2();
		obj3.test4();
		
	}

}
