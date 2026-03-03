import java.util.Scanner;

// Program to convert Celsius to Fahrenheit

class TemperatureConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Conversion formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("The " + celsius +
                " celsius is " + fahrenheit + " fahrenheit");

        input.close();
    }
}