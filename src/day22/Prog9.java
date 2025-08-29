package day22;

public class Prog9 extends Prog8{

	String dept;
	double salary;
	
	public Prog9(String empName, int age, String dept, double salary) {
		super(empName, age);
		// TODO Auto-generated constructor stub
		this.dept = dept;
		this.salary = salary;
	}
	
	public void display() {
		super.display();
		System.out.println("The dept is "+dept);
		System.out.println("The salary is "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prog9 obj = new Prog9("ABC", 30, "It", 1000);
		obj.display();
		Prog9 obj1 = new Prog9("CDE", 30, "Mechanics", 2000);
		obj1.display();

	}

}
