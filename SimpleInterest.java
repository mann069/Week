import java.util.Scanner;

// Program to calculate Simple Interest

class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time in years: ");
        double time = input.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = principal * rate * time / 100;

        // Display result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        input.close();
    }
}