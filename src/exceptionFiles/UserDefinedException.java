package exceptionFiles;

import java.util.Scanner;

public class UserDefinedException {
	//Take a payment from user
	public static void main(String[] args) {
		double amount = 0;
		boolean positivepymt = true;
		
		
		do 
		{
		// Ask the input from the user
		System.out.print("Enter the payment amount : ");
		
		// Get the amount from the user
		Scanner sc = new Scanner (System.in);
	
		
		try {
			amount = sc.nextDouble();
			System.out.println("Amount you entered is : " + amount);	
			
			if (amount < 0) {
				throw new NegativePaymentException(amount);
			}
			else {
				positivepymt = true;
			}
			
		}
			
		catch (NegativePaymentException e) {
			System.out.println(e.toString());
			System.out.println("Please try again ..");
			positivepymt = false;
		}
	}
		while (!positivepymt);
			
	
			System.out.println("Thanks for the Payment of Rs. "+amount);
			
	}
}