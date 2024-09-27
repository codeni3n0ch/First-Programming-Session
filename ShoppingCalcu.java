import java.util.Scanner;

public class ShoppingCalcu {
    public static void main(String[] args) {

        //Declaration of variables
        int price1;
        int quantity1;
        int price2;
        int quantity2;
        int price3;
        int quantity3;
        int total1, total2, total3;
        double dRate;
        double discount;
        double discountCost = 0.00;
        double sTax = 0.00;
        double sTax1 = 0.00;
        double totalCost;

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
            System.out.print("Total price of item 3: " + price3*quantity3);

            //Subtotal of all three items
            int Subtotal = total1 + total2 + total3;
            System.out.println("\nSubtotal: " + "PHP " + Subtotal);

            //Discount
            dRate = 5/100.0;
            discount = Subtotal*dRate;
            discountCost = Subtotal-discount;
            System.out.println("Discount: " + "PHP " + discountCost);  
            
            //Sales tax
            sTax = 12/100.0;
            sTax1 = discountCost*sTax;
            System.out.println("Sales Tax: " + "PHP " + sTax1);

            //Final Total
            totalCost = discountCost + sTax1;
            System.out.println("Final Total: " + "PHP " + totalCost);

        }
    }
