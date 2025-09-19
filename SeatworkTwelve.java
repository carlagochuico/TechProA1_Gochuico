import java.util.Scanner:
public class SeatworkTwelve {
SecondMonthlyExam.java
© SeatworkTwelve.java x
品
...
3
/ Method to display account balance
public static void checkBalance(int[] balances, int accountNumber) { 1 usage System.out-println("Your current balance is:* + balances [accountNumber]):
1
10
13
12
113
15
// Method to deposit money
public static void deposit(int[] balances, int accountNumber, int amount) { fusage
if (amount <= 0) 4
System.out.println("Invalid deposit amount. Try again.");
return; // skip invalid deposit
balances[accountNumber] += amount;
System.out-printin("Deposit successful! New balance: ™ + balances[accountNumber):
T
▶
17
18
19
20
21
22
23
24
Run
o untitled
If Method to withdraw money
public static void withdraw(int [] balances, int accountNumber, int amount) € 1 usage
if（amount <= d） f
System.out.println("Invalid withdrawal amount. Try again.");
return; // skip invalid withdrawal
11:12 AM
Carla Cassandra forwarded a message
import java.util.Scanner;

public class SeatworkTwelve {

    // Method to display account balance
    public static void checkBalance(int[] balances, int accountNumber) {
        System.out.println("Your current balance is: " + balances[accountNumber]);
    }

    // Method to deposit money
    public static void deposit(int[] balances, int accountNumber, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Try again.");
            return; // skip invalid deposit
        }
        balances[accountNumber] += amount;
        System.out.println("Deposit successful! New balance: " + balances[accountNumber]);
    }

    // Method to withdraw money
    public static void withdraw(int[] balances, int accountNumber, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Try again.");
            return; // skip invalid withdrawal
        }
        if (amount > balances[accountNumber]) {
            System.out.println("Insufficient funds! Transaction cancelled.");
            return;
        }
        balances[accountNumber] -= amount;
        System.out.println("Withdrawal successful! New balance: " + balances[accountNumber]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example: 3 accounts with initial balances
        int[] balances = {10000, 20000, 30000};

        System.out.println("=== Welcome to Simple Banking System ===");
        System.out.print("Enter account number (0, 1, or 2): ");
        int accountNumber = scanner.nextInt();

        // Validate account number
        if (accountNumber < 0 || accountNumber >= balances.length) {
            System.out.println("Invalid account number. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(balances, accountNumber);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = scanner.nextInt();
                    deposit(balances, accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(balances, accountNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue; // skip invalid menu input
            }

            if (choice == 4) {
                break; // exit the loop if user chooses 4
            }
        }
    }
}
