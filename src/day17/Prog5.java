package day17;

public class Prog5 {

	static int minBalnce = 100;
	int balance; //non static variable
	void getBalance() {
		System.out.println("Balance availabe is "+(balance+minBalnce));
	}
	
	void deposit(int amount) {
	   balance = balance+amount;
	}
	
	void withdraw(int wAmount) {
		if(wAmount<balance) {
			balance = balance-wAmount;
		}
		else {
			System.out.println("Insufficiant balance");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welocome to ABC bank");
		Prog5 obj = new Prog5();
		obj.getBalance();
		System.out.println("Deposit some money into the account");
		obj.deposit(1000);
		obj.getBalance();
		System.out.println("Withdraw some money from the account");
		obj.withdraw(50099);
		obj.getBalance();
	}

}
