import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.println("Do you want to perform another calculation? (yes/no)");
            String continueCalc = scanner.next();
            if (!continueCalc.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}

