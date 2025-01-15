import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacterType(ch);

            // Increment the appropriate counter
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts in an array
        return new int[]{vowelCount, consonantCount};
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Get the counts of vowels and consonants
        int[] counts = countVowelsAndConsonants(input);

        // Display the result
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
}
