package day3;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 10;  //1010
		int b = 2;   //0010
		
		System.out.println(a<<b);
		
		//0000 1010
		//0010 1000 //32 +  8 = 40
 		//40
		

		
		System.out.println(a>>b);
		//0000 1010
		//0000 0010
		//2
	}

}
