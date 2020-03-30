package dataStructures;

public class Arrays {
	public static void main(String[] args) {
		String [] alphabet = {"a","b", "c", "d","e"};
		
		 System.out.println("The old Fashioned way : ");
		for (int i=0; i<5;i++) {
			System.out.print(alphabet[i]  + " ");
		}
		
		System.out.println("\n\nUsing the length variable");
		for (int n=0; n<alphabet.length;n++) {
			System.out.print(alphabet[n] +" ");
		}
	
		System.out.println("\n\nUsing For-each method");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
	}
}
