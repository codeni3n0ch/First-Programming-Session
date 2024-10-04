import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a decimal number (or 'STOP' to quit): ");
            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("STOP")) {
                break;
            }

            try {
                int decimal = Integer.parseInt(userInput);
                String binary = Integer.toBinaryString(decimal);
                String octal = Integer.toOctalString(decimal);
                String hexa = Integer.toHexString(decimal);

                // Separate the nibbles in the binary representation
                String binaryNibbles = "";
                for (int i = 0; i < binary.length(); i++) {
                    if ((i % 4) == 0 && i != 0) {
                        binaryNibbles = " " + binaryNibbles;
                    }
                    binaryNibbles = binary.charAt(i) + binaryNibbles;
                }

                System.out.println("Decimal: " + decimal);
                System.out.println("Binary: " + binaryNibbles);
                System.out.println("Octal: " + octal);
                System.out.println("Hexadecimal: " + hexa);
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a decimal number.");
            }
        }
    }
}
