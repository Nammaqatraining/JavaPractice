package day28;

public class Student {

	String name;
	int m1, m2, m3;
	
	
	public Student(String name, int m1, int m2, int m3) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	
	public void display() {
		System.out.println("Student name is "+name);
		System.out.println("Student m1 marks is "+m1);
		System.out.println("Student m2 marks is "+m2);
		System.out.println("Student m3 marks is "+m3);
	}
	
}
