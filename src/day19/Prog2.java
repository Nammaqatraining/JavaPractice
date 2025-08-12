package day19;

public class Prog2 {

	//Constructor over loading 
	
	static int empId;
	
	public Prog2(int id) {
		// TODO Auto-generated constructor stub
		empId = id;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main starts");
		System.out.println("Employee id is "+empId);
		Prog2 obj = new Prog2(100);
		
		System.out.println("Employee id is "+empId);
		Prog2 obj1 = new Prog2(102);
		System.out.println("Employee id is "+empId);
		Prog2 obj2 = new Prog2(103);
		System.out.println("Employee id is "+empId);
		System.out.println("Main ends");
		
		
	}

}
