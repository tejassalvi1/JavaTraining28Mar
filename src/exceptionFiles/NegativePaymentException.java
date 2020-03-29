package exceptionFiles;

public class NegativePaymentException extends Exception{
	
	double amount ;
	public NegativePaymentException(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return "Error : Cannot take Negative Payment " + amount;
	}
}
