package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Please enter your online test status : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String examStatus  = br.readLine();
		if(examStatus.equals("Pass")) {
			System.out.println("Online test passed, pls wait for R1");
			System.out.println("Please enter your R1 interview status : ");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			String examStatus_r1  = br1.readLine();
			if(examStatus_r1.equals("Pass")) {
				System.out.println("R1 test passed, pls wait for R2");
				System.out.println("Please enter your R2 interview status : ");
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String examStatus_r2  = br1.readLine();
				if(examStatus_r2.equals("Pass")) {
					System.out.println("Your selected.... Congrats!!!!!!!");
				}
				else {
					System.out.println("R2 failed, no further rounds allowed");
				}
			}
			else {
				System.out.println("R1 failed, no further rounds allowed");
			}
		}
		else
		{
			System.out.println("Online test failed, no further rounds allowed");
		}
		
	}

}
