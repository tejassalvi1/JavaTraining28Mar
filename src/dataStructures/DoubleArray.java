package dataStructures;

public class DoubleArray {
	public static void main(String[] args) {
	
		// Double Array
		
		String users[][] = {{"Tejas", "Salvi","tejass@test.com","8845155454"},
				{"Vicky", "singh", "singh@test.com", "552233233211"},
				{"james","Bond","bond@test.com","585512200"}};
		
		// Get the size of the Array
		
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("The Users are : " + numOfUsers);
		System.out.println("The fields are : " + numOfFields);
		
	
		//Traverse the array
		
		for (int i =0; i<numOfUsers; i++) {
			for (int j=0; j<numOfFields;j++) {
				System.out.print(users[i][j] + " " );
			}
			System.out.println(" ");
		}
		
		//Traverse the array
		System.out.println(" ");
		for (int i=0;i<numOfUsers;i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String number = users[i][3];
			
			System.out.println(firstName+ " " +lastName + " " +email + " " +number);
			
		}
		
		// Using the For-Each
		System.out.println("\nUsing the For-Each \n");
		for (String [] user : users) {
			System.out.print("[");
		for	(String field : user) {
				System.out.print(field + " ");
			}
			System.out.println("]");
		}
 }
}
