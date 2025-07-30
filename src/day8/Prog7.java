package day8;

public class Prog7 {

	//class variables
	
	static int i; //default value = 0  //public/private/protected/static/default
	static boolean j; //default value = false
	final static double PI = 3.142; //constants
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Prog7.i);
		System.out.println(Prog7.j);
		System.out.println(Prog7.PI);
		
		//Prog7.method1();
		
		Prog7 obj = new Prog7();  //obj - instance/reference variable
	    obj.method1();
		
	}
	
	
	public  void method1() {
		
        System.out.println(Prog7.i);
	}


}
