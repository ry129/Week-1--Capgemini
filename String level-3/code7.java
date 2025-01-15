import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = sc.nextLine();

        boolean isPalindromeLogic1 = checkPalindrome(input);
        boolean isPalindromeLogic2 = checkPalindromeRecursively(input, 0, input.length() - 1);
        boolean isPalindromeLogic3 = checkPalindromeUsingReverse(input);

        System.out.println("Logic 1: " + isPalindromeLogic1);
        System.out.println("Logic 2: " + isPalindromeLogic2);
        System.out.println("Logic 3: " + isPalindromeLogic3);
        sc.close();
    }

    // Logic 1: Compare start and end characters
    public static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }

    // Logic 2: Recursion
    public static boolean checkPalindromeRecursively(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return checkPalindromeRecursively(str, start + 1, end - 1);
    }

    // Logic 3: Reverse the string and compare
    public static boolean checkPalindromeUsingReverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return str.equals(reversed.toString());
    }
}
