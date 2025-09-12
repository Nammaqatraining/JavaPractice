package day37;

import java.util.Stack;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stack
		
		Stack<String> s1 = new Stack<String>();
		
		System.out.println(s1.size()); //0
		System.out.println(s1.capacity()); //10
		
		s1.add("Book1");
		s1.add("Book2");
		s1.add("Book3");
		s1.add("Book4");
		s1.add("Book1");
		s1.add("Book2");
		s1.add("Book3");
		s1.add("Book4");
		s1.add("Book1");
		s1.add("Book2");
		s1.add("Book3");
		s1.add("Book4");
		
		System.out.println(s1);
		System.out.println(s1.size()); //0
		System.out.println(s1.capacity()); //10
		
		
		System.out.println(s1.get(5));//Book2
		
	}

}
