// Program Name: VotingEligibility

import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variables
        int age;
        boolean isCitizen;

        // Taking input
        System.out.print("Enter age: ");
        age = input.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        isCitizen = input.nextBoolean();

        // Logical condition
        boolean canVote = age >= 18 && isCitizen;

        // Checking eligibility
        if (canVote) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }
}
}

