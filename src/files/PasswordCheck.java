package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCheck {
	public static void main(String[] args) {
		
		String fileName = "E:\\Junior Java\\Files\\PassWord.txt";
		File file = new File(fileName);
		String [] password = new String [6];
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			for (int i=0;i<password.length;i++) {
				password[i] = br.readLine();
			}
			//br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found at :" + fileName);
		
		} catch (IOException e) {
			System.out.println("Error: Could not read the file at :" + fileName);
		}
		//Testing the criteria
		for(String passwords :password) {
			System.out.println(passwords);
			
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;
			
			
			
			for(int n=0; n<password.length;n++) {
				// Contain a number
				if("0123456789".contains(passwords.substring(n,n+1))) {
					hasNumber =true;
					//System.out.println("Position " +n +" Contains a number");
				}
				// Contains a Letter
				else if("abcdefghijklmnopqrstuvwxyz".contains(passwords.substring(n,n+1).toLowerCase())) {
					hasLetter = true;
					//System.out.println("Position " +n + "Contains a letter");
				}
				// Contains a Special character
				else if("!@#$%^&*()_+{}:;'".contains(passwords.substring(n, n+1))) {
					hasSpecialChar = true;
					//System.out.println("Position " +n + "Contains a Special Character");				
			}
			else {
				try {throw new InvalidCharException(passwords.substring(n, n+1));			
				} catch (InvalidCharException e) { e.toString();}
				}
			}
			
		//	Test & Exception Handling
			try {
				if(!hasNumber) {throw new NumberCriteriaException(passwords);}
				else if(!hasLetter) {throw new LetterCriteriaException(passwords);}
				else if(!hasSpecialChar) {throw new SpecialCharCriteriaException(passwords);}
			else {System.out.println("Valid Password");}}
				catch(NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
					System.out.println("Invalid Password");
					System.out.println(e.toString());
				}
			}
		 
	}
}


class InvalidCharException extends Exception {
	
	String pwd;
	InvalidCharException(String pwd) {
		this.pwd = pwd;
	}
	
	public String toString() {
		return "InvalidCharException : " + pwd;
	}
}

class NumberCriteriaException extends Exception {
	String pwd;
	NumberCriteriaException (String pwd) {
		this.pwd = pwd;
	}
	public String toString() {
		return "NumberCriteriaException : " + pwd;
	}
}

class LetterCriteriaException extends Exception {
	String pwd;
	LetterCriteriaException (String pwd) {
		this.pwd = pwd;
	}
	public String toString() {
		return "LetterCriteriaException : " + pwd;
	}
}
class SpecialCharCriteriaException extends Exception {
	String pwd;
	SpecialCharCriteriaException (String pwd) {
		this.pwd = pwd;
	}
	public String toString() {
		return "SpecialCharCriteriaException : " + pwd;
	}
}	