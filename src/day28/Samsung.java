package day28;

public class Samsung implements TV{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Samsung has HD display");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Samsung has HD sound");
	}

	@Override
	public void remote() {
		// TODO Auto-generated method stub
		System.out.println("Samsung can provide wireless remote");
	}
	
	public void inBuiltStabilizer() {
		// TODO Auto-generated method stub
		System.out.println("Samsung can provide in Built Stabilizer");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung obj = new Samsung();
		obj.display();
		obj.sound();
		obj.remote();
		obj.inBuiltStabilizer();
		obj.androidUpdate();
		TV.security();
	}

	
}
