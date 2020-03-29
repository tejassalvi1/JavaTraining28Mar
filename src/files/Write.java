package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void main(String[] args) {
		 //1. Define the path that we want to write
		String fileName = "E:\\Junior Java\\Files\\FilesToWrite1.txt";
		String msg= "Writing data to the file";
		
		//2. Create the file in Java
		File file = new File(fileName);
		
		//3. Open the File Writer
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			//4. Write to the file
			fw.write(msg);
			
			//5. Close the resources
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Error : could not write file : " + fileName);
			e.printStackTrace();
		}
		finally {
			System.out.println("Closing the filewriter ");
		}
	
	}
}