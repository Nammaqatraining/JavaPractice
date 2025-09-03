package day28;

public interface TV {

	public abstract void display();
	
	void sound();
	
	void remote();
	
	static void security() {
		googleSecurity();
		System.out.println("This is a android security");
	}
	
	private static void googleSecurity() {
		System.out.println("This is a google security");
	}
	
	default void androidUpdate() {
		System.out.println("This is an android update");
	}
	
	/*public static void main(String args[]) {
		System.out.println("main function");
		googleSecurity();
		security();
	}*/
}
