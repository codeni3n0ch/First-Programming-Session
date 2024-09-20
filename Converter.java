import java.util.Scanner; //Import Scanner class
public class Converter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
         while (true) {
            System.out.print("Enter a decimal number or Enter 'STOP' to exit: ");
            String userInput = scanner.nextLine();
            
            try {
                int decimalNumber = Integer.parseInt(userInput);
                String binaryNumber = Integer.toBinaryString(decimalNumber);
                System.out.println("Decimal: " + decimalNumber + " => Binary: " + binaryNumber);
            } catch (NumberFormatException e) {
                 System.out.println("\t\t\tFinish");
                return;
                   
    }
         
}
}
    
}
