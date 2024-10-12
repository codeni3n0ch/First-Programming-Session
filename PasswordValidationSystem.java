
/**
 *
 * @author Ferreria,Enoch Cuthbert A,
 */ Lab Challenge 7
 */ Password Validation System
 */
import java.util.Scanner;
public class PasswordValidationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                break; // Exit the loop if password is valid
            } else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }

        scanner.close();
    }

    private static boolean isValidPassword(String password) {
        // Check password length
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        // Check for uppercase letters and digits
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasDigit; // Password is valid if it has both
    }
}
