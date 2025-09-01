package day26;

public class Prog2 extends Prog1{

	
	@Override
	void test1() {
		// TODO Auto-generated method stub
		System.out.println("This is a abstract method test1");
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		System.out.println("This is a abstract method test2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog2 obj = new Prog2();
		obj.test3();
		
		obj.test1();
		obj.test2();
		
	}


}
