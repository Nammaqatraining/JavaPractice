package day22;

public class Prog7 extends Prog6 {

	public void test1() {
		super.test1();
		System.out.println("Sub class implementation");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog7 obj = new Prog7();
		obj.test1();
		
	}

}
