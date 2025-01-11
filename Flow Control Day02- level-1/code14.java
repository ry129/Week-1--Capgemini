import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the user entered a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the factorial using a while loop
            long factorial = 1; // Use long to handle large factorial values
            int i = 1;

            while (i <= number) {
                factorial *= i; // Multiply factorial by i
                i++;            // Increment i
            }

            // Output the factorial
            System.out.println("The factorial of " + number + " is " + factorial + ".");
        }
    }
}

			