package CoreJava;



//# String Reversal and Palindrome Check Program

import java.util.Scanner;

public class P020_ReverseStringAndCheckPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    /**
     * Reverses a given string.
     *
     * @param str the input string
     * @return the reversed string
     */
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    /**
     * Checks if a given string is a palindrome.
     *
     * @param str the input string
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);

        return str.equalsIgnoreCase(reversed);
    }
}
