package day19;

public class Prog4 {

	public Prog4() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
	}
	
	public Prog4(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with int parameter" + i);
	}
	
	public Prog4(Boolean i) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with boolean parameter" + i);
	}
	public Prog4(double i) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with double parameter" + i);
	}
	
	public Prog4(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with string parameter" + s);
	}
	
	public Prog4(float f) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with float parameter " + f);
	}
	
	public Prog4(float f, int i ) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with float with int parameter" + f + i);
	}
	

	public Prog4(String s1, String s2) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor with String, String parameter" + s1 + s2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog4 obj = new Prog4();
		Prog4 obj1 = new Prog4("India");
		Prog4 obj2 = new Prog4("India", "USA");
		Prog4 obj3 = new Prog4(10.5f);
		Prog4 obj4 = new Prog4(true);
	}

}
