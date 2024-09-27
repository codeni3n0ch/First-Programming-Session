import java.util.Scanner;

 public class RadixConverter {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the origin number system (2-16) or 'STOP to exit:");
            String baseInput = scanner.nextLine();
            if (baseInput.equalsIgnoreCase("STOP")) {
                break;
            }
            
            int base;
            try {
                base = Integer.parseInt(baseInput);
                if (base < 2 || base > 16) {
                System.out.println("Please enter a number betwenn 2 and 16 ");
                continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 2 and 16 ");
                continue;
            }
            
            System.out.print("Enter the Number in Base " + base + ": ");
            String numberInput = scanner.nextLine();
            
            //Convert the number from the specified Base to Decimal 
            int decimalValue;
            try {
            decimalValue = Integer.parseInt(numberInput,base);
            }
             catch (NumberFormatException e) {
                System.out.println("Invalid input Please Enter a number between 2 and 16 ");
                continue;
            }
            
            System.out.print("Enter the Number in base " + base + ": ");
            String numberInput = scanner.nextLine();
            
            //Convert number from specified base to decimal
            /*int decimalValue;*/
            try {
                decimalValue = Integer.parseInt(numberInput, base);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number for the specified base.");
                continue;
            }
            
            //Display conversions to bases 2-16
            System.out.println("Conversions:");
            for (int i = 2; i <=16; i++) {
                System.out.println("Base " + i + "; " + Integer.toString(decimalValue. i).toUpperCase());
            }
            System.out.println();
          }
        scanner.close();
        System.out.println("Program Terminated.");
    }
    
 }
