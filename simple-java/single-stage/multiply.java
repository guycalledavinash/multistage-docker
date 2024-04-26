import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first value
        System.out.print("Enter the first value: ");
        double value1 = scanner.nextDouble();

        // Prompt the user to enter the second value
        System.out.print("Enter the second value: ");
        double value2 = scanner.nextDouble();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Calculate the product of the two values
        double result = multiply(value1, value2);

        // Display the result
        System.out.println("The result of multiplying " + value1 + " and " + value2 + " is: " + result);
    }

    // Method to multiply two values
    public static double multiply(double a, double b) {
        return a * b;
    }
}
