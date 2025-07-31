package day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog4 {

	//Parameters
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		Prog4 obj = new Prog4();
		obj.method1(10, "ABCD", 100); //Initialization
		//obj.method1(0, null, 0);
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter the student id:");
	    String studentId = br.readLine();
	    
		System.out.println("Enter the student Name:");
	    String studentName = br.readLine();
	    
		System.out.println("Enter the student Marks:");
	    String studentMarks= br.readLine();
	     
	    obj.method1(Integer.parseInt(studentId), studentName, Integer.parseInt(studentMarks));
	    
	}

	
	public void method1(int studentId, String studentName, int studentMarks) //Only declaration of local variables
	{
		
		
		System.out.println("Student Id is "+studentId); //Utilization
		System.out.println("Student name is "+studentName);
		System.out.println("Student marks is "+studentMarks);
	
	}
	
}
