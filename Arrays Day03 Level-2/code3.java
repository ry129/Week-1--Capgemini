import java.util.Scanner;

 class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable to store the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define the maximum size of the array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits and store them in the array
        while (number != 0) {
            digits[index] = number % 10;  // Get the last digit
            number = number / 10;         // Remove the last digit
            index++;

            // If the index reaches the maximum number of digits, stop the loop
            if (index == maxDigit) {
                break;
            }
        }

        // Variables to store the largest and second largest digit
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = digits[i];      // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];  // Update second largest if valid
            }
        }

        // Display the results
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);

        scanner.close();
    }
}