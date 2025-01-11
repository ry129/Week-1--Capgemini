import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store up to 10 elements of type double
        double[] numbers = new double[10];
        double total = 0.0; // Variable to store the total sum
        int index = 0;      // Index variable initialized to 0

        // Input phase using an infinite while loop
        System.out.println("Enter up to 10 positive numbers. Enter 0 or a negative number to stop:");
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Check if the user entered 0 or a negative number
            if (num <= 0) {
                break; // Exit the loop
            }

            // Check if the array is full
            if (index == 10) {
                System.out.println("Array is full. No more numbers can be entered.");
                break; // Exit the loop
            }

            // Store the number in the array and increment the index
            numbers[index] = num;
            index++;
        }

        // Calculate the sum of all stored numbers
        System.out.println("\nThe numbers entered are:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i]; // Add each number to the total
        }

        // Display the total sum
        System.out.println("\nThe total sum of the numbers is: " + total);
    }
}
