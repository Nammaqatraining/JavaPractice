package day18;

public class Prog5 {

	static boolean trouble(boolean i, boolean j) {
		if(i == true && j ==true)
		{
			return true;
		}
		else if(i == false && j ==false){
			return true;
		}
		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Result is "+Prog5.trouble(false, true)); //false
		System.out.println("Result is "+Prog5.trouble(false, false)); //true
		System.out.println("Result is "+Prog5.trouble(true, false)); //false
		System.out.println("Result is "+Prog5.trouble(true, true)); //true
	}

}
