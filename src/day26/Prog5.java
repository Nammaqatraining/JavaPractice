package day26;

public class Prog5 extends Prog3{

	//Cat

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Cat can move");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Do can sound - meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog5 obj = new Prog5();
		obj.move();
		obj.sound();
		
		Prog4 obj1 = new Prog4();
		obj1.move();
		obj1.sound();
	}
}
