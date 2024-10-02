/*
 *Ferreria,Enoch Cuthbert A.
 *CC2 1-B
 */
import java.util.Scanner;
public class ShoppingCalculator {
    public static void main(String[] args) {

        //Declaration of variables
        int price1,quantity1,price2,quantity2,price3,quantity3,total1, total2, total3;
     
        double dRate, discount,discountCost = 0.00,sTax = 0.00,sTax1 = 0.00,totalCost;

        //Scanner
        Scanner sc = new Scanner(System.in);
        
            //Item 1 price and quantity with calculated total amount
            System.out.print("Price of item 1: ");
            price1 = sc.nextInt();

            System.out.print("Quantity of item 1: ");
            quantity1 = sc.nextInt();

            total1 = price1*quantity1;
            System.out.print("Total price of item 1: " + total1);
            
            //Item 2 price and quantity with calculated total amount
            System.out.print("\nPrice of item 2: ");
            price2 = sc.nextInt();

            System.out.print("Quantity of item 2: ");
            quantity2 = sc.nextInt();

            total2 = price2*quantity2;
            System.out.print("Total price of item 2: " + total2);

            //Item 3 price and quantity with calculated total amount
            System.out.print("\nPrice of item 3: ");
            price3 = sc.nextInt();

            System.out.print("Quantity of item 3: ");
            quantity3 = sc.nextInt();
    
            total3 = price3*quantity3;
            System.out.println("Total price of item 3: " + price3*quantity3);
            
            System.out.println("==========================");

            //Subtotal of all three items
            double subTotal = total1 + total2 + total3;
            System.out.printf("\nSubtotal:" + " PHP " + "%.2f%n", subTotal);

            //Discount
            dRate = 5/100.0;
            discount = subTotal*dRate;
            discountCost = subTotal-discount;
            System.out.printf("Discount:" + " PHP " + "%.2f%n", discountCost);  
            
            //Sales tax
            sTax = 12/100.0;
            sTax1 = discountCost*sTax;
            System.out.printf("Sales Tax:" + " PHP " +  "%.2f%n", sTax1);

            //Final Total
            totalCost = discountCost + sTax1;
            System.out.printf("Final Total: " + " PHP " + "%.2f%n", totalCost);

        }
    }
