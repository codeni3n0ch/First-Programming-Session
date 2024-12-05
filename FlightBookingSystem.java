

/**
 *
 * @author Enoch Ferreria
 */
import java.util.Scanner;
// Custom Exception to handle the case when no seats are available
class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}
// Flight class to represent a flight and manage bookings
class Flight {
    private int availableSeats; // Number of available seats
    // Constructor to initialize the flight with available seats
    public Flight(int totalSeats) {
        this.availableSeats = totalSeats;
    }
    // Method to book a seat
    public void bookSeat() throws NoSeatsAvailableException {
        if (availableSeats > 0) {
            availableSeats--;  // Decrease available seats by 1
            System.out.println("Seat successfully booked. Seats remaining: " + availableSeats);
        } else {
            throw new NoSeatsAvailableException("Sorry, no seats are available on this flight.");
        }
    }
    // Method to check the number of available seats
    public int getAvailableSeats() {
        return availableSeats;
    }
}
// Main class to simulate the flight booking process
public class FlightBookingSystem {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Create a flight with 5 available seats
        Flight flight = new Flight(5);
        System.out.println("Welcome to the Flight Booking System!");
        while (true) {
            System.out.println("\n--- Flight Booking Menu ---");
            System.out.println("1. Book a Seat");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        flight.bookSeat(); // Attempt to book a seat
                    } catch (NoSeatsAvailableException e) {
                        // Handle the case when no seats are available
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    // Display the number of available seats
                    System.out.println("Available seats: " + flight.getAvailableSeats());
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Thank you for using the Flight Booking System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
