package day7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Please enter the marks:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        if (Integer.parseInt(num)>=35) {
            
            if (Integer.parseInt(num)>=35 && Integer.parseInt(num)<=60) {
                System.out.println("The candidate is having the  grade has third class");
            }
            if (Integer.parseInt(num)>=60 && Integer.parseInt(num)<=80) {
            	System.out.println("The candidate is having the  grade has second class");
            }
            if (Integer.parseInt(num)>=80 && Integer.parseInt(num)<=90) {
            	System.out.println("The candidate is having the  grade has First class");
            }
            if (Integer.parseInt(num)>=90 && Integer.parseInt(num)<=100)
            {
            	System.out.println("the candidate is having grade distinction");
            }
          
        }
         else 
         {
            System.out.println("The student is failed");
         }
                
	}

}
