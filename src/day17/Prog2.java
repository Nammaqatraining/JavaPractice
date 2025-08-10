package day17;

public class Prog2 {

	
	int a = 100;
	
	
	public void method1() {
	
		System.out.println("Method1 of static type is called");
	}
	
   public void method2() {
		System.out.println("Method2 of static type is called");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method is called");
		Prog2 obj1 = new Prog2();
		System.out.println(obj1.a);
		obj1.method1();
		obj1.method2();
		
		Prog2 obj2 = new Prog2();
		System.out.println(obj1.a);
		obj2.method1();
		obj2.method2();
		
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
