package javaTraining;

import java.util.Scanner;

public class SumNumbersFromOneToN06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
 
        int number = console.nextInt();
 
        int sum = 0; 
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
