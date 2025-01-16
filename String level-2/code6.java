import java.util.Scanner;

public class VowelConsonantFinder {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert character to lowercase if it is uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check if the character is a consonant
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // Not a letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String str) {
        int length = str.length(); // Get the string length
        String[][] result = new String[length][2]; // Create a 2D array to store characters and their types

        // Iterate through each character in the string
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch); // Store the character
            result[i][1] = checkCharacterType(ch); // Store the type (Vowel, Consonant, or Not a Letter)
        }

        return result; // Return the 2D array
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("----------------------------");

        for (String[] row : table) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Find vowels and consonants
        String[][] result = findVowelsAndConsonants(input);

        // Display the result in a tabular format
        displayTable(result);
    }
}
