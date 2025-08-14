package day21;

public class Prog2 {

	int i;
	int j;
	static float k;
	
	{
		i = 10;
		j = 20;
		k = 3.0f;
	}
	
	public Prog2() {
		// TODO Auto-generated constructor stub
		System.out.println("Non static variables "+i +" "+j);
		System.out.println("static varaibles "+k);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog2 obj = new Prog2();
		
	}

}
