import java.util.*;

public class ShortestLongestWords {

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

    // Method to split the text into words using charAt() without using split() method
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

    // Method to find the shortest and longest words in a 2D array
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] row : wordLengthArray) {
            int length = Integer.parseInt(row[1]);
            if (length < shortestLength) {
                shortestWord = row[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longestWord = row[0];
                longestLength = length;
            }
        }

        return new String[]{shortestWord, longestWord};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Split words using custom splitWords() method
        String[] words = splitWords(text);

        // Generate 2D array with words and their lengths
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Find the shortest and longest words
        String[] result = findShortestAndLongest(wordLengthArray);

        // Display the results
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
