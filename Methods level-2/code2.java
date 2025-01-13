import java.util.Scanner;

public class NaturalNumberSum {
    
    // Recursive method to calculate sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    // Method to calculate sum of n natural numbers using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Input is not a natural number. Exiting program.");
            return;
        }
        
        // Calculate sums
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);
        
        // Display results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        
        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results match. The calculations are correct.");
        } else {
            System.out.println("The results do not match. Please check the implementation.");
        }

        scanner.close();
    }
}
