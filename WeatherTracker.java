
/**
 * @author Enoch Ferreria
 * Final Challenge No. 2
 * Weather Tracker
 */
import java.util.Scanner;
public class WeatherTracker {
    public static void main(String[] args) {
        final int NUM_CITIES = 3; // Number of cities
        final int NUM_DAYS = 7; // Number of days
        double[][] temperatures = new double[NUM_CITIES][NUM_DAYS]; // 2D array for temperature data
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Input temperature data for each city and day
        for (int i = 0; i < NUM_CITIES; i++) {
             System.out.println("--------------------------------------");
            for (int j = 0; j < NUM_DAYS; j++) {
             System.out.println("--------------------------------------");
                System.out.print("Enter temperature for City " + (i + 1) + " on Day " + (j + 1) + ": ");
                temperatures[i][j] = scanner.nextDouble(); // Read temperature
            }
        }

        // Calculate average temperature for each city
        for (int i = 0; i < NUM_CITIES; i++) {
            double sum = 0.0;
            for (int j = 0; j < NUM_DAYS; j++) {
                sum += temperatures[i][j]; // Sum up temperatures for the city
            }
            double average = sum / NUM_DAYS;
            System.out.printf("\nAverage temperature for City %d: %.2f%n", i + 1, average);
            System.out.println("____________________________________");
        }

        // Find the highest temperature recorded for each city
        for (int i = 0; i < NUM_CITIES; i++) {
            double highest = temperatures[i][0];
            for (int j = 1; j < NUM_DAYS; j++) {
                if (temperatures[i][j] > highest) {
                    highest = temperatures[i][j]; // Update highest temperature
                }
            }
            System.out.printf("\nHighest temperature for City %d: %.2f%n", i + 1, highest);
            System.out.println("_____________________________________");

        }

        scanner.close(); // Close the scanner to free resources
    }
}
