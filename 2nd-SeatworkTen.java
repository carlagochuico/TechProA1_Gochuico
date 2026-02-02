public class Program {
    public static void main(String[] args) {
        try {
            int[] x = {1, 2};   // correct array syntax
            System.out.println(x[5]); // fixed println spelling
        } catch (ArithmeticException e) {
            System.out.println("Math Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        }
    }
}
