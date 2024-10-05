import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the calculation:");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        double result = 0;
        double temp = 0;
        String operation = "";

        for (String part : parts) {
            if (part.contains("hexadecimal")) {
                String hexValue = part.replace("hexadecimal", "");
                temp = Integer.parseInt(hexValue, 16);
            } else if (part.contains("octal")) {
                String octalValue = part.replace("octal", "");
                temp = Integer.parseInt(octalValue, 8);
            } else if (part.contains("binary")) {
                String binaryValue = part.replace("binary", "");
                temp = Integer.parseInt(binaryValue, 2);
            } else if (part.equals("+")) {
                operation = "+";
            } else if (part.equals("-")) {
                operation = "-";
            } else if (part.contains("x")) {
                operation = "x";
            } else if (part.contains("/")) {
                operation = "/";
            } else {
                if (operation.equals("") || operation.equals("=")) {
                    result = temp;
                } else if (operation.equals("+")) {
                    result += temp;
                } else if (operation.equals("-")) {
                    result -= temp;
                } else if (operation.equals("x")) {
                    result *= temp;
                } else if (operation.equals("/")) {
                    result /= temp;
                }
                operation = "";
            }
        }

        System.out.println("The result is: " + result);
    }
}
