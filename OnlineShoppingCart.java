
/**
 *
 * @author Enoch Ferreria
 * December 3,2024
 * Final Challenge 5
 */

import javax.swing.JOptionPane; // Import JOptionPane for user input and output

// Custom Exception Class for handling invalid quantity scenarios
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message); // Call the parent class constructor with the error message
    }
}

// Shopping Cart Class to manage available stock and adding products
class ShoppingCart {
    private int availableStock; // Variable to store the available stock

    // Constructor to initialize the shopping cart with available stock
    public ShoppingCart(int availableStock) {
        this.availableStock = availableStock; // Set the initial stock
    }

    // Method to add products to the cart
    public void addProduct(int quantity) throws InvalidQuantityException {
        // Check if the quantity is negative
        if (quantity < 0) {
            throw new InvalidQuantityException("Quantity cannot be negative."); // Throw exception for negative quantity
        }
        // Check if the quantity exceeds available stock
        if (quantity > availableStock) {
            throw new InvalidQuantityException("Quantity exceeds available stock."); // Throw exception for exceeding stock
        }
        // Deduct the quantity from available stock
        availableStock -= quantity;
        // Show a success message with the updated stock
        JOptionPane.showMessageDialog(null, String.format("Successfully added %d items to your cart. Remaining stock: %d", quantity, availableStock));
    }

    // Method to get the current available stock
    public int getAvailableStock() {
        return availableStock; // Return the available stock
    }
}

// Main Class to run the shopping cart application
public class OnlineShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10); // Initialize the shopping cart with 10 items in stock
        JOptionPane.showMessageDialog(null, "Welcome to the Online Shopping Cart!"); // Show welcome message

        // Get user input for the quantity of items to add
        String input = JOptionPane.showInputDialog("Enter the quantity of items to add to your cart:");
        
        try {
            int quantity = Integer.parseInt(input); // Convert the input string to an integer
            cart.addProduct(quantity); // Attempt to add the specified quantity to the cart
        } catch (NumberFormatException e) {
            // Handle case where input is not a valid integer
            JOptionPane.showMessageDialog(null, "Error: Please enter a valid number."); // Show error message
        } catch (InvalidQuantityException e) {
            // Handle custom exception for invalid quantity
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()); // Show error message with exception details
        }

        // Display the current available stock in a dialog box
        JOptionPane.showMessageDialog(null, String.format("Current available stock: %d", cart.getAvailableStock()));
    }
}
