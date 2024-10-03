
/**
 *
 * @author Ferreria, Enoch Cuthbert A.
 */
import java.util.Scanner;
public class GroceryStoreDiscountCalcu {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        
            //Determine the discount for specific price
            System.out.print("Enter a total amount:");
            double totalAmount = scanner.nextDouble(), discount = 0, discountedPrice;
            if (totalAmount  <= 1000){
                discount = 0; //No Discount
            }else if (totalAmount >= 1000 && totalAmount <= 5000){
                discount = 0.05; //5% Discount
            }else if (totalAmount >=5001 && totalAmount <= 10000){
                discount = 0.10; //10% Discount
            }else {
                discount = 0.15; //15% Discount
            }   

             //Calculate Final Price 
             discountedPrice = totalAmount - (totalAmount * discount);

             //Display Results
            System.out.printf("Discount Applied: %.0f%%%n", discount * 100);
            System.out.printf("Final Price: PHP %.2f%n", discountedPrice);
            
            //Scanner close
            scanner.close();

        }

}
