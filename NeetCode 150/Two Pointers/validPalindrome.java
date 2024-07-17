// Solved On: 17/07/2024

// Question:
// Given a string s, return true if it is a palindrome, otherwise return false.
// A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

// Example 1:
//     Input: s = "Was it a car or a cat I saw?"
//     Output: true

public class validPalindrome {

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (!Character.isLetterOrDigit(s.charAt(l)) && l < r)
                l++;

            while (!Character.isLetterOrDigit(s.charAt(r)) && l < r)
                r--;

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
}
