package day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prog6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Admin\\eclipse-workspace-java\\JavaPractice\\src\\test.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String s1 = "India";
			
			bw.write(s1);
			bw.close();

			System.out.println("Writting completed");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 
			throw new IOException();
		}
	}

}
