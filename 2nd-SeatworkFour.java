// The class must be declared as public and match the filename (PaymentProcessor.java)
public class PaymentProcessor {
	
	// Process payment with two arguments: amount and currency
	public void processPayment(double amount, String currency) {
		System.out.println("Processing payment of " + amount + " " + currency);
	}

	// Overloaded method with three arguments: amount, currency, and payment method
	public void processPayment(double amount, String currency, String paymentMethod) {
		System.out.println("Processing payment of " + amount + " " + currency + " via " + paymentMethod);
	}

	// Example usage
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();

		// Call the two-argument method
		processor.processPayment(49.99, "USD");

		// Call the three-argument overloaded method
		processor.processPayment(1299.00, "PHP", "Credit Card");
	}
}
