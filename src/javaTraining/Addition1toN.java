package javaTraining;

public class Addition1toN {
	
	public static int addition (int n) {
		int result = 0;
		
		for (int x =1 ; x<=n; x++) {
			result += sumOfDigits(x);
			System.out.println(result);
					
		}
		return result;
		
	}
	static int sumOfDigits(int x) 
    { 
        int sum = 0; 
        while (x != 0) 
        { 
            sum += x % 10; 
            x   = x / 10; 
        } 
        return sum; 
    } 
	public static void main(String[] args) {
		//Addition1toN add = new Addition1toN();
		//Addition1toN.addition(5);
		System.out.println(addition(10));
		
	}
}
