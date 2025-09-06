package day31;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rv1 = new String("WaterMelon");
		String rv2 = "WeterMelon";
		String rv3 = "Water";
		String rv4 = "Melon";
		String rv5 = rv3+rv4;
		String rv6 = rv3 + "Melon";
		
		
		System.out.println(rv1 == rv2); //false
		System.out.println(rv1.hashCode());
		System.out.println(rv2.hashCode());
		System.out.println("-------------------------");
		
		
		System.out.println(rv2.hashCode());
		System.out.println(rv5.hashCode());
		
		System.out.println(rv2 == rv5); //false
		System.out.println(rv2.equals(rv5));
		System.out.println(rv1.equals(rv5)); //true
		System.out.println("-------------------------");
		
		System.out.println(rv1.hashCode());
		System.out.println(rv6.hashCode());
		System.out.println(rv1.equals(rv6)); //true
		System.out.println("-------------------------");
		
		System.out.println(rv3);
		System.out.println(rv4);
	}

}
