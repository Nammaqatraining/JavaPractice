package day20;

public class Admin  extends Developer{

	/*public void read(){
		System.out.println("Read code");
	}
	
	public void write() {
		System.out.println("Write code");
	}*/
	
	public void manage() {
		super.read();
		write();
		System.out.println("Manage code");
	}
	
	public void read() {
		System.out.println("Admin read function");
	}
	
	
}
