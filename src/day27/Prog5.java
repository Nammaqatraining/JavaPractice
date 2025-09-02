package day27;

public  class Prog5 implements Interface1, Interface2{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("This is test1");
	}


	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("This is test2");
	}
	
	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("This is test3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog5 obj = new Prog5();
		obj.test1();
		obj.test2();
		obj.test3();
	}

	
	

	

}
