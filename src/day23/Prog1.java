package day23;

public class Prog1 {

	
	
	
	//Encapsulation
	
	private double empSal;

	public Prog1(double empSal) {
		// TODO Auto-generated constructor stub
		this.empSal = empSal;
	}
	
	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog1 obj = new Prog1(1000);
		
		System.out.println("Current salary is "+obj.getEmpSal());
		
		obj.setEmpSal(2000);
		
		System.out.println("Current salary is "+obj.getEmpSal());
		
	}

}
