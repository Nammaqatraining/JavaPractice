package day21;

public class Prog5 {

	static float i;
	static int j;

	int k;
	
	static {
		System.out.println("This is an SIB");
		i = 10.30f;
		j = 20;
		
		System.out.println("Adding 2 numbers "+(i+j));
		System.out.println("Sub of 2 numbers "+(i-j));
		System.out.println("Mul of 2 numbers "+(i*j));
	}
	
	{
		System.out.println("This is an IIB");
		i = 20.30f;
		j = 30;
		
		System.out.println("Adding 2 numbers "+(i+j));
		System.out.println("Sub of 2 numbers "+(i-j));
		System.out.println("Mul of 2 numbers "+(i*j));
	}
	
	public Prog5(int i, int j) {
		// TODO Auto-generated constructor stub
		System.out.println("This is an Constructor over loading");
		System.out.println("Adding 2 numbers "+(i+j));
		System.out.println("Sub of 2 numbers "+(i-j));
		System.out.println("Mul of 2 numbers "+(i*j));
	}
	
	public Prog5(int k) {
		this.k = k;
		System.out.println(k);
		System.out.println(this.k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("This is an main method");
		Prog5 obj = new Prog5(10,20);
		Prog5 obj1 = new Prog5(10);
	}
}
