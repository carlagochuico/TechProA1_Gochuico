java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 5 items to buy:");

        int count = 0;
        while (count < 5) {
            String item = scanner.nextLine().trim();
            if (item.isEmpty()) {
                break;
            }
            shoppingList.add(item);
            count++;
        }

        System.out.println("\nYour shopping list:");
        if (!shoppingList.isEmpty()) {
            System.out.println(String.join(", ", shoppingList));
        } else {
            System.out.println("No items entered.");
        }

        System.out.println("\n You entered " + shoppingList.size() + " items.");

        System.out.print("\n Search for an item: ");
        String search = scanner.nextLine().trim();

        if (shoppingList.contains(search)) {
            System.out.println(search + " is in your shopping list.");
        } else {
            System.out.println(search + " is not in your shopping list.");
        }

        scanner.close();
    }
