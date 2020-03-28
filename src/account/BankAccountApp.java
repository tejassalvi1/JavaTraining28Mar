package account;

public class BankAccountApp {
	
	public static void main(String[] args) {	
		BankAccount ac1 =  new BankAccount ("556662233" , 2000);
		BankAccount ac2 =  new BankAccount ("556662233", 1500);
		BankAccount ac3 =  new BankAccount ("556662233", 2500);
		
		ac1.setName("Tejas");
		System.out.println(ac1.getName());
		ac1.payBill(500);
		ac1.makeDeposit(1000);
		ac1.accurel();
		System.out.println(ac1.toString());
}	
}
	class BankAccount implements IInterest {
		private static int id =9000;           // internal ID (Unique) that's why Static
		private String accountNumber;    // id+ random 2-digit number + first 2 of SSN
		private String name;
		private String SSN;
		private static final String routingNumber = "8989"; // to not change i.e. fixed
		private double balance;
		
		public BankAccount(String SSN, int initDeposit) {
			balance = initDeposit;
			this.SSN = SSN;
			id++;
			System.out.println("Unique ID : " + id);
			setAccountNumber();
		}
		public void setAccountNumber () {
			int random = (int) (Math.random()*100) ;
			accountNumber = id + "" + random + SSN.substring(0, 2);
			System.out.println("Your Account Number = " + accountNumber);
			}
		
		public void setName(String name) {
			this.name = name;
		}
			
		public String getName() {
			return name;
		}
		
		public void payBill(int amount) {
			System.out.println("Paying bill of amount : " + amount);
			balance =  balance-amount;
			showBalance();
			}
		
		public void makeDeposit (int amount) {
			balance = balance+amount;
			System.out.println("Made Deposit of : " + amount + " Rupees");
			showBalance();
		}
		
		public void showBalance() {
			System.out.println("Balance : " +balance);
		}
		
		@Override
		public void accurel() {
			balance = balance*(1+rate/100);
			showBalance();
		}
		
		@Override
		public String toString () {
			return "[ Account Number : " + accountNumber + " ] \n[ Name : " + name + "] \n[ Balance : " + balance + "]" ;   
		}
	}
	