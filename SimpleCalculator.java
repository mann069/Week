 // Program Name: SimpleCalculator

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variables
        int choice;
        double num1, num2, result;

        // Taking inputs
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        // Menu
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        // Switch statement
        switch (choice) {

            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4:
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid Choice");

        }

    }
}

