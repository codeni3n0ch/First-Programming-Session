import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hexInput = scanner.nextLine();
        
        // Input octal number
        System.out.print("Enter an octal number: ");
        String octalInput = scanner.nextLine();
        
        System.out.print("Enter an octal number: ");
          octalInput = scanner.nextLine();
        
        // Input binary number
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();
        
        System.out.print("Enter an octal number: ");
          octalInput = scanner.nextLine();
        
        // Convert inputs to decimal
        int decimalFromHex = Integer.parseInt(hexInput, 16);
        int decimalFromOctal = Integer.parseInt(octalInput, 8);
        int decimalFromBinary = Integer.parseInt(binaryInput, 2);

        // Calculate the sum in decimal
        int sumInDecimal = decimalFromHex - decimalFromOctal + decimalFromOctal * decimalFromBinary / decimalFromOctal;

        // Output the result
        System.out.println("Sum in decimal: " + sumInDecimal);

        // Close the scanner
        scanner.close();
    }
}
