import java.util.Scanner;

public class NumberAnalysis {

    // Method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // both are equal
        } else {
            return -1; // number1 is less
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to analyze numbers
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare the first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of the first and last numbers: ");
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first and last numbers are equal.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
