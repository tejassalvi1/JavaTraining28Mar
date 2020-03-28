package javaTraining;

public class Addition1 {
	
	public static int sum(int number) {
	    int sum=0;
	    for (int i = 1; i <= number; i++) {
	    	System.out.print(sum + " + " + i);
	        sum=sum + i;
	        System.out.println("=" + sum);
	    }
	    return sum;
	}  
	public static void main(String[] args) {
	
		System.out.println(sum(5));
	}

}
