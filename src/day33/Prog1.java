package day33;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer("India");
		StringBuffer sb2 = new StringBuffer("India");
		
		//sb1 = sb1.append("Russia");
		//System.out.println(sb1);
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1==sb2);
		
		System.out.println(sb1.compareTo(sb2));
		
		sb1 = sb1.append("-USA");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		
		sb2.insert(0, "China-");
		System.out.println(sb2);
		
		sb2.delete(0, 5);
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
		System.out.println(sb2.capacity());
		
		sb2.ensureCapacity(100);
		System.out.println(sb2.capacity());
	}

}
