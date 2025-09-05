package day30;

public class Prog3 {

	/* public boolean equals(Object obj) {
		 return true;
	 }*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog3 obj1 = new Prog3();
		Prog3 obj2 = new Prog3();
		
		System.out.println(obj1.equals(obj2));
		
		Prog3 obj3 = obj2;
		System.out.println(obj2.equals(obj3));
		System.out.println(obj3.equals(obj2));
	}

}
