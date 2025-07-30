package day8;

public class Prog6 {

	//Instance variables
	
	private int i; //default value = 0
	private boolean j; //default value = false
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog6 obj = new Prog6();  //obj - instance/reference variable
		System.out.println(obj.i);
		System.out.println(obj.j);
		obj.method1();
		
	}
	
	
	public void method1() {
		
		Prog6 obj = new Prog6();  //obj - instance/reference variable
		System.out.println(obj.i);
		System.out.println(obj.j);
	}


}
