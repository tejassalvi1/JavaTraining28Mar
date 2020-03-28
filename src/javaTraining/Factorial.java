package javaTraining;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int i=1 , j;
	double	factorial=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ---");
		j= sc.nextInt();
		 
		for (i=1; i<=j; i++) {
			
			factorial = factorial*i;
		}
		
		System.out.println("Factorial of number " +j + " is : " + factorial);
		sc.close();
	}

}
