package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Please enter the month 1 to 12 :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int month = Integer.parseInt(num);
   
        String season = "";
        
        //12,1,2
        if(month == 12 || month == 1 || month ==2) {
        	season = "Winter";
        }
        else if (month == 3 || month == 4 || month ==5) {
        	season = "Spring";
        }
        else if (month == 6 || month == 7 || month ==8) {
        	season = "Summer";
        }
        else if (month == 9 || month == 10 || month ==11) {
        	season = "Autumn";
        }
        else {
        	System.out.println("Please enter the valid month");
        }
		System.out.println(season);
	}

}
