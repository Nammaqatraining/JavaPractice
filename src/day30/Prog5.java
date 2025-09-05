package day30;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog5 obj1 = new Prog5();
		Prog5 obj2 = new Prog5();
		
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		Prog5 obj3 = obj2;
		System.out.println(obj3.hashCode());
	}

}
