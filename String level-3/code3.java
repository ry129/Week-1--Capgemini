import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop through the text to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeating(text);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }
}
