package day23;

public class Prog3 {

	private double balance;
	
	
	public Prog3(double balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}


	public void setBalance(double tbalance) {
		if(tbalance > 0) {
			balance = balance+tbalance;
			System.out.println("Added amount "+tbalance);
		}
		else {
			System.out.println("Invalid amount");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog3 obj = new Prog3(500);
		
		System.out.println("Current balance is "+obj.getBalance());
		
		obj.setBalance(10);
		System.out.println("Current balance is "+obj.getBalance());
	}

}
