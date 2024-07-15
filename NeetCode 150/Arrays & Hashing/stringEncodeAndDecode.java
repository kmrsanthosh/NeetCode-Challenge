// Solved On: 15/07/2024

// Question:
// An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

// Example 1:
//     Input: ["neet","code","love","you"]
//     Output: ["neet","code","love","you"]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class stringEncodeAndDecode {

    static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    static List<String> decode(String str) {

        int i = 0, j = 0;
        List<String> result = new LinkedList<>();

        while (i < str.length()) {
            j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.valueOf(str.substring(i, j));

            i = j + 1 + length;

            result.add(str.substring(j + 1, i));

        }

        return result;
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(Arrays.asList("neet", "code", "love", "you"));
        String encodedStrs = encode(strs);
        System.out.println("The encoded string is: " + encodedStrs);
        List<String> decodedStrs = decode(encodedStrs);
        System.out.println("The decoded string is: " + decodedStrs);

    }

}
