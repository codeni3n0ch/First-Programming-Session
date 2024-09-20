import java.util.Scanner; //Import Scanner class
public class Converter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Decimal Number:");
        System.out.println("Type 'STOP' to Terminate the Program:");
        
         while (true) {
            System.out.print("Enter a decimal number (or 'STOP' to exit): ");
            String userInput = scanner.nextLine();
            
            try {
                int decimalNumber = Integer.parseInt(userInput);
                String binaryNumber = Integer.toBinaryString(decimalNumber);
                System.out.println("Decimal: " + decimalNumber + " => Binary: " + binaryNumber);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid decimal number.");
    }
         
}
}
    
}
