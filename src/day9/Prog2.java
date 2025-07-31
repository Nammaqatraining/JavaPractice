package day9;

public class Prog2 {

	
	
	final static double PI = 3.142; //constants
	int radius = 10;
	//static double area;
	double area;
	//double area = PI * radius * radius;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Area of a circle
		//area = PI*r*r
		
		Prog2 obj = new Prog2();
		
		obj.area = Prog1.PI * obj.radius * obj.radius; 
		
		System.out.println("Area of the circle is "+obj.area);
		
	}

}
