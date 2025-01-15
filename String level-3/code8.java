import java.util.Arrays;
import java.util.Scanner;

public class Anagrams{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        boolean isAnagram = checkAnagram(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);
        sc.close();
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] frequency = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
            frequency[str2.charAt(i)]--;
        }
        for (int count : frequency) {
            if (count != 0) return false;
        }
        return true;
    }
}
