package day22;

public class Prog2 {

	static void area(int side) {
		int area = side * side;
		System.out.println("Area of the square is "+area);
	}
	
	
	static void area(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of the rectangle is "+area);
		}
	
	static void area(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of the circle is "+area);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog2.area(2);
		Prog2.area(2,3);
		area(3.0);
	}

}
