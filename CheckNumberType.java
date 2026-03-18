// Program Name: CheckNumberType

import java.util.Scanner;

public class CheckNumberType {

    public static void main(String[] args) {

        // Creating scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declaring variable for number
        int number;

        // Taking input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Checking number type using if else if and else
        if (number > 0) {
            System.out.println("The number is Positive");
        }
        else if (number < 0) {
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }

    }
}