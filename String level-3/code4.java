import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop through the text to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count unique characters to create a result array of appropriate size
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store the character
                result[index][1] = String.valueOf(frequency[i]); // Store the frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayFrequency(String[][] frequencyArray) {
        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (String[] row : frequencyArray) {
            System.out.printf("%9s | %9s\n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find the frequency of characters
        String[][] result = findCharacterFrequency(text);

        // Display the result
        displayFrequency(result);
    }
}
