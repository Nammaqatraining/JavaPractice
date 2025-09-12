package day37;

import java.util.Stack;

public class Prog2 {

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
		
		System.out.println(s1);//[Book1, Book2, Book3, Book4]
	
		
		System.out.println("Spl functions");
		
		System.out.println(s1.peek()); //Book4 //It will not remove the object from the stack
		
		System.out.println(s1);//[Book1, Book2, Book3, Book4]
		
		System.out.println(s1.pop()); ////Book4 //It will  remove the object from the stack
		
		System.out.println(s1);//[Book1, Book2, Book3]
		
		s1.push("Book5"); //internally calls the add functions
		System.out.println(s1);//[Book1, Book2, Book3, Book5]
		
		System.out.println(s1.search("Book3"));//2
		
		System.out.println(s1.indexOf("Book5"));//3
		
		System.out.println(s1.empty()); //false
		System.out.println(s1.isEmpty()); //false
		
	}

}
