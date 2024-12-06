——-ONLINE SHOP——- 
/*Salvador, Hazel Angela M.
Final Challenge No. 5: Exception Handling Laboratory Challenges
December 4, 2024*/

import java.util.Scanner; 

// Custom exception class for handling invalid product quantity
class InvalidQuantityException extends Exception {
    // Constructor that passes the message to the parent Exception class
    public InvalidQuantityException(String message) {
        super(message); // Pass the message to the superclass (Exception)
    }
}

public class ExpHandling {
    public static void main(String[] args) {
        // Available stock for the product (predefined)
        int aStock = 100; // declaration of initial stock of product
        
        // Price per unit of the product
        double pPerUnit = 25.50; // declaration of price per product
        
        // Scanner object to prompt user input
        Scanner scanner = new Scanner(System.in);

        // displays the available stock
        System.out.printf("Welcome to the Online Shop! The available stock is: %d units.\n", aStock);
        System.out.printf("Price per unit: $%.2f\n", pPerUnit);
        
        // Asking the user to enter the quantity they wish to buy
        System.out.print("Enter the quantity of products you wish to purchase: ");
        int quantity = scanner.nextInt();

        try {
            // Check if the quantity is negative or exceeds available stock
            if (quantity < 0) {
                // If the quantity is negative, throw an InvalidQuantityException
                throw new InvalidQuantityException("Invalid quantity! Quantity cannot be negative.");
            } else if (quantity > aStock) {
                // If the quantity exceeds the available stock, throw an InvalidQuantityException
                throw new InvalidQuantityException("Invalid quantity! Quantity exceeds available stock.");
            } else {
                // If the quantity is valid, calculate the total cost
                double tCost = pPerUnit * quantity;
                
                // Display the total cost of the purchase
                System.out.printf("Purchase successful! The total cost is: $%,.2f\n", tCost);
                 
                // Update available stock
                aStock -= quantity;
                System.out.printf("Remaining stock: %d units.\n", aStock);
            }
        } catch (InvalidQuantityException e) {
            // If an InvalidQuantityException is caught, print the error message
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}


——-BANKING——-
/* Salvador, Hazel Angela M.
December 4, 2024
Final Challenge No. 5: Exception Handling Laboratory Challenges*/

import java.util.Scanner;

// Custom exception class for handling insufficient funds during withdrawal
class InsufficientFundsException extends Exception {
    // Constructor that passes the message to the parent Exception class
    public InsufficientFundsException(String message) {
        super(message); // Pass the message to the superclass (Exception)
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Initial balance for the user (predefined)
        double balance = 5000000.00; // declares initial balance
        
        Scanner scanner = new Scanner(System.in);

        // Displaying the current balance with comma formatting for thousands
        System.out.printf("Welcome to the Bank! Your current balance is: $%,.2f\n", balance);
        
        // Asking the user to enter the amount they wish to withdraw
        System.out.print("Enter the amount you wish to withdraw: $");

        // Reading the withdrawal amount from the user
        double wAmount = scanner.nextDouble();

        try {
            // Check if withdrawal amount is greater than the current balance
            if (wAmount > balance) {
                // If so, throw an InsufficientFundsException with a relevant message
                throw new InsufficientFundsException("Insufficient funds! Cannot withdraw more than your balance.");
            } else {
                // If the withdrawal is successful, deduct the amount from the balance
                balance -= wAmount;
                
                // Display the new balance after the withdrawal (formatted with commas)
                System.out.printf("Withdrawal successful! Your new balance is: $%,.2f\n", balance);
            }
        } catch (InsufficientFundsException e) {
            // If an InsufficientFundsException is caught, print the error message
            System.out.println(e.getMessage());
        }

        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
