// Program Name: PrintNumbers

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int limit;

        // Taking input
        System.out.print("Enter the limit: ");
        limit = input.nextInt();

        // For loop to print numbers
        for (int i = 1; i <= limit; i++) {

            // Printing numbers
            System.out.println(i);

        }

    }
}
