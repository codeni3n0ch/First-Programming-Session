
/**
 *
 * @author Ferreria, Enoch Cuthbert A.
 * Lab Challenge 5
 * Restaurant Order System
 */
import java.util.Scanner;
public class RestaurantOrderSystem {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice; 
          int quantity;
          double  totalPrice = 0;
          
          //Food Menu list
        System.out.println("1. Burger \t- PHP 100");
        System.out.println("2. Fries  \t- PHP 50");
        System.out.println("3. Soda   \t- PHP 30");
        System.out.println("4. Ice Cream \t- PHP 45");
        System.out.println("5. EXIT");
       
        System.out.print("Enter the menu number of your choice (1-5): ");
       choice = scanner.nextInt();
            
        // Get user input for quantity
        System.out.print("Please enter the quantity: ");
        quantity = scanner.nextInt();
     
            
            switch (choice) {
                case 1:
                    totalPrice = 100 * quantity;
                    System.out.println("You ordered a Burger.");
                    break;
                case 2:
                    totalPrice = 50 * quantity;
                    System.out.println("You ordered a Fries.");
                    break;
                case 3:
                    totalPrice = 30 * quantity;
                    System.out.println("You ordered a Soda.");
                    break;
                case 4:
                    totalPrice = 45 * quantity;
                    System.out.println("You ordered a Ice cream.");
                    break;
                    default:
                    System.out.println("Thank you for visiting!.");
                    return; // Exit the program for invalid selection
        }

                    // Display the total bill
                    System.out.printf("Total amount for your order: PHP %.2f%n", totalPrice);
                    scanner.close();

       }
            
    }
        
