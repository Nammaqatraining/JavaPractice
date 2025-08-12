package day19;

public class Prog3 {

	double radius;
	
	public Prog3(double radius) {
		// TODO Auto-generated constructor stub
		double area = 3.14 * radius * radius;
		System.out.println("Area of a circle is "+area);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog3 obj = new Prog3(2.3);
		Prog3 obj1 = new Prog3(3.3);
	}

}
