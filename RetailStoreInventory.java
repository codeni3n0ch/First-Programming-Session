
/**
 *
 * @author Enoch Ferreria
 */
import java.util.Scanner;
public class RetailStoreInventory {
    public static void main(String[] args) {
        // Array to hold product names
        String[] products = {"Apples", "Bananas", "Oranges", "Milk", "Bread"};
        // Array to hold product quantities
        int[] stock = {50, 30, 20, 15, 10};

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\nRetail Store Inventory Management");
            System.out.println("1. Display Inventory");
            System.out.println("2. Update Stock");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display inventory
                    System.out.println("\nInventory:");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println(products[i] + " - Quantity: " + stock[i]);
                    }
                    break;

                case 2:
                    // Update stock
                    System.out.println("\nSelect a product to update:");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". " + products[i]);
                    }
                    System.out.print("Enter product number: ");
                    int productIndex = scanner.nextInt() - 1;

                    if (productIndex >= 0 && productIndex < products.length) {
                        System.out.print("Enter new stock quantity for " + products[productIndex] + ": ");
                        stock[productIndex] = scanner.nextInt();
                        System.out.println("Stock updated successfully!");
                    } else {
                        System.out.println("Invalid product selection!");
                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
