// Program Name: EvenOddCheck

import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean expression
        boolean isEven = number % 2 == 0;

        // Checking condition
        if (isEven) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

    }
}