package day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prog7 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Admin\\eclipse-workspace-java\\JavaPractice\\src\\test.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String[] str = {"Dog","Cat","Lion"};
			
			for(int i=0;i<str.length;i++) {
				bw.write(str[i]);
				bw.newLine();
			}
			
			//bw.write(str);
			bw.close();

			System.out.println("Writting completed");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IOException();
		}
	}

}
