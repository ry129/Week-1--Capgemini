import java.util.*;

public class WordLengthProgram {

    // Method to find and return a string's length without using length() method
    public static int getLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (Exception e) {
            // Exception occurs when accessing out of bounds
        }
        return length;
    }

    // Method to split the text into words using charAt() without split() method
    public static String[] splitWords(String text) {
        int wordCount = 1; // At least one word
        int textLength = getLength(text);

        // Count the number of spaces to determine word count
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String currentWord = "";
        int index = 0;

        // Extract words based on spaces
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                if (!currentWord.isEmpty()) {
                    words[index] = currentWord;
                    index++;
                    currentWord = "";
                }
            } else {
                currentWord += text.charAt(i);
            }
        }

        if (!currentWord.isEmpty()) {
            words[index] = currentWord; // Add the last word
        }

        return words;
    }

    // Method to generate a 2D array with words and their lengths
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(getLength(words[i])); // Word length as String
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayWordLengthArray(String[][] wordLengthArray) {
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("---------------------------");
        for (String[] row : wordLengthArray) {
            System.out.printf("%-15s %-10d\n", row[0], Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Split words using custom splitWords() method
        String[] words = splitWords(text);

        // Generate 2D array with words and their lengths
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Display the result in tabular format
        displayWordLengthArray(wordLengthArray);
    }
}
