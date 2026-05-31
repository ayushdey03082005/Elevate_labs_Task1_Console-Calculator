import java.util.Scanner;

public class calculator {
    //addtion function 
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction function
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication function
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    //Divison function
    public static double divide(double num1, double num2) {
        // if conditon to handle zero in the divisor
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            // to handle not a number situations
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        boolean running = true;

        //while loop to continue running the calculator
        while (running) {
            
            System.out.println("\n=== Calculator ===");
            System.out.print("Enter the first number (or 'q' to quit): ");
            
            // condition if the value is q then exit the calculator
            if (!sc.hasNextDouble()) {
                System.out.println("Exiting...");
                break;
            }
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            operator = sc.next().charAt(0);
            
            double result;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                    break;

                case '-':
                    result = subtract(num1, num2);
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                    break;

                case '*':
                    result = multiply(num1, num2);
                    System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                    break;

                case '/':
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                    }
                    break;

                default:
                    System.out.println("Invalid operator. Please use +, -, *, /");
            }
        }

        sc.close();
    }
}