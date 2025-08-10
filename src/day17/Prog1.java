package day17;

public class Prog1 {

	
	static int a = 100;
	
	
	static void method1() {
	
		System.out.println("Method1 of static type is called");
	}
	
   static void method2() {
		System.out.println("Method2 of static type is called");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method is called");
		System.out.println(Prog1.a);
		Prog1.method1();
		Prog1.method2();
	}

}
