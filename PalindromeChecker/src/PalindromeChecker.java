public class PalindromeChecker {
    // Method to check if a string is a palindrome using two pointers
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // Method to check if a string is a palindrome by reversing and comparing
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        String word = "kayak"; // The word to be checked

        // Check if the word is a palindrome using the first method
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindromic word.");
        } else {
            System.out.println(word + " is not a palindromic word.");
        }
    }
}