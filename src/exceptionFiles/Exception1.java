package exceptionFiles;

public class Exception1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by Zero");
			System.out.println(e.toString());
		}
		
		String [] subjects = {"Math", "Science", "Bio","History","Commerce"};
		
		for (int i=0; i<=subjects.length; i++) {
			try {
				System.out.println(subjects[i]);		
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : Array index out of Bound Exception");
			System.out.println(e.toString());
		}
			finally {
				System.out.println("No Error");
			}
		}
		
			System.out.println("Program is closing");
	}
	
	}
