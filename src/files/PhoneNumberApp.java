package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {
	public static void main(String[] args) {
		//This will read a phone number from the file and retrieve it.
		
		
		String fileName = "E:\\Junior Java\\Files\\PhoneNumber.txt";
		File file = new File(fileName);
		String[] phoneNums =  new String[6];
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
		for (int i=0 ; i<phoneNums.length; i++) {
		
			 phoneNums [i] = br.readLine(); 
			 }
			br.close();
		} 
			catch (FileNotFoundException e) {
			System.out.println("Error: File not found");
		} 
			catch (IOException e) {
			System.out.println("Error : Could not read the file");
		}
		//Valid phone number 
	 	//10 Digits long
		//Area code cannot start with 0 or 9;
		// There can't be 911 in the phone
		for (int i =0 ;i<phoneNums.length;i++) {
			phoneNum = phoneNums[i];
		try {
			if (phoneNum.length() !=10) {
		throw new TenDigitException (phoneNum) ;
		}
			if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
				throw new AreaCodeException (phoneNum);
			}
			for (int n = 0; n<phoneNum.length()-2;n++) {
				if (phoneNum.substring(n, n+1).equals("9")) {
					if(phoneNum.substring(n+1,n+3).equals("11")) {
						throw new EmergencyCodeException(phoneNum);
					}
				}
			}
			System.out.println(phoneNum);
	} 
		
		catch(TenDigitException e) {
		System.out.println("Error: Number is not 10 digits ");
		System.out.println(e.toString());
	}
		catch(AreaCodeException e) {
			System.out.println("Error : Number contains 0 or 9 in the start ");
			System.out.println(e.toString());
		}
		catch(EmergencyCodeException e) {
			System.out.println("Error : Emergency code 911 found");
			System.out.println(e.toString());
		}
	
	} 
} }

class TenDigitException extends Exception {
	String num;
	TenDigitException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("TenDigit Exception : " +num);
	}
}

class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("AreacodeException : " +num);
	}
}

class EmergencyCodeException extends Exception {
	String num;
	EmergencyCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("EmergencyCodeException 911 found : " +num);
	}
}
