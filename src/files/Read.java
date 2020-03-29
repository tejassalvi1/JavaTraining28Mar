package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main(String[] args) {
		//1. Define the file (path) that we want to read 
		
		String fileName = "E:\\Junior Java\\Files\\FileToRead.tst";
		String text = null;

		//2.  Create a file in Java
		
		File file = new File(fileName);
		
		//3. Open the file
		
		try {
		BufferedReader	br = new BufferedReader(new FileReader(file));
			
			// 4. Read the file
			 text = br.readLine();
			 
			 // 5. Close the Resources
			 br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found" +fileName);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read the files Data" +fileName);
			e.printStackTrace();
		}
			finally {
				System.out.println("Finished the reading ....");
			}
				System.out.println(text);
		
	}

}
   