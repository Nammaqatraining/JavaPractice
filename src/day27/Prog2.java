package day27;

public class Prog2 extends Prog1{

	@Override
	public void test() {
		System.out.println("This is a child class method");
	}
	
	
	public void test1() {
		System.out.println("This is a child class method1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog2 obj = new Prog2();
		obj.test();
		obj.test1();
	}

}
