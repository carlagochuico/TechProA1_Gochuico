abstract class BankAccount {
	private String accountNumber;
	private double balance;

	public static final String RESET = "\u001B[0m";
	public static final String BOLD = "\u001B[1m";
	public static final String GREEN = "\u001B[32m";
	public static final String BLUE = "\u001B[34m";
	public static final String RED = "\u001B[31m";
	public static final String BG_GRAY = "\u001B[47m\u001B[30m";

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public abstract void calculateInterest();

	public double getBalance() {
		return balance;
	}

	protected void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void displayInfo() {
		System.out.println(BG_GRAY + " ACCOUNT ID: " + accountNumber + " " + RESET);
		System.out.println(BLUE + "Current Balance: $" + balance + RESET);
	}
}

class SavingsAccount extends BankAccount {
	private double interestRate = 0.05;

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void calculateInterest() {
		double interest = getBalance() * interestRate;
		deposit(interest);
		System.out.println(GREEN + BOLD + "Savings Interest Added: $" + interest + RESET);
	}
}

class CheckingAccount extends BankAccount {
	private double fee = 2.50;

	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void calculateInterest() {
		System.out.println(RED + "Checking account do not earn interest. Processing fee: $" + fee + RESET);
	}
}

public class SeatworkFiveThird {
	public static void main(String[] args) {
		BankAccount mySavings = new SavingsAccount("GVGV-6767", 1000.00);
		BankAccount myChecking = new CheckingAccount("CHK-4452", 500.00);

		System.out.println("\n" + BankAccount.BOLD + "---- BANKING SYSTEM DASHBOARD ----" + BankAccount.RESET);

		mySavings.displayInfo();
		mySavings.calculateInterest();
		System.out.println("Updated Savings: $" + mySavings.getBalance());

		System.out.println("-------------------------------");

		myChecking.displayInfo();
		myChecking.calculateInterest();

		System.out.println(BankAccount.BOLD + "Transaction Complete." + BankAccount.RESET);
	}
}
