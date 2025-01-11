import java.util.Scanner;

 class LargestAndSecondLargest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable to store the input number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();  // Use long to handle larger numbers

        // Define the initial size of the array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits and store them in the array
        while (number != 0) {
            // Get the last digit
            digits[index] = (int) (number % 10);
            // Remove the last digit
            number = number / 10;
            index++;

            // If the index reaches the maxDigit size, resize the array
            if (index == maxDigit) {
                maxDigit += 10;  // Increase the array size by 10
                // Create a new temporary array with the increased size
                int[] temp = new int[maxDigit];
                // Copy elements from the old array to the new one
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Assign the new array back to digits
                digits = temp;
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