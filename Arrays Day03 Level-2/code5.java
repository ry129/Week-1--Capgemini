import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to a string to easily count the number of digits
        String numStr = String.valueOf(number);
        int numDigits = numStr.length();

        // Array to store the digits
        int[] digits = new int[numDigits];

        // Extract each digit and store it in the array
        for (int i = 0; i < numDigits; i++) {
            digits[i] = number % 10;  // Get the last digit
            number = number / 10;     // Remove the last digit
        }

        // Array to store the digits in reverse order
        int[] reversedDigits = new int[numDigits];

        // Store digits in reverse order
        for (int i = 0; i < numDigits; i++) {
            reversedDigits[i] = digits[numDigits - 1 - i];  // Reverse the order
        }

        // Display the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < numDigits; i++) {
            System.out.print(reversedDigits[i]);
        }

        scanner.close();
    }
}