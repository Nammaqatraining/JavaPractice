package day28;

public class Sony implements TV{

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sony has UHD display");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Sony has dolby sound");
	}

	@Override
	public void remote() {
		// TODO Auto-generated method stub
		System.out.println("Sony can provide wireless remote");
	}
	
	public void extraWoffer() {
		// TODO Auto-generated method stub
		System.out.println("Sony can provide extraWoffer");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sony obj = new Sony();
		
		obj.display();
		obj.sound();
		obj.remote();
		obj.extraWoffer();
		obj.androidUpdate();
		TV.security();
	
		
	}

}
