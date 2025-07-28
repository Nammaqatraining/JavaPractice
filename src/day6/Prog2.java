package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//int marks = 34;
		System.out.println("Please enter your marks : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String marks  = br.readLine();
		
		if(Integer.parseInt(marks) >= 35) {
			System.out.println("PASS");
			
		}
		else {
			System.out.println("FAIL");
		}
		
	}

}
