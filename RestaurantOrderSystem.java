
/**
 *
 * @author Ferreria, Enoch Cuthbert A.
 * Restaurant Order System
 */
import java.util.Scanner;
public class RestaurantOrderSystem {
    public static void main (String[] args){
          Scanner scanner = new Scanner(System.in);
          int choice;
          double  totalPrice = 0;
          
          //Food Menu list
       System.out.println("1. Burger \t- 100");
       System.out.println("2. Fries  \t- 50");
       System.out.println("3. Soda   \t- 30");
       System.out.println("4. Ice Cream \t- 45");
       System.out.println("5. EXIT");
       
       System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    totalPrice += 100;
                    System.out.println("You ordered a Burger.");
                    break;
                case 2:
                    totalPrice += 50;
                    System.out.println("You ordered a Fries.");
                    break;
                case 3:
                    totalPrice += 30;
                    System.out.println("You ordered a Soda.");
                    break;
                case 4:
                    totalPrice += 45;
                    System.out.println("You ordered a Ice cream.");
                    break;
                case 5:
                    System.out.println("Thank you for visiting! Your total is: $" + String.format("%.2f", totalPrice));
                    break;
                 } while (choice != 5);

        // Print the total cost
        System.out.printf("Your total cost is: $%.2f%n", totalPrice);
        System.out.println("Thank you for your order!");

        scanner.close();
    
       }
            
    }
