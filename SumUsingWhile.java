// Program Name: SumUsingWhile

import java.util.Scanner;

public class SumUsingWhile {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;
        int i = 1;
        int sum = 0;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // While loop to calculate sum
        while (i <= number) {

            sum = sum + i;
            i++;

        }

        // Display result
        System.out.println("Sum is: " + sum);

    }
}

