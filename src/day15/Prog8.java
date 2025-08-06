package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prog8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("src/test.txt");

		try {
			
			
			FileReader fw = new FileReader(file);
			BufferedReader bw = new BufferedReader(fw);
			
			String s = bw.readLine();
			{
				while(s!=null) {
					System.out.println(s);
					s = bw.readLine();
				}
			}
			
		
			bw.close();

			System.out.println("Reading completed");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IOException();
		}
	}

}
