
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input Numbers
        System.out.println("Enter first Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        System.out.println(" First  Number is:" + num1);
        System.out.println(" Second Number is:" +num2);
        
        //Formula
        int Sum = num1 + num2;
        System.out.println("The Sum of the number is:" + Sum);
        int dif = num1 - num2;
        System.out.println("The Difference is:" + dif);
        int pro = num1 * num2;
        System.out.println("The Product is:" + pro);
        int quo = num1 / num2;
        System.out.println("The Quotient is:" + quo);
        int rem = num1 / num2;
        System.out.println("The Remainder is:" + rem);
        
        
        
        
        
       
        
    }
   
}
