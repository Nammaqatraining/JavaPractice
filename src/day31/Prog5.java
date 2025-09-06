package day31;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rv1 = new String("I love India");
		
		
		System.out.println(rv1.length());
		System.out.println("--------------");
		System.out.println(rv1.charAt(3));
		System.out.println(rv1.charAt(11));
		//System.out.println(rv1.charAt(12));
		System.out.println("--------------");
		
		System.out.println(rv1.indexOf('o'));
		System.out.println(rv1.indexOf('I'));
		System.out.println(rv1.indexOf('i'));
		System.out.println("--------------");
		
		System.out.println(rv1.toLowerCase());
		System.out.println(rv1.toUpperCase());
		
		System.out.println("--------------");
		

		System.out.println(rv1.startsWith("I l"));
		System.out.println(rv1.endsWith("aa"));
		
		System.out.println("--------------");
		
		System.out.println(rv1.contains("123"));
		System.out.println("--------------");
		
		System.out.println(rv1.substring(2, 4));
		System.out.println(rv1.substring(3, 12));
		
		System.out.println(rv1.substring(2));
		System.out.println("--------------");
		
		System.out.println(rv1.isEmpty());
	}

}
