import java.util.Scanner;

public class RadixConverter {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        //Ask user for the input
        while (true) {
            System.out.print("Enter the origin number system (2-16) or 'STOP' to exit: ");
            String baseInput = scanner.nextLine();
            if (baseInput.equalsIgnoreCase("STOP")) {
                break;
            }
            
            int base;
            try {
                base = Integer.parseInt(baseInput);
                if (base < 2 || base > 16) {
                    System.out.println("Please enter a valid base between 2 and 16. ");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. please enter a number between 2 and 16. ");
                continue;
            }
            
            System.out.print("Enter the number in base " + base + ": ");
            String numberInput = scanner.nextLine();
            
            //Convert the number from the specified base to decimal
            int decimalValue;
            try {
                decimalValue = Integer.parseInt(numberInput, base);
            }  catch (NumberFormatException e) {
                System.out.println("Invalid number for the specified base.");
                continue;
            }
            
            //Display conversions to base 2-16
            System.out.println("Conversion: ");
            for (int i = 2; i <= 16; i++) {
                System.out.println("Base" + i + ": " + Integer.toString(decimalValue, i).toUpperCase());
            }
            System.out.println();
        }
        
        scanner.close();
        System.out.println("Program terminated. ");
    }

}
