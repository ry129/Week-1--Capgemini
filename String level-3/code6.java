import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray(); // Convert the string to a character array
        int[] freq = new int[chars.length]; // Array to store frequency
        boolean[] visited = new boolean[chars.length]; // Track visited characters

        // Initialize the frequency array and visited array
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            visited[i] = false;
        }

        // Nested loop to find frequency
        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) {
                continue; // Skip already visited characters
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    visited[j] = true; // Mark duplicate character as visited
                }
            }
        }

        // Store characters and their frequencies in a result array
        int resultSize = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                resultSize++;
            }
        }

        String[] result = new String[resultSize];
        int resultIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                result[resultIndex] = chars[i] + ": " + freq[i];
                resultIndex++;
            }
        }

        return result;
    }

    // Method to display the result
    public static void displayResult(String[] frequencyArray) {
        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (String entry : frequencyArray) {
            System.out.println(entry.replace(": ", "        | "));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find the frequency of characters
        String[] frequencyResult = findCharacterFrequency(text);

        // Display the result
        displayResult(frequencyResult);
    }
}
