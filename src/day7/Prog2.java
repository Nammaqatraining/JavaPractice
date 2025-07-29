package day7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Please enter the marks:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int marks = Integer.parseInt(num);
        
        if (marks>=35) {
            
            if (marks>=35 && marks<=60) {
                System.out.println("The candidate is having the  grade has third class");
            }
            else if (marks>=60 && marks<=80) {
            	System.out.println("The candidate is having the  grade has second class");
            }
            else if (marks>=80 && marks<=90) {
            	System.out.println("The candidate is having the  grade has First class");
            }
            else if (marks>=90 && marks<=100)
            {
            	System.out.println("the candidate is having grade distinction");
            }
            else {
            	System.out.println("Please enter the marks from 0 to 100");
            }
        }
         else 
         {
            System.out.println("The student is failed");
         }
                
	}

}
