package day23;

public class Prog4 {

	public int a = 10;
	
	protected int b = 20;
	
	//default
	int c = 30;
	
	private int d = 40;
	
	
	public static void main(String[] args) {
		Prog4 obj = new Prog4();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
