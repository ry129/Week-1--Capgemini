import java.util.Scanner;

 class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers
        if (number < 0) {
            number = Math.abs(number); // Convert to positive
        }

        // Array to store the frequency of digits (0-9)
        int[] frequency = new int[10];

        // Find the digits in the number and calculate frequency
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            frequency[digit]++; // Increment the frequency of the digit
            number /= 10; // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
