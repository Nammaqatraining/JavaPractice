package day23;

public class Prog2 {

	
	private int a;
	private double b;
	

	public Prog2(int a, double b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog2 obj = new Prog2(10, 10.5);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
		obj.setA(20);
		obj.setB(20.5);
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
	}

}
