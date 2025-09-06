package day30;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rv1 = new String("hello");
		System.out.println(rv1);
		
		String rv2 = new String("hello");
		System.out.println(rv2);
		
		System.out.println(rv1.hashCode());
		System.out.println(rv2.hashCode());
		
		
		String rv3 = "Water";
		String rv4 = "Water";
		
		System.out.println(rv3.hashCode());
		System.out.println(rv4.hashCode());
	}

}
