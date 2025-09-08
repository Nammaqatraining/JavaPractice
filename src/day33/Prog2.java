package day33;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb1 = new StringBuilder("India");
		StringBuilder sb2 = new StringBuilder("India");
		
		//sb1 = sb1.append("Russia");
		//System.out.println(sb1);
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1==sb2);
		
		System.out.println(sb1.compareTo(sb2));
		
		sb1 = sb1.append("-USA");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
	}

}
