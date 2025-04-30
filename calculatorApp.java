// CalculatorApp.java
// A console-based calculator using variables, data types, and the 'this' keyword as per the instructions.
// This Calculator is going to peform actions from the terminal window after you run it.

import java.util.Scanner;

public class calculatorApp {
    // Fields to store results
    int intResult;
    double doubleResult;

    // Method for integer addition
    public void add(int a, int b) {
        this.intResult = a + b;
        System.out.println("Addition (int): " + this.intResult);
    }

    // Method for double subtraction
    public void subtract(double a, double b) {
        this.doubleResult = a - b;
        System.out.println("Subtraction (double): " + this.doubleResult);
    }

    // Method for integer multiplication
    public void multiply(int a, int b) {
        this.intResult = a * b;
        System.out.println("Multiplication (int): " + this.intResult);
    }

    // Method for double division
    public void divide(double a, double b) {
        if (b != 0) {
            this.doubleResult = a / b;
            System.out.println("Division (double): " + this.doubleResult);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    // Main method – entry point
    public static void main(String[] args) {
        calculatorApp calc = new calculatorApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add (int)");
            System.out.println("2. Subtract (double)");
            System.out.println("3. Multiply (int)");
            System.out.println("4. Divide (double)");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first int: ");
                    int a1 = scanner.nextInt();
                    System.out.print("Enter second int: ");
                    int b1 = scanner.nextInt();
                    calc.add(a1, b1);
                    break;

                case 2:
                    System.out.print("Enter first double: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Enter second double: ");
                    double b2 = scanner.nextDouble();
                    calc.subtract(a2, b2);
                    break;

                case 3:
                    System.out.print("Enter first int: ");
                    int a3 = scanner.nextInt();
                    System.out.print("Enter second int: ");
                    int b3 = scanner.nextInt();
                    calc.multiply(a3, b3);
                    break;

                case 4:
                    System.out.print("Enter first double: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Enter second double: ");
                    double b4 = scanner.nextDouble();
                    calc.divide(a4, b4);
                    break;

                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        }

        scanner.close();
    }
}

// please provide feedback as to where i can improve the code to make the calculator better.
//Scott.
