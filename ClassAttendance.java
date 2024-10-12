
/**
 *
 * @author Ferreria, Enoch Cuthbert A.
 * //Lab Challenge 6
 * //Class Attendance
 */
import java.util.Scanner;
public class ClassAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Input the total number of students
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        int presentCount = 0; // Counter for present students
        int absentCount = 0;  // Counter for absent students
        
        // Step 2: Loop through each student to check attendance
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            char attendance = scanner.nextLine().charAt(0);
            
            // Step 3: Count presence and absence
            if (attendance == 'Y' || attendance == 'y') {
                presentCount++;
            } else if (attendance == 'N' || attendance == 'n') {
                absentCount++;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                i--; // Decrement to repeat this student's attendance input
            }
        }
        
        // Step 4: Display the final counts
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);
        
        scanner.close(); // Close the scanner
    }
}

