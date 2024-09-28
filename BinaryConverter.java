import java.util.Scanner; //Import Scanner class

public class Converter {
      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            // Ask for user input
         while (true) {
            System.out.print("Enter a decimal number or Enter 'STOP' to exit: ");
            String userInput = scanner.nextLine();
             // Convert decimal to binary
            try {
                int decimalNumber = Integer.parseInt(userInput);
                String binaryNumber = Integer.toBinaryString(decimalNumber);
                System.out.println("Decimal: " + decimalNumber + " = Binary: " + binaryNumber);
            } catch (NumberFormatException e) {
                 System.out.println("\t\tFinish");
                 System.out.println("\tProgram Terminate");
                return;
                   
         }
         
      }
   }
     
}
