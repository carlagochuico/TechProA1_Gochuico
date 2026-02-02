public class Program
{
	public static void main(String[] args) {
		
		int number1 = 20;
		int number2 = 0;
		
		try {
			int result = number1/ number2;
			System.out.println("Result: " + result);
		}catch (ArithmeticException e) {
			System.out.println("Built-in Exception: Cannot divide by zero");
		}
		System.out.println("Program continue running...");
	}
}
