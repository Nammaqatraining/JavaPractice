package day27;

public class Prog4 {

	
	public void audioCall() {
		System.out.println("We can make audio call");
	}
	
	@Deprecated
	public void videoCall() {
		System.out.println("We can make video call");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog4 obj = new Prog4();
		obj.audioCall();
		obj.videoCall();
	}

}
