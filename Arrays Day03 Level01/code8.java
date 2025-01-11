import java.util.Scanner;

class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Validate the input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Initialize variables for factors array
        int maxFactor = 10; // Initial size of the array
        int[] factors = new int[maxFactor];
        int index = 0; // Tracks the index of the factors array

        // Find factors and store in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add factor to the array
                if (index == maxFactor) {
                    // Resize the array if full
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor]; // Temporary array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j]; // Copy elements to temp
                    }
                    factors = temp; // Reassign temp to factors
                }
                factors[index++] = i; // Store the factor and increment index
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
