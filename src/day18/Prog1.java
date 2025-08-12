package day18;

public class Prog1 {

	
	//static functions with arguments
	
	public static void square(int num) {
		int sq = num * num;
		System.out.println("Square of a number is "+sq);
	 
	}
	 
	public static void square() {
		int j = 20;
		int sq = j * j;
		System.out.println("Square of a number is "+sq);
	}
	
	//non static function with arguments and with return type
	public int cube(int num) {
		int cu = num * num * num;
		//System.out.println("Cube of a number is "+cu);
		return cu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog1.square(2);
		Prog1.square();
		
		
		Prog1 obj = new Prog1();
		int cubOfNumber = obj.cube(3);
		System.out.println("Cube of a number is "+cubOfNumber);
	}

}
