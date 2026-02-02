import java.util.InputMismatchException;
import java.util.Scanner;

public class SW8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = {50, 100, 150};

		try {
			System.out.println("Available array values:");
			System.out.println("Index 0 = 50");
			System.out.println("Index 1 = 100");
			System.out.println("Index 2 = 150");

			System.out.print("\nEnter array index (0-2): ");
			int index = sc.nextInt();

			System.out.print("Enter divisor: ");
			int divisor = sc.nextInt();

			int result = data[index] / divisor;
			System.out.println("\nResult: " + result);

		} catch (InputMismatchException e) {
			System.out.println("\nError: Invalid input. Please enter whole numbers only.");
		} catch (ArithmeticException e) {
			System.out.println("\nError: Division by zero is not allowed.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nError: Invalid index. Please choose between 0 and 2.");
		} catch (Exception e) {
			System.out.println("\nError: Something went wrong. Please try again.");
		} finally {
			System.out.println("\nProgram execution completed.");
			sc.close();
		}
	}
}
