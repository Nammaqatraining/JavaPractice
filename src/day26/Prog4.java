package day26;

public class Prog4 extends Prog3{

	//Dog
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog can move");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Do can sound - bow");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog4 obj = new Prog4();
		obj.move();
		obj.sound();
	}


}
