package account;

public class StudentDataBase {

	public static void main(String[] args) {
		NewStudent newst = new NewStudent ("5840010", "TejasSalvi");
		newst.generateUserId(100000);
		newst.showCourses();
		newst.pay(50000);
		newst.setPhoneNumber("89897475412");
		newst.setCity("Indore");
		newst.setState("M.P.");
		System.out.println(newst.toString());
	}
}	
	 class NewStudent {
		private String name ;
		private String SSN;
		private String eMail ;
		private static int iD= 2030;    
		private String userId;  // staticId + random4digitNumber + last4 of SSN;
		private String phoneNumber;
		private String city;
		private String state;
		private double balance;
		
		public NewStudent(String SSN, String name) {
			this.SSN = SSN;
			this.name = name;
			iD++;
			
			eMail = name.toLowerCase() +"."+iD + "@sbi.com";
			System.out.println("Email Id created for Student is : " + eMail);
			
		}
		
		public void generateUserId (int initDepositBalance) {
			balance = initDepositBalance;
			int max = 9000;
			int min = 1000;
			int random = (int) (Math.random()*(max-min));
			userId = iD +""+ random + SSN.substring(3);
			System.out.println("User Id is : " +userId);
			enroll();
		}
		
		public void enroll() {
			System.out.println("User id has been generated ");
			System.out.println("The Balance you have credited is : " + balance);
			showCourses();
		}
		
		public void pay(double payAmount) {
			System.out.println("The amount you are paying is: " +payAmount);
			balance = balance - payAmount;
			checkBalance();
		}
		
		public void checkBalance() {
			System.out.println("Your Balance is : " + balance);
		}
	
		public void showCourses () {
			String [] courses = {"Engineering","Medical", "PHD","BCom","Diploma"};
			for (int i = 0; i<courses.length; i++) {
				
			System.out.println("Courses are : " + courses[i]);
			}
		}
		public void setPhoneNumber (String phoneNumber) {
			this.phoneNumber = phoneNumber;
			
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setCity (String city) {
			this.city = city;
		}
		
		public String getCity () {
			return city;
		}
		
		public void setState (String state) {
			this.state =state;
		}
		
		public String getState() {
			return state;
		}
		
		public String toString() {
			return "[ Student Name : " +name + "] \n[ City : " +city +"] \n[ State : " + state +"] \n[ UserID : " + userId +"]\n"
					+ "[ PhoneNumber :  " + phoneNumber +"]\n[ Email  : " + eMail + "]";
		}
		
	  }
	
