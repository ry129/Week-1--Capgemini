import java.util.*;
class IsPalindrome{
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            // Prompt user for input
            System.out.println("Please enter the string you want to check:");
            String example = input.nextLine();
    
            // Check if the string is a palindrome
            if (isPalindrome(example)) {
                System.out.println("The given string \"" + example + "\" is a palindrome.");
            } else {
                System.out.println("The given string \"" + example + "\" is not a palindrome.");
            }
    
            input.close();
        }
    
        // Method to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            str = str.toLowerCase().replaceAll("[^a-z0-9]", ""); // Remove non-alphanumeric characters
            int start = 0;
            int end = str.length() - 1;
    
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
}