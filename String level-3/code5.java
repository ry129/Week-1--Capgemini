import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int n = text.length();
        char[] unique = new char[n];
        int uniqueIndex = 0;

        for (int i = 0; i < n; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character already exists in the unique array
            for (int j = 0; j < uniqueIndex; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the unique array
            if (isUnique) {
                unique[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }

        // Resize the array to only include the unique characters
        char[] result = new char[uniqueIndex];
        System.arraycopy(unique, 0, result, 0, uniqueIndex);

        return result;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text); // Find unique characters
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and calculate their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            int count = 0;

            // Count the occurrences of the unique character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChar) {
                    count++;
                }
            }

            result[i][0] = String.valueOf(uniqueChar); // Store the character
            result[i][1] = String.valueOf(count); // Store the frequency
        }

        return result;
    }

    // Method to display the result in a tabular format
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

        // Find the frequency of unique characters
        String[][] result = findCharacterFrequency(text);

        // Display the result
        displayFrequency(result);
    }
}
